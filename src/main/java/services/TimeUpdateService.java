package services;

import api.model.TimeEntries.TimeEntriesResponse;
import com.crowdar.api.rest.Response;

public class TimeUpdateService extends BaseService {
    public static Response put(String jsonName) {
        return put(jsonName, TimeEntriesResponse.class, setParamsUserUpdate());
    }
}
