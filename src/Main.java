import java.util.Scanner;
// Question 1: Check the user's role and print a welcome message (if-else)
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your role: ");
        String role = input.nextLine();

        if (role.equalsIgnoreCase("admin")) {
            System.out.println("Welcome Admin");
        }  else if (role.equalsIgnoreCase( "superuser") ) {
            System.out.println("Welcome superuser");
        }
        else if  (role.equalsIgnoreCase("user") ) {
            System.out.println("Welcome user");
        } else {
            System.out.println("Invalid");
        }
// Question 2: Take three numbers from the user and print the greatest number
        System.out.println("Enter three numbers ");
                int
                   a = input.nextInt() ,
                   b = input.nextInt() ,
                   c = input.nextInt() ;
                if ( a >= b && a >= c  )  {
                    System.out.println( "The greatest number is = " + a );
                } else if ( b >= a && b >= c ) {
                    System.out.println("The greatest number is = " + b );
                } else {
                    System.out.println("The greatest number is = " + c ) ;
                }
// Question 3: Take a number between 1 and 7 and display the weekday name
                System.out.println("Enter a number (1-7) ");
                int number = input.nextInt();
                String weekday ;

                switch (number) {
                    case 1:
                    weekday = "sunday";
                    break;
                    case 2:
                        weekday = "monday";
                        break;
                    case 3:
                        weekday = "tuesday";
                        break;
                    case 4:
                        weekday = "wednesday";
                        break;
                    case 5:
                        weekday = "thursday";
                        break;
                    case 6:
                        weekday = "friday";
                        break;
                    case 7:
                        weekday = "saturday";
                        break;
                    default:
                        weekday = "Invalid number";
                }
                System.out.println(weekday);
// Question 4: Take a numeric score and print the letter grade (A, B, C, D, F)
                System.out.println("Enter Your Numeric  Score");
                int score = input.nextInt();
                System.out.println("Numeric  Score: " + score);
                if (score >= 90 && score <= 100 ) {
                    System.out.println( "Letter Grade:  A" );
                } else if (score >= 80 && score <= 89) {
                    System.out.println("Letter Grade:  B");
                } else if (score >= 70 && score <= 79) {
                    System.out.println("Letter Grade:  C");
                } else if (score >= 60 && score <=69) {
                    System.out.println("Letter Grade:  D");
                } else if (score >= 0 && score <= 59){
                    System.out.println("Letter Grade:  F");
                } else {
                    System.out.println("Invalid score");
                }
// Question 5: Take the user's age and categorize it as Child, Teenager, or Adult
        System.out.println("Enter your age");
                int age = input.nextInt() ;
                if (age >=0 && age < 13) {
                    System.out.println("You are a child ");
                } else if ( age >= 13 && age <=19 ){
                    System.out.println("You are a teenager");
        } else if (age >= 20 ) {
                    System.out.println("You are an adult");
                } else {
                    System.out.println("Invalid age");
                }
    }
}



