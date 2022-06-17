package services;

import api.model.Project.ProjectResponse;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

public class TimeEntriesService extends BaseService {
    public static Response get(String jsonName) {
        return get(jsonName, TimeEntriesService[].class, setParamsUserId());
    }
    public static Response post(String jsonName) {
        return post(jsonName, TimeEntriesService.class, setParamsUserIdAdd());
    }
}
