package services;

import api.model.TimeEntries.TimeEntriesResponse;
import com.crowdar.api.rest.Response;

public class TimeConsultService extends BaseService {
    public static Response get(String jsonName) {
        return get(jsonName, TimeEntriesResponse[].class, setParamsUserConsult());
    }
}
