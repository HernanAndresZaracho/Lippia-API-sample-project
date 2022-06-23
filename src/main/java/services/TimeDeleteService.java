package services;

import api.model.TimeEntries.TimeEntriesResponse;
import com.crowdar.api.rest.Response;

public class TimeDeleteService extends BaseService {
    public static Response delete(String jsonName) {
        return delete(jsonName, TimeEntriesResponse.class, setParamsUserDelete());
    }
}
