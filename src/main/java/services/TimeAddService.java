package services;

import api.model.TimeEntries.TimeEntriesResponse;
import com.crowdar.api.rest.Response;

public class TimeAddService extends BaseService {
    public static Response post(String jsonName) {
        return post(jsonName, TimeEntriesResponse.class, setParamsUserAdd());
    }
}
