package ar.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.PropertyManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import services.BaseService;

import static ar.validator.TimeEntriesValidator.*;

public class TimeEntries extends PageSteps {
    @Given("Los datos proporcionados correctos")
    public void losDatosProporcionadosCorrectos() {
        BaseService.API_KEY.set(PropertyManager.getProperty("api-key"));
        BaseService.W_SPACE.set(PropertyManager.getProperty("w-space"));
        BaseService.P_ID.set(PropertyManager.getProperty("p-id"));
        BaseService.USER_ID.set(PropertyManager.getProperty("user-id"));
    }

    @And("Consulta las (.*) del proyecto")
    public void consultaLasHorasDelProyecto(String duracion) {
        validateDuration(duracion);
    }

    @When("Se agrega una (.*) al time entry")
    public void seAgregaUnaDescripcion(String descripcion) {
        BaseService.TIME_DESC.set(descripcion);
    }

    @Then("Se verifica que la hora agregada tenga (.*) colocada")
    public void seVerificaLaDescripcion(String descripcion) {
        validateAdd(descripcion);
    }

    @When("Se busca el proyecto por (.*)")
    public void seBuscaElProyectoPorDescripcion(String descripcion) {
        buscarDescripcion(descripcion);
    }

    @And("Se reemplaza por la (.*)")
    public void seReemplazaPorLaNuevaDescripcion(String nuevaDescripcion) {
        BaseService.TIME_DESC.set(nuevaDescripcion);
    }

    @Then("Se verifica que la (.*) se establecio")
    public void seVerificaQueLaNuevaDescripcionSeEstablecio(String nuevaDescripcion) {
        validateDescripcion(nuevaDescripcion);
    }
}
