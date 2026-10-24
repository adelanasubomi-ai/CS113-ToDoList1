//********************************************************************
//File Name: Task.java
//
//Description:
//This class represents an individual task in the To Do List.
//It stores the task description and whether the task is completed.
//
//********************************************************************

public class Task
{
    private String description;
    private boolean completed;

    //Constructor to create a new task
    public Task(String description)
    {
        this.description = description;
        completed = false;
    }

    //Return the task description
    public String getDescription()
    {
        return description;
    }

    //Check whether the task is completed
    public boolean isCompleted()
    {
        return completed;
    }

    //Mark the task as completed
    public void markCompleted()
    {
        completed = true;
    }

    //Return the task information
    public String toString()
    {
        if (completed)
        {
            return description + " - Completed";
        }
        else
        {
            return description + " - Not completed";
        }
    }
}
