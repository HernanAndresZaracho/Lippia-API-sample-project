package services;

import api.model.Project.ProjectResponse;
import com.crowdar.api.rest.Response;

import java.util.Map;

public class ProjectIdService extends BaseService {
    public static Response get(String jsonName) {
        return get(jsonName, ProjectResponse.class, setParamsProjectId());
    }
}
