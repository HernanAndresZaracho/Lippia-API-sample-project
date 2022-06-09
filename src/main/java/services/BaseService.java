package services;

import com.crowdar.api.rest.MethodsService;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;

public class BaseService extends MethodsService {

    public static final ThreadLocal<String> API_KEY = new ThreadLocal<String>();
    public static final ThreadLocal<String> W_SPACE = new ThreadLocal<String>();
    public static final ThreadLocal<String> P_ID = new ThreadLocal<String>();

    protected static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("base.url", PropertyManager.getProperty("base.api.url"));
        params.put("api-key",API_KEY.get());
        params.put("workspace",W_SPACE.get());
        return params;
    }
    protected static Map<String, String> setParamsProjectId() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("base.url", PropertyManager.getProperty("base.api.url"));
        params.put("api-key",API_KEY.get());
        params.put("workspace",W_SPACE.get());
        params.put("p-id",P_ID.get());
        return params;
    }
}
