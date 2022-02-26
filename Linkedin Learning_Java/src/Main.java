import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Keep it up James, keep getting better!");
        /* int studentAge = 15;
        double studentGPA = 3.45;
        char studentFirstInitial = 'J';
        char studentLastInitial = 'W';
        boolean perfectAttendance = true;
        String studentName = "James Wagner";

        String studentFirstName = "James";
        char studentFirstInitial = studentFirstName.charAt(0); //another method to initialize a specific char from a string
        String studentLastName = "Wagner";
        char studentLastInitial = studentLastName.charAt(0);

        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(studentFirstInitial); //found using charAt operator
        System.out.println(studentLastInitial); //found using charAt operator
        System.out.println(perfectAttendance);
        System.out.println(studentName);
        System.out.println(studentFirstName);
        System.out.println(studentLastName); //Pratice Exercise 2/22/2022

        String studentFirstName = "James";
        String studentLastName = "Wagner";
        System.out.println(studentFirstName+" "+studentLastName+" has a GPA of "+studentGPA);
        System.out.println("What do you want to update GPA to?: ");

        Scanner input = new Scanner(System.in); //creates a new Scanner object with a variable
        studentGPA = input.nextDouble(); // store input in studentGPA, no need to initialize as it is already .nextDouble only allows for double data types

        System.out.println(studentFirstName+" "+studentLastName+" now has a GPA of "+studentGPA); */ // End of variable initalization pratice/println() pratice and scanner pratice

        System.out.println("Pick a number between 1 and 10");
        Scanner scanner = new Scanner(System.in); //Used to allow input information

        int inputtedNum = scanner.nextInt(); //Used to store input information in int variable called inputtedNum using the nextInt() operation

        if (inputtedNum < 5) {
            System.out.println("Enjoy future good luck!"); //Printed if condition true
        } else {
            System.out.println("Enjoy your shoe selection?"); //Printed if condidtion false
        }
    }
}
