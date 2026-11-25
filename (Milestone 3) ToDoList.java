//********************************************************************
//File Name: ToDoList.java
//Project: To Do List
//Course: CS 113 - Introduction to Computer Science I
//Semester: Fall 2026
//
//Group Members:
//1. Subomi Adelana
//2. Liza Naas
//3. Jeshan Ahmad
//
//Milestone 3: Java concepts & program design
//
//Description:
//This program allows users to manage tasks and assign priorities.
//
//Features:
//1. Add a new task with a priority
//2. View tasks
//3. Mark a task as completed
//4. Edit a task
//5. Delete a task
//6. Quit
//********************************************************************
import java.util.Scanner;

public class ToDoList
{
    //Store multiple tasks in an array
    private static Task[] tasks = new Task[100];
    private static int taskCount = 0;
    private static Scanner scan = new Scanner(System.in);

    public static void main (String[] args)
    {
        int choice;

        //display the program title
        System.out.println ("-----------------------------");
        System.out.println ("       TO DO LIST");
        System.out.println ("-----------------------------");

        //Keep displaying the menu until the user chooses to quit
        do
        {
            displayMenu();
            System.out.print ("Choose an option: ");

            //Check that the user enters a number
            while (!scan.hasNextInt())
            {
                System.out.println ("Please enter a number from 1 to 6.");
                scan.nextLine();
                System.out.print ("Choose an option: ");
            }

            choice = scan.nextInt();
            scan.nextLine();

            if (choice == 1)
            {
                addTask();
            }
            else if (choice == 2)
            {
                viewTasks();
            }
            else if (choice == 3)
            {
                completeTask();
            }
            else if (choice == 4)
            {
                editTask();
            }
            else if (choice == 5)
            {
                deleteTask();
            }
            else if (choice == 6)
            {
                //Exit the program when the user chooses 6
                System.out.println ("Thank you for using the To Do List!");
            }
            else
            {
                //Display an error for invalid menu choices
                System.out.println ("Invalid option. Please choose 1, 2, 3, 4, 5, or 6.");
            }
        } while (choice != 6);
        scan.close();
    }

    //Display the updated menu
    private static void displayMenu()
    {
        System.out.println ();
        System.out.println ("1. Add a task");
        System.out.println ("2. View tasks");
        System.out.println ("3. Mark task as completed");
        System.out.println ("4. Edit a task");
        System.out.println ("5. Delete a task");
        System.out.println ("6. Quit");
    }

    //Add a task with a priority
    private static void addTask()
    {
        //Check if the task list has space
        if (taskCount < tasks.length)
        {
            System.out.print ("Enter a task: ");
            String task = scan.nextLine();

            //Prevent the user from adding an empty task
            if (task.trim().isEmpty())
            {
                System.out.println ("Task cannot be empty.");
            }
            else
            {
                System.out.print ("Enter priority (1 = High, 2 = Medium, 3 = Low): ");
                while (!scan.hasNextInt())
                {
                    System.out.println ("Please enter 1, 2, or 3.");
                    scan.nextLine();
                    System.out.print ("Enter priority: ");
                }
                int priority = scan.nextInt();
                scan.nextLine();

                if (priority >= 1 && priority <= 3)
                {
                    //Save the new task and update the task count
                    tasks[taskCount] = new Task(task, priority);
                    taskCount++;
                    System.out.println ();
                    System.out.println ("Task added: " + task);
                }
                else
                {
                    System.out.println ("Invalid priority. Task was not added.");
                }
            }
        }
        else
        {
            System.out.println ("Your task list is full.");
        }
    }

    //Display all saved tasks
    private static void viewTasks()
    {
        if (taskCount == 0)
        {
            System.out.println ("You have no tasks yet.");
        }
        else
        {
            System.out.println ();
            System.out.println ("------ YOUR TASKS ------");

            //Go through the array and print each task
            for (int i = 0; i < taskCount; i++)
            {
                System.out.println ((i + 1) + ". " + tasks[i]);
            }
        }
    }

    //Show the task numbers so the user can choose one
    private static int readTaskNumber(String action)
    {
        viewTasks();
        System.out.print ("Enter the task number to " + action + ": ");
        while (!scan.hasNextInt())
        {
            System.out.println ("Please enter a valid task number.");
            scan.nextLine();
            System.out.print ("Enter the task number to " + action + ": ");
        }
        int taskNumber = scan.nextInt();
        scan.nextLine();
        return taskNumber;
    }

    //Mark a task as completed
    private static void completeTask()
    {
        if (taskCount == 0)
        {
            System.out.println ("You have no tasks to complete.");
        }
        else
        {
            int taskNumber = readTaskNumber("complete");

            //Check if the selected task number exists
            if (taskNumber >= 1 && taskNumber <= taskCount)
            {
                if (tasks[taskNumber - 1].isCompleted())
                {
                    System.out.println ("This task is already completed.");
                }
                else
                {
                    //Change the selected task to completed
                    tasks[taskNumber - 1].markCompleted();
                    System.out.println ("Task marked as completed: "
                        + tasks[taskNumber - 1].getDescription());
                }
            }
            else
            {
                System.out.println ("Invalid task number.");
            }
        }
    }

    //Edit the description of an existing task
    private static void editTask()
    {
        if (taskCount == 0)
        {
            System.out.println ("You have no tasks to edit.");
        }
        else
        {
            int taskNumber = readTaskNumber("edit");
            if (taskNumber >= 1 && taskNumber <= taskCount)
            {
                System.out.print ("Enter the new task description: ");
                String newDescription = scan.nextLine();
                if (!newDescription.trim().isEmpty())
                {
                    tasks[taskNumber - 1].setDescription(newDescription);
                    System.out.println ("Task updated.");
                }
                else
                {
                    System.out.println ("Task cannot be empty.");
                }
            }
            else
            {
                System.out.println ("Invalid task number.");
            }
        }
    }

    //Delete a task and shift the remaining tasks forward
    private static void deleteTask()
    {
        if (taskCount == 0)
        {
            System.out.println ("You have no tasks to delete.");
        }
        else
        {
            int taskNumber = readTaskNumber("delete");
            if (taskNumber >= 1 && taskNumber <= taskCount)
            {
                String deletedTask = tasks[taskNumber - 1].getDescription();
                for (int i = taskNumber - 1; i < taskCount - 1; i++)
                {
                    tasks[i] = tasks[i + 1];
                }
                tasks[taskCount - 1] = null;
                taskCount--;
                System.out.println ("Task deleted: " + deletedTask);
            }
            else
            {
                System.out.println ("Invalid task number.");
            }
        }
    }
}
