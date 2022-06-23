package ar.validator;

import api.model.Project.ProjectResponse;
import api.model.TimeEntries.TimeEntriesResponse;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;
import services.BaseService;

public class TimeEntriesValidator {
    public static void validateDuration(String duracion){
        TimeEntriesResponse[] response = (TimeEntriesResponse[]) APIManager.getLastResponse().getResponse();
        Assert.assertEquals(response[0].getTimeInterval().getDuration(),duracion);
    }
    public static void buscarDescripcion(String descripcion){
        TimeEntriesResponse[] responses = (TimeEntriesResponse[]) APIManager.getLastResponse().getResponse();
        for(TimeEntriesResponse response : responses){
            if(response.getDescription().equals(descripcion)){
                BaseService.TIME_ID.set(response.getId());
            }
        }
    }
    public static void validateDescripcion(String nuevaDescripcion){
        TimeEntriesResponse responses = (TimeEntriesResponse) APIManager.getLastResponse().getResponse();
        Assert.assertEquals(responses.getDescription(), nuevaDescripcion);
    }
    public static void validateAdd(String descripcion){
        TimeEntriesResponse responses = (TimeEntriesResponse) APIManager.getLastResponse().getResponse();
        Assert.assertEquals(responses.getDescription(), descripcion);
    }

}
