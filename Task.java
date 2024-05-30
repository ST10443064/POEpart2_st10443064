/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lab_services_student
 */
public class Task {
    private String taskName;
    private int TaskNumber;
    private String TaskDescription;
    private String DeveloperDetails;
    private double TaskDuration;
    private String TaskID;
    private String TaskStatus;

    public Task(String taskName, int TaskNumber, String TaskDescription, String DeveloperDetails, double TaskDuration, String TaskID, String TaskStatus) {
        this.taskName = taskName;
        this.TaskNumber = TaskNumber;
        this.TaskDescription = TaskDescription;
        this.DeveloperDetails = DeveloperDetails;
        this.TaskDuration = TaskDuration;
        this.TaskID = TaskID;
        this.TaskStatus = TaskStatus;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getTaskNumber() {
        return TaskNumber;
    }

    public void setTaskNumber(int TaskNumber) {
        this.TaskNumber = TaskNumber;
    }

    public String getTaskDescription() {
        return TaskDescription;
    }

    public void setTaskDescription(String TaskDescription) {
        this.TaskDescription = TaskDescription;
    }

    public String getDeveloperDetails() {
        return DeveloperDetails;
    }

    public void setDeveloperDetails(String DeveloperDetails) {
        this.DeveloperDetails = DeveloperDetails;
    }

    public double returnTotalHours() {
        return TaskDuration;
    }

    public void setTaskDuration(double TaskDuration) {
        this.TaskDuration = TaskDuration;
    }

    public String getTaskID() {
        return TaskID;
    }

    public void setTaskID(String TaskID) {
        this.TaskID = TaskID;
    }

    public String getTaskStatus() {
        return TaskStatus;
    }

    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }
    
    public boolean checkTaskDescription(){
        if (this.TaskDescription.length()>50){
       return true;
    }
        else{
            return false;
        }
        
    }
    public String TaskID(){
        String Taskid= this.taskName.substring(0,2)+":"+this.TaskNumber+":"+this.DeveloperDetails.substring(this.DeveloperDetails.length()-4,this.DeveloperDetails.length()-1);
        return TaskID;
        
        
        
    }

    
    public String printTaskDetails() {
        return "Task{" + "taskName=" + taskName + ", TaskNumber=" + TaskNumber + ", TaskDescription=" + TaskDescription + ", DeveloperDetails=" + DeveloperDetails + ", TaskDuration=" + TaskDuration + ", TaskID=" + TaskID + ", TaskStatus=" + TaskStatus + '}';
    }
    
    
}
