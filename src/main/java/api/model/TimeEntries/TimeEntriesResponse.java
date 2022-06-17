package api.model.TimeEntries;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TimeEntriesResponse {
    private String id;
    private String description;
    private TagIds tagIds;
    private String userId;
    private boolean billable;
    private String taskId;
    private String projectId;
    private List<TimeInterval> timeInterval;
    private String workspaceId;
    private CustomFieldValues customFieldValues;
    private boolean isLocked;


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TagIds getTagIds() {
        return tagIds;
    }

    public void setTagIds(TagIds tagIds) {
        this.tagIds = tagIds;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public boolean isBillable() {
        return billable;
    }

    public void setBillable(boolean billable) {
        this.billable = billable;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public List<TimeInterval> getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(List<TimeInterval> timeInterval) {
        this.timeInterval = timeInterval;
    }

    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public CustomFieldValues getCustomFieldValues() {
        return customFieldValues;
    }

    public void setCustomFieldValues(CustomFieldValues customFieldValues) {
        this.customFieldValues = customFieldValues;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }
}
