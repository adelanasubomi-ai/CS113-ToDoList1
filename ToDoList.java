//********************************************************************
//File Name: ToDoList.java
//Project: To Do List / Task Manager
//Course: CS 113 - Introduction to Computer Science I
//Semester: Fall 2026
//
//Group Members:
//1. Subomi Adelana
//2. Liza Naas
//3. Jeshan Ahmad
//
//Milestone 1: Proposal & Java Starter
//
//Description:
//This program is the starter for a To Do List application.
//The final program will allow users to add tasks, view their tasks,
//and mark tasks as completed.
//
//Planned Features:
//1. Add a new task
//2. View tasks that need to be completed
//3. Mark a task as completed
//
//AI Use:
//AI was used to help organize the starter code and brainstorm
//the structure of the To Do List project.
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
        System.out.println ("****************************");
        System.out.println ("       TO DO LIST");
        System.out.println ("****************************");

        //display the starter menu
        System.out.println ("1. Add a task");
        System.out.println ("2. View tasks");
        System.out.println ("3. Mark task as completed");

        System.out.print ("Choose an option: ");
        choice = scan.nextInt();
        scan.nextLine();

        //starter feature for adding a task
        if (choice == 1)
        {
            System.out.print ("Enter a task: ");
            task = scan.nextLine();

            System.out.println ();
            System.out.println ("Task added: " + task);
        }
        else
        {
            System.out.println ();
            System.out.println ("This feature will be added later.");
        }

        scan.close();
    }
}
