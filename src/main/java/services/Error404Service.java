package services;

import api.model.ErrorResponse;
import com.crowdar.api.rest.Response;

public class Error404Service extends BaseService {
    public static Response get(String jsonName) {
        return get(jsonName, ErrorResponse.class,setParams());
    }
}
