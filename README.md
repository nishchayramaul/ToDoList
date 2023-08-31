# ToDoList
This is a simple Java Swing-based to-do list application that allows users to manage their tasks. Users can add tasks, mark them as completed, and remove completed tasks from the list.

Prerequisites
Before running the application, make sure you have the following prerequisites installed on your system:

Java Development Kit (JDK)
IDE (Integrated Development Environment) for Java (e.g., Eclipse, IntelliJ IDEA) or a text editor for code editing
Running the Application
To run the application, follow these steps:

Compile the Java Code:


javac -cp . APP_UI/*.java
This command compiles the Java source files located in the APP_UI package.

Run the Application:

After successfully compiling the code, you can run the application. Run the Main class, which contains the main method:

java -cp . APP_UI.Main
This command starts the application.

Using the To-Do List Application:

Once the application is running, you can interact with it through the graphical user interface (GUI). Here's how to use the application:

Add Tasks: Enter a task description in the text field and click the "ADD TASK" button to add a new task to the list.
Mark Tasks as Completed: Click the "Done" button next to a task to mark it as completed. Completed tasks will change their appearance.
Remove Completed Tasks: Click the "CLEAR TASK" button to remove completed tasks from the list.
Closing the Application:

You can close the application window, and your tasks will remain in memory. Please note that this version of the application does not persist tasks beyond the current session.

Code Structure
The code is organized into several Java classes within the APP_UI package:

Appframe: This class represents the main application window.
ButtonPanel: It defines the panel containing "ADD TASK" and "CLEAR TASK" buttons.
List: This class represents the task list.
Task: It represents individual tasks in the to-do list.
Titlebar: Defines the title bar of the application.

