package ar.steps;

import ar.validator.WorkspaceValidator;
import com.crowdar.core.PageSteps;
import com.crowdar.core.PropertyManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.BaseService;

import static ar.validator.ProjectValidator.*;

public class ProjectSteps extends PageSteps {
    @Given("Un api-key valido")
    public void unApiKeyValido() {
        BaseService.API_KEY.set(PropertyManager.getProperty("api-key"));
    }
    @Given("X-Api-Key invalido")
    public void xApiKeyInvalido() {
        BaseService.API_KEY.set("NDRmZWUwYzEtOTZhMS00NDk5LWJkZWItY2FiNmY1MjQ3NGN");
    }
    @And("Un workspace-id")
    public void unWorkspaceId() {
        BaseService.W_SPACE.set(PropertyManager.getProperty("w-space"));

    }
    @And("Un workspace-id invalido")
    public void unWorkspaceIdInvalido() {
        BaseService.W_SPACE.set("628418d1de42d9011b50949d1");

    }
    @And("Un workspace-id vacio")
    public void unWorkspaceIdVacio() {
        BaseService.W_SPACE.set("");
    }

    @Then("Se valida que existen projectos")
    public void seValidaQueExistenProjectos() {
        validateProject();
    }

    @And("Un projectId valido")
    public void unProjectIdValido() {
        BaseService.P_ID.set(PropertyManager.getProperty("p-id"));
    }

    @Then("Se valida que existe el project")
    public void seValidaQueExisteElProject() {
        validateProjectId();
    }
}
