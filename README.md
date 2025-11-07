## Management records (Java Project)

##  Overview
This Java program is an **interactive “Adventure” system** where the user becomes part of a company and makes choices that affect the story.   
It collects user input such as name, age, work hours, and salary, then uses **arrays**, **loops**,**method** and **conditional statements** to build an engaging experience.

---

## Features Implemented  
  
  - `calculateMiles()` → Non-void return method.  
  - `computeSalary(int punchIn, int punchOut, int hourlyRate)` → the parameters and returns a value.  
  - `getValidatedInt()` → To handles the input validation with looping until correct.  
  - `displayArray()` → To prints array contents.   
  - `computeMileageReimbursement(int miles)` → Calculates reimbursement at **$0.15 per mile**.  
  - Program prints **Hourly Salary, Mileage Reimbursement, and Total Pay (Salary + Mileage)**.  
- **Method Overloading**:  
  - `printSummary(String fName, int numEmployees, String proObj, boolean choose, String address)`  
  - `printSummary(String fName)`  
- **Arrays used** for: company departments, employee benefits, and story paths.  
- **Control flow** with `if/else`, `switch`, `while`, and `for` loops.  

---

##  Technologies Used
- **Language:** Java  
- **Tool:** Any Java IDE (like VS Code, IntelliJ IDEA, or Eclipse) or Command Line  
- **Core Concepts:** Arrays, Loops, Conditional Statements, User Input (`Scanner`)

---

##  How It Works
1. The program greets the user and collects basic data (name, age, salary, etc.).  
2. It validates the user’s age (must be over 18).  
3. It calculates total salary based on punch-in and punch-out hours.  
4. It adjusts travel mileage with a small bonus system.  
5. Arrays are used to store and display **departments**, **benefits**, and **story paths**.  
6. The user selects a story path, and the program prints a custom ending.  



##  Example Arrays
==java===
String[] departments = {"Marketing", "Finance", "IT", "Human Resources", "Customer Service"};
String[] benefits = {"Health Insurance", "401K Plan", "Paid Vacation", "Bonus Program", "Mileage Reimbursement"};
String[] storyPaths = {
    "Take on a big new project for the company.",
    "Help train a new employee.",
    "Fix a critical computer issue in the IT department.",
    "Join a team meeting to brainstorm a new product idea."
};
``



##  Example of Loops and Arrays ##
### Loop to display benefits:

for (String benefit : benefits) {
    System.out.println("- " + benefit);
}


### Loop to calculate salary:

for (int i = punchIn; i < punchOut; i++) {
    totalSalary += hourlyRate;
}


##  Example of input

Enter your first name: Enock
Enter your last name: Masengesho
Choose a possessive adjective (his/her/their): his
Enter your age (must be above 18): 
Choose a pronoun subject (he/she/they): he
Enter the miles you drive daily: 20
Punch in time (24-hour clock): 8
Punch out time (24-hour clock): 16
Enter hourly rate: 15
Number of employees: 50
Choose a pronoun object (him/her/them): them
Choose true or false: true
Enter your address: 83651 Nampa Street

## Example of output

~ ~ ~ Company Adventure Story ~ ~ ~
Enock Masengesho has been a loyal member of our company.
his role is in the Marketing, Customer Service, Recruiting department.
he drives 40 miles each day and earns $120 per day.

Here are the benefits our company offers:
* Health Insurance
* 401K Retirement Plan
* Paid Vacation
* Bonus Program
* Mileage Reimbursement
* Paid Training

What will you do today? (Enter 1-4): 2

You patiently help train a new employee. They are grateful for your support and you gain a new friend.

 Salary Report 
Hourly Salary: $120
Mileage Reimbursement: $6.0
Total Pay (Salary + Mileage): $126.0
``
##  How to Run the Program
1. Copy the file `Main.java` into your project folder.  
2. Open a terminal in that folder.  
3. Compile the program:
   ```
   ```bash
   javac Main.java
   
4. Run it:

   ``bash
   java Main

   ## Example Unit Test Outputs  

These are lightweight “tests” that demonstrate methods returning the correct values.  

- **Miles Calculation Test**  
  ```java
  System.out.println("Expected: 15 | Actual: " + calculateMiles(12));
  System.out.println("Expected: 40 | Actual: " + calculateMiles(35));
  System.out.println("Expected: 58 | Actual: " + calculateMiles(50));
  ```

- **Salary Computation Test**  
  ```java
  System.out.println("Expected: 80 | Actual: " + computeSalary(8, 12, 20));
  ```

- **Mileage Reimbursement Test**  
  ```java
  System.out.println("Expected: 15.0 | Actual: " + computeMileageReimbursement(100));
  ```

- **Overloaded Methods Test**  
  ```java
  printSummary("Enock", 5, "them", true, "123 nampa ct.");
  printSummary("Enock");
  ```


   ## Future Improvements
   This project is under construction, but it will have options for administrative tasks like
1. delete
2. save
3. search
4. history
5. database
6. export
7. add, Etc.
* And also, it will have employee options like tracking the salary, comments, Etc.


## Author
**Enock Masengesho** 





