import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth :");

        // checking if next input is integer or not
        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle next line character (enter key)

            System.out.println("Enter your name :");
            String name = scanner.nextLine();

            int age = 2019 - yearOfBirth ;
            System.out.println("Hello " + name + ", and your age is " + age);
        }else{
            System.out.println("Unable to parse year of birth");
        }

        // releasing  scanner
        scanner.close();
    }
}
