import java.util.Scanner;

public class OddOrEven {
    public static void main (String args[]){

        System.out.println("ENTER THE NUMER:");
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();

        if(a%2==0){
            System.out.println("Even number");
        }
        else {
            System.out.println(a + " is " + "Odd number");
        }
    }
}
