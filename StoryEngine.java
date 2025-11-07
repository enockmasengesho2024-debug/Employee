public class StoryEngine {

    // Calculate miles
    public static int calculateMiles(int miles) {
        if (miles >= 10 && miles <= 30) {
            miles += 3;
        } else if (miles >= 31 && miles <= 50) {
            miles += 5;
        } else {
            miles += 8;
        }
        return miles;
    }

    // Calculate salary
    public static int computeSalary(int punchIn, int punchOut, int hourlyRate) {
        int totalSalary = 0;
        for (int i = punchIn; i < punchOut; i++) {
            totalSalary += hourlyRate;
        }
        return totalSalary;
    }

    // Mileage reimbursement
    public static double computeMileageReimbursement(int miles) {
        final double RATE = 0.15;
        return miles * RATE;
    }

    // Introduction
    public static void introduction(Employee emp, String[] company) {
        System.out.println("\n~ ~ ~ Company Adventure Story ~ ~ ~");
        System.out.println(emp.getFullName() + " has been a loyal member of our company.");
        System.out.println(emp.getPossAdj() + " role is in the " + company[0] + ", " + company[3] + ", " + company[5] + " department.");
        System.out.println(emp.getSubj() + " drives " + emp.getMiles() + " miles each day and earns $" + emp.getTotalSalary() + " per day.\n");
    }

    // Resolve story choice
    public static void resolveChoice(int choice, String[] storyPaths) {
        System.out.println();
        switch (choice) {
            case 1:
                System.out.println("You take on the big project. It’s challenging, but your hard work impresses your boss!");
                break;
            case 2:
                System.out.println("You patiently help train a new employee. They’re grateful and you gain a new friend.");
                break;
            case 3:
                System.out.println("You solve a critical system issue! The IT team celebrates your quick thinking.");
                break;
            case 4:
                System.out.println("Your ideas in the meeting inspire the team to create a new product!");
                break;
            default:
                System.out.println("You decide to take it easy today. Everyone needs a rest sometimes!");
                break;
        }
    }

    // Summary (overloaded)
    public static void summary(Employee emp) {
        System.out.println("\nAt the end of the day, " + emp.getFullName() + " reflects on the achievements.");
        System.out.println("Working with " + emp.getNumEmployees() + " employees, all of " + emp.getObj() + " make the company strong.");
        System.out.println("It is " + emp.getChoice() + " that teamwork and passion lead to success!");
        System.out.println("Our headquarters at " + emp.getAddress() + " continues to grow — thanks to people like you.");
        System.out.println("\nCongratulations, " + emp.getFullName() + "! You have completed your company adventure.");
    }

    public static void summary(String fName) {
        System.out.println("\n" + fName + " smiles, ready for another day at the company tomorrow.");
    }
}
