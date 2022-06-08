package ar.validator;


import api.model.Project.ProjectError404;
import api.model.Project.ProjectResponse;
import api.model.workspaces.WorkspacesResponse;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;

public class ProjectValidator {
    public static void validateWorkspace(){
        WorkspacesResponse[] response = (WorkspacesResponse[]) APIManager.getLastResponse().getResponse();
        Assert.assertNotNull(response[0].getId(),"El campo ID es nulo");
    }
    //Si no exiten projets, la clase será nula y por lo tanto falsa
    public static void validateProject(){
        ProjectResponse[] response = (ProjectResponse[]) APIManager.getLastResponse().getResponse();
        Assert.assertNotNull(response[0].getId(),"El campo ID es nulo");
    }
    public static void validateProjectId(){
        ProjectResponse response = (ProjectResponse) APIManager.getLastResponse().getResponse();
        Assert.assertNotNull(response.getId(),"El campo ID es nulo");
    }
    public static void validateAddProject(String nombre){
        ProjectResponse response = (ProjectResponse) APIManager.getLastResponse().getResponse();
        Assert.assertEquals(response.getName(), nombre); //nombre
    }
    public static void validateUpdProject(String nombre, String color){
        ProjectResponse response = (ProjectResponse) APIManager.getLastResponse().getResponse();
        Assert.assertEquals(response.getName(), nombre); //nombre
        Assert.assertEquals(response.getColor(), color); //color
    }
    public static void validateError404(){
        ProjectError404 response = (ProjectError404) APIManager.getLastResponse().getResponse();
        Assert.assertNotNull(response.getTimestamp()); //fecha
        Assert.assertEquals(Integer.toString(response.getStatus()),"404"); //status
        Assert.assertEquals(response.getError(),"Not Found"); // message
        Assert.assertEquals(response.getPath(),"/v1/workspaces//projects/"); //endpoint
    }
}