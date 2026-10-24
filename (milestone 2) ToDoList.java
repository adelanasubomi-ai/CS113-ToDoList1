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
//Milestone 2: Functional core
//
//Description:
//This program is the starter for our To Do List application.
//The final program will allow users to add tasks, view their tasks,
//and mark tasks as completed.
//
//Added Features:
//1. Add a new task
//2. View tasks that need to be completed
//3. Mark a task as completed
//
//********************************************************************

import java.util.Scanner;

public class ToDoList
{
    public static void main (String[] args)
    {
        String task;
        int choice;

        Scanner scan = new Scanner (System.in);

        //display the program title
        System.out.println ("-----------------------------");
        System.out.println ("       TO DO LIST");
        System.out.println ("-----------------------------");

        //Store multiple tasks in an array
        Task[] tasks = new Task[100];
        int taskCount = 0;

        //Keep displaying the menu until the user chooses to quit
        do
        {
            //display the starter menu
            System.out.println ();
            System.out.println ("1. Add a task");
            System.out.println ("2. View tasks");
            System.out.println ("3. Mark task as completed");
            System.out.println ("4. Quit");

            System.out.print ("Choose an option: ");

            //Check that the user enters a number
            while (!scan.hasNextInt())
            {
                System.out.println ("Please enter a number from 1 to 4.");
                scan.nextLine();
                System.out.print ("Choose an option: ");
            }

            choice = scan.nextInt();
            scan.nextLine();

            //starter feature for adding a task
            if (choice == 1)
            {
                if (taskCount < tasks.length)
                {
                    System.out.print ("Enter a task: ");
                    task = scan.nextLine();

                    if (task.trim().isEmpty())
                    {
                        System.out.println ("Task cannot be empty.");
                    }
                    else
                    {
                        tasks[taskCount] = new Task(task);
                        taskCount++;

                        System.out.println ();
                        System.out.println ("Task added: " + task);
                    }
                }
                else
                {
                    System.out.println ("Your task list is full.");
                }
            }
            else if (choice == 2)
            {
                //Display all saved tasks
                if (taskCount == 0)
                {
                    System.out.println ("You have no tasks yet.");
                }
                else
                {
                    System.out.println ();
                    System.out.println ("------ YOUR TASKS ------");

                    for (int i = 0; i < taskCount; i++)
                    {
                        System.out.println ((i + 1) + ". " + tasks[i]);
                    }
                }
            }
            else if (choice == 3)
            {
                //Mark a task as completed
                if (taskCount == 0)
                {
                    System.out.println ("You have no tasks to complete.");
                }
                else
                {
                    System.out.println ();
                    System.out.println ("------ YOUR TASKS ------");

                    for (int i = 0; i < taskCount; i++)
                    {
                        System.out.println ((i + 1) + ". " + tasks[i]);
                    }

                    System.out.print ("Enter the task number to complete: ");

                    while (!scan.hasNextInt())
                    {
                        System.out.println ("Please enter a valid task number.");
                        scan.nextLine();
                        System.out.print ("Enter the task number to complete: ");
                    }

                    int taskNumber = scan.nextInt();
                    scan.nextLine();

                    if (taskNumber >= 1 && taskNumber <= taskCount)
                    {
                        if (tasks[taskNumber - 1].isCompleted())
                        {
                            System.out.println ("This task is already completed.");
                        }
                        else
                        {
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
            else if (choice == 4)
            {
                System.out.println ("Thank you for using the To Do List!");
            }
            else
            {
                System.out.println ("Invalid option. Please choose 1, 2, 3, or 4.");
            }

        } while (choice != 4);

        scan.close();
    }
}
