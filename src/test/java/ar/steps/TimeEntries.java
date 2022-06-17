package ar.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.PropertyManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import services.BaseService;
import services.TimeEntriesService;

import static ar.validator.ProjectValidator.*;
import static ar.validator.TimeEntriesValidator.*;

public class TimeEntries extends PageSteps {
    @Given("Los datos proporcionados correctos")
    public void losDatosProporcionadosCorrectos() {
        BaseService.API_KEY.set(PropertyManager.getProperty("api-key"));
        BaseService.W_SPACE.set(PropertyManager.getProperty("w-space"));
        BaseService.P_ID.set(PropertyManager.getProperty("p-id"));
        BaseService.USER_ID.set(PropertyManager.getProperty("user-id"));
    }

    @And("se verifica la (.*) del time entrie")
    public void seVerificaLaDuracionDelTimeEntrie(String duration) {
        //validateDuration(duration);
    }

    @When("Se agrega una (.*)")
    public void seAgregaUnaDescripcion(String descripcion) {
        BaseService.ADD_TIME_DESC.set(descripcion);
    }

    @Then("Se verifica la descripcion")
    public void seVerificaLaDescripcion() {
        validateDescripcion();
    }
}
