## Management Records And Employye Tracking (Java Project)

##  Overview
This Java program is an **interactive “Adventure” system** where the user becomes part of a company and makes choices that affect the story.   
It collects user input such as name, age, work hours, and salary, and makes story-based decisions that affect the outcome. then uses **arrays**, **loops**,**method** and **conditional statements** to build an engaging experience.

This version is a refactored and improved version of the original Management Records and Employee tracking project.
It now follows Object-Oriented Programming (OOP).

## What changed in the project

**GUI: Swing Interface**

The CompanyAdventureSwing class extends JFrame and provides a simple
two-stage interface:

**`Setup Screen`**

- Text fields for first name, last name, age, daily miles, and hourly rate.

- Validation to ensure numbers are within expected ranges.

- When the user clicks `Start Adventure`, the program constructs an
Employee object and calls **StoryEngine.buildStoryOptions()** to
initialize the scene graph.

**`Adventure Screen`**

- A header area that displays the employee’s name and quick stats (miles per
day and daily salary).

- A non-editable JTextArea that shows the story text.

- A choicesPanel with JButtons; each button corresponds to a StoryNode
returned by getNextNodes() from the current scene.

- When a button is clicked, the program appends that node’s text to the
story area and then replaces the buttons with the next set of choices.
- **Concept**
  - Structure 
  - Encapsulation 
  - Input/Output  
  - Code Reuse   
  - Overloading 
  - Main Method  
  - GitHub Workflow
- **After (OOP Refactor)**
  - Split into 13 classes: Main, Employee, InputHelper, StoryEngine, CompanyAdvantureSwing, StoryNode,etc
  - Private fields + constructor + getters in Employee
  - Centralized in InputHelper (for input) and StoryEngine (for output)
  - Modular methods reused across program 
  - Enhanced: summary(Employee) and summary(String)
  - Acts only as a driver/controller
  - Acts only as a driver/controller
  - Uses Issue → PR → Tag workflow for submission 

##  Technologies Used
  - Language: Java
  - Tools: VS Code / Command Line
  - Core Concepts:
  - Classes/subclasses/Objects
  - Constructors and Encapsulation
  - Arrays and Loops
  - Conditional Statements (if/else, switch)
  - Method Overloading and Return Types
  - Input Validation with Scanner
  - Polymorphism
  - Recursion / Tree structure
  - GUI: Swing
   
## Class and their purpose
  - `Main.java`:	Entry point — coordinates the program flow
  - `Employee.java`:	Data model — stores user information (name, age, salary, etc.)
  - `InputHelper.java`:	Handles validated user input and Scanner management
  - `StoryEngine.java`:	Manages story logic, salary/mileage calculations, summaries, and new chapter
  - `CompanyAdvantureSwing.java` this is used to diplay the window of project and its output values.
  - `StoryNode.java`: manages the others subclass nodes.
  - 

##  How It Works
1. The user enters their personal details (names, age, , salary, etc.).
2. Input is validated through InputHelper.
3. An Employee object is created using a constructor.
4. The StoryEngine displays:
5. the window will display the field to fill basics information 
    - Introduction
    - Story choices
    - Salary and mileage reports
    - End of day summaries

5. Arrays are used to store and display **departments**, and **benefits**.   
6. The user selects a story path, and the program prints a custom ending.  



##  Example Arrays
String[] company = {"Marketing", "Finance", "HR", "Customer Service", "Training", "Recruiting"};
String[] storyPaths = {
  `Take on a big new project for the company.`,
  `Help train a new employee.`,
  `Fix a critical computer issue in the IT department.`,
  `Join a team meeting to share a new product idea.`,
  `Lead a company wellness event.`
};
for (String dept : company) {
    System.out.println("* " + dept);
}


##  new story/ chapter
After the main company adventure concludes, the program continues into a new section called “Bonus Evaluation.”

- The company reviews your performance.
- Your miles driven and total salary determine your bonus.
- Encouraging messages appear depending on your results.
  - **examole**

  if (emp.getMiles() > 40 && emp.getTotalSalary() > 150) {
    System.out.println("Congratulations! You earned a $50 performance bonus!");
} else if (emp.getMiles() >= 25) {
    System.out.println("Nice effort! You earned a $25 performance bonus!");
} else {
    System.out.println("Keep going! No bonus this time, but your dedication is noted.");
}
##  Example of Loops and Arrays ##
  String[] company = {"Marketing", "Finance", "HR", "Customer Service", "Training", "Recruiting"};
  String[] storyPaths = {
  "Take on a big new project for the company.",
  "Help train a new employee.",
  "Fix a critical computer issue in the IT department.",
  "Join a team meeting to share a new product idea.",
  "Lead a company wellness event."
};
for (String dept : company) {
    System.out.println("* " + dept);
}

##  How to Run the Program
  **Option 1:** Java IDE (VS Code / IntelliJ)
 Place all .java files in one folder.
 Open the folder in your IDE.
 Run Main.java.

   **option2:**
  javac *.java 
  java CompanyAdventureSwing

   ## Future Improvements
- This project is under construction, but it will have options for administrative tasks like
1. - Add employee database for storing results.
2. - Implement save/load features.
3. - Create GUI version (JavaFX).
4. - delete or update the data of employee
5. - search the name of employee
6. - history 
7. - export or print the employee records
* And also, it will have employee options like tracking the salary, comments, Etc.
## Author
**Enock Masengesho** 





