//********************************************************************
//File Name: Task.java
//Description: Stores the description, completion status and priority.
//********************************************************************
public class Task
{
    private String description;
    private boolean completed;
    private int priority;

    // Constructor
    public Task(String description, int priority)
    {
        this.description = description;
        this.priority = priority;
        completed = false;
    }

    // Return task description
    public String getDescription()
    {
        return description;
    }

    // Update task description
    public void setDescription(String description)
    {
        this.description = description;
    }

    // Check if task is completed
    public boolean isCompleted()
    {
        return completed;
    }

    // Mark task as completed
    public void markCompleted()
    {
        completed = true;
    }

    // Return priority
    public int getPriority()
    {
        return priority;
    }

    // Return task information
    public String toString()
    {
        String priorityName;

        if (priority == 1)
        {
            priorityName = "High";
        }
        else if (priority == 2)
        {
            priorityName = "Medium";
        }
        else
        {
            priorityName = "Low";
        }

        if (completed)
        {
            return description + " - Completed - Priority: " + priorityName;
        }
        else
        {
            return description + " - Not completed - Priority: " + priorityName;
        }
    }
}
