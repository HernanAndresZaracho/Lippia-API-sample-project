package ar.validator;

import api.model.Project.ProjectResponse;
import api.model.TimeEntries.TimeEntriesResponse;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;
import services.BaseService;

public class TimeEntriesValidator {
    public static void validate(){
        TimeEntriesResponse[] response = (TimeEntriesResponse[]) APIManager.getLastResponse().getResponse();
        Assert.assertNotNull(response[0].getId(),"El campo ID es nulo");
    }
    public static void validateDuration(String duration){
        TimeEntriesResponse[] response = (TimeEntriesResponse[]) APIManager.getLastResponse().getResponse();
        Assert.assertEquals(response[0].getTimeInterval().get(2), duration);
    }
    public static void validateDescripcion(){
        TimeEntriesResponse[] response = (TimeEntriesResponse[]) APIManager.getLastResponse().getResponse();
        Assert.assertEquals(response[0].getDescription(), BaseService.ADD_TIME_DESC.get());
    }

}
