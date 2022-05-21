package services;

import api.model.Project.ProjectResponse;
import api.model.workspaces.WorkspacesResponse;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;

public class ProjectService extends MethodsService {

    public static final ThreadLocal<String> API_KEY = new ThreadLocal<String>();
    public static final ThreadLocal<String> W_SPACE = new ThreadLocal<String>();
    public static Response get(String jsonName, Map<String,String> params) {
        return get(jsonName, ProjectResponse[].class, params);
    }

    private static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("url", PropertyManager.getProperty("base.api.url"));
        params.put("key",API_KEY.get());
        params.put("workspace",W_SPACE.get());
        return params;
    }

    public static Response get(String jsonName) {
        return get(jsonName, ProjectResponse[].class, setParams());
    }

}
