package services;

import api.model.Project.ProjectResponse;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;

public class ProjectServiceId extends BaseService {


    public static Response get(String jsonName, Map<String,String> params) {
        return get(jsonName, ProjectResponse[].class, params);
    }

    private static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("base.url", PropertyManager.getProperty("base.api.url"));
        params.put("api-key",API_KEY.get());
        params.put("workspace",W_SPACE.get());
        params.put("p-id",PropertyManager.getProperty("p-id"));
        return params;
    }

    public static Response get(String jsonName) {
        return get(jsonName, ProjectResponse[].class, setParams());
    }

}
