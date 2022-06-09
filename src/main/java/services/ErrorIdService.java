package services;

import api.model.ErrorResponse;
import com.crowdar.api.rest.Response;

public class ErrorIdService extends BaseService {
    public static Response get(String jsonName) {
        return get(jsonName, ErrorResponse.class,setParamsProjectId());
    }
    public static Response put(String jsonName) {
        return put(jsonName, ErrorResponse.class,setParamsProjectId());
    }
}
