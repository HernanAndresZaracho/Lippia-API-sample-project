package ar.validator;

import api.model.Project.ProjectResponse;
import com.crowdar.api.rest.APIManager;

public class ProjectValidator {
    public void printProject(){
        ProjectResponse[] responses = (ProjectResponse[]) APIManager.getLastResponse().getResponse();
        for (ProjectResponse project :responses){
            System.out.print(project.getName());
        }
    }
}
