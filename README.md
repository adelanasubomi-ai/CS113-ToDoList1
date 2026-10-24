# CS113-ToDoList1
CS 113 semester project - To-Do List application in Java

## Group Members
1. Subomi Adelana
2. Liza Naas
3. Jeshan Ahmad

## Project Proposal
Our project is a To Do List / Task Manager application. The purpose of the program is to help users organize and keep track of tasks they need to complete. Users will be able to add new tasks, view tasks that need to be completed, and mark tasks as completed.

## Intended Users
This program is intended for students or anyone who wants a simple way to organize and keep track of daily tasks.

## Planned Features
1. Add a new task.
2. View tasks that need to be completed.
3. Mark a task as completed.

## Example Input and Output

Example Input:

Choose an option: 1

Enter a task: Finish Java homework

Example Output:

Task added: Finish Java homework

## Pseudocode

START

Display the To Do List title

Display the menu:
1. Add a task
2. View tasks
3. Mark task as completed

Ask the user to choose an option

IF the user chooses 1

Ask the user to enter a task

Store the task

Display the task that was added

ELSE

Display "This feature will be added later."

ENDIF

END

## How to Run the Program
1. Open ToDoList.java in jGRASP or another Java IDE.
2. Compile ToDoList.java.
3. Run the program.
4. Choose an option from the menu.
5. For Milestone 1, choose option 1 to add a task.

## AI Use
AI was used to help organize the starter code and brainstorm the structure of the To Do List project.

Milestone 2 – Functional Core

Description
In Milestone 2, we improved our To Do List application by making it more functional and easier to use. The program now allows users to add tasks, view their tasks, and mark tasks as completed. We also added a repeating menu so users can continue using the program until they choose to exit.

The program uses Java concepts such as variables, arrays, loops, conditional statements, classes, objects, methods, and user input.

Working Features

1. Add a Task

The user can select option 1 to add a new task. The program asks the user to enter a task description. The task is stored in an array and can be viewed later during the same program run.

The program also checks whether the task description is empty and displays an error message if the user does not enter a task.

2. View Tasks

The user can select option 2 to see all tasks that have been added.

Each task is displayed with a number, description, and completion status.

Tasks that have not been completed display "Not completed."

Tasks that have been completed display "Completed."

If no tasks have been added, the program displays a message explaining that there are no tasks to show.

3. Mark a Task as Completed

The user can select option 3 to mark a task as completed.

The program displays the task list and asks the user to enter the number of the task they want to complete.

The program checks whether the task number is valid. If the number is correct, the task is marked as completed.

If the task is already completed, the program displays a message informing the user.

4. Exit the Program

The user can select option 4 to exit the application.

The menu repeats until the user chooses to exit.

Java Concepts Used

Variables: We used variables to store the user's menu choice, task descriptions, and the number of tasks.

Arrays: We used an array to store multiple Task objects.

Input and Output: We used Scanner to receive input and System.out.println() to display messages.

Conditional Statements: We used if, else if, and else statements to check user choices and validate input.

Loops: We used a do-while loop to repeat the menu and a for loop to display tasks.

Classes and Objects: We created two Java classes:

ToDoList.java: Contains the main program, menu, and task management.

Task.java: Represents an individual task and stores its description and completion status.

Methods: We used methods such as getDescription(), isCompleted(), markCompleted(), and toString() to organize the program.

Example 1 – Correct Input and Output

Choose an option: 1

Enter a task: Finish Java homework

Task added: Finish Java homework

Choose an option: 1

Enter a task: Study for exam

Task added: Study for exam

Choose an option: 2

Your tasks:

Finish Java homework - Not completed

Study for exam - Not completed

Choose an option: 3

Enter the task number to complete: 1

Task completed: Finish Java homework

Choose an option: 2

Your tasks:

Finish Java homework - Completed

Study for exam - Not completed

Choose an option: 4

Thank you for using the To Do List!

Example 2 – Incorrect Input

Choose an option: 9

Invalid option. Please choose 1, 2, 3, or 4.

Choose an option: 1

Enter a task:

Task cannot be empty.

Choose an option: 3

Enter the task number to complete: 8

Invalid task number.

These examples show how the program handles incorrect input and helps users enter valid information.

Improvements Since Milestone 1

In Milestone 1, our program displayed a menu and allowed users to enter a task. However, the program did not save tasks in a list, display saved tasks, or allow users to mark tasks as completed.

In Milestone 2, we improved the program by adding three working features: adding tasks, viewing tasks, and marking tasks as completed. We created a separate Task class to store task descriptions and completion status. We also used an array to store multiple tasks, allowing users to manage several tasks during the same program run.

We added a repeating menu using a loop so users can continue working with their tasks until they choose to exit. We also improved the program by adding input validation and clear error messages for invalid options, empty task descriptions, and incorrect task numbers.

These improvements made our To Do List application more organized, interactive, and useful.

Updated Pseudocode – Milestone 2

START

Create an array to store tasks

Set task count to 0

REPEAT

Display the To Do List menu:

Add a task

View tasks

Mark task as completed

Exit

Ask the user to choose an option

IF option is 1

Ask the user to enter a task description

IF the description is valid

Create a new Task object

Store the task in the array

Increase the task count

Display a confirmation message

ELSE

Display an error message

ENDIF

ELSE IF the option is 2

IF there are no tasks

Display "No tasks have been added yet."

ELSE

Display all tasks and their completion status

ENDIF

ELSE IF option is 3

Display the tasks

Ask the user to enter a task number

IF the task number is valid

Mark the selected task as completed

Display a confirmation message

ELSE

Display an error message

ENDIF

ELSE IF the option is 4

Display a goodbye message

ELSE

Display an invalid option message

ENDIF

UNTIL the user chooses option 4

END

How to Run Milestone 2

Download ToDoList.java and Task.java from GitHub.

Place both files in the same folder.

Open the files in jGRASP or another Java IDE.

Compile both Java files.

Run ToDoList.java.

Choose option 1 to add a task.

Choose option 2 to view tasks.

Choose option 3 to mark a task as completed.

Choose option 4 to exit.

AI Use – Milestone 2

AI was used to help organize the Java code, explain programming concepts, and prepare the project documentation. Group members should review and test the program and understand how the code works before submitting.
