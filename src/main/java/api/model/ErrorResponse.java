package api.model;

import java.util.Date;

public class ErrorResponse {
    Date date = new Date();
    private String message;
    private Integer code;
    private String timestamp;
    private Integer status;
    private String error;
    private String path;

    public String getTimestamp(){
        return timestamp;
    }
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
    public String getPath(){
        return path;
    }
    public void setPath(String path) {
        this.path = "/v1/workspaces//projects/";
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    public Integer getStatus() {
        return status;
    }
    public String getError(){
        return error;
    }
    public void setError(String error) {
        this.error = error;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
