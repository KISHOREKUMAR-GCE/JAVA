import java.util.Scanner;

public class MaxOfTwo {
        public static void main (String args[]){

            System.out.println("ENTER THE NUMER:");
            Scanner obj = new Scanner(System.in);
            int a = obj.nextInt();
            int b = obj.nextInt();

            if(a>b){
                System.out.println("A IS GREATER");
            }
            else {
                System.out.println("B IS GREATER");
            }
        }
    }


