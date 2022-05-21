package services;

import api.model.Project.ProjectResponse;
import api.model.workspaces.WorkspacesResponse;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

public class ProjectService extends MethodsService {
    public static Response get(String jsonName) {
        return get(jsonName, ProjectResponse[].class);
    }

}
