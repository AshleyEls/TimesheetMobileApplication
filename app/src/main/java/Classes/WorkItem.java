package Classes;

/**
 * Created by Elana on 2015/09/29.
 */
public class WorkItem
{
    public String Customer;
    public String Project;
    public String Task;
    public String Description;
    public double Hours;

    public String getCustomer() {
        return Customer;
    }

    public void setCustomer(String customer) {
        Customer = customer;
    }

    public String getProject() {
        return Project;
    }

    public void setProject(String project) {
        Project = project;
    }

    public String getTask() {
        return Task;
    }

    public void setTask(String task) {
        Task = task;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public double getHours() {
        return Hours;
    }

    public void setHours(double hours) {
        Hours = hours;
    }

    public WorkItem(String customer, String project, String task, String description, double hours)
    {
        this.Customer = customer;
        this.Project = project;
        this.Task = task;
        this.Description = description;
        this.Hours = hours;

    }

    public WorkItem()
    {

    }
}
