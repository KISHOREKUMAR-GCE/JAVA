import java.util.Scanner; // package

public class readInput {
    public static void main(String args[]){

        // Scanner class - It is used to get the input from the users
        Scanner obj = new Scanner(System.in);

        System.out.println("ENTER YOUR NAME");
        String name =  obj.nextLine();

        System.out.println("ENTER YOUR AGE");
        int age = obj.nextInt();

        //output
        System.out.println("username is " + name);
        System.out.println("Age is " + age);

        //input
        System.out.println("Enter 2 values");
        int a = obj.nextInt();
        int b = obj.nextInt();

        // Process to add the numbers
        int c = a+b;

        //output
        System.out.println("addition of 2 numbers is " + c);
    }
}
