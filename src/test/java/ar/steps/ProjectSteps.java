package ar.steps;

import ar.validator.ProjectValidator;
import ar.validator.WorkspaceValidator;
import com.crowdar.core.PageSteps;
import com.crowdar.core.PropertyManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.BaseService;
import services.ProjectService;

public class ProjectSteps extends PageSteps {
    ProjectValidator validator = new ProjectValidator();

    @Given("Un api-key valido")
    public void unApiKeyValido() {
        BaseService.API_KEY.set(PropertyManager.getProperty("api-key"));
    }

    @And("Un workspace-id")
    public void unWorkspaceId() {
        BaseService.W_SPACE.set(PropertyManager.getProperty("w-space"));

    }

    @And("Un workspace-id invalido")
    public void unWorkspaceIdInvalido() {
        BaseService.W_SPACE.set("628418d1de42d9011b50949d1");

    }
    @Then("se muestran los project del perfil")
    public void seMuestranLosProjectDelPerfil() {
        validator.printProject();
    }

    @And("Un workspace-id vacio")
    public void unWorkspaceIdVacio() {
        BaseService.W_SPACE.set("");
    }
}
