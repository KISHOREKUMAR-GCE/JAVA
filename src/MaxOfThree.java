import java.util.Scanner;

public class MaxOfThree {
    public static void main (String args[]){

        System.out.println("ENTER THE NUMER:");
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();

        if (a>b && a>c){
            System.out.println("A Is Greater");
        }
        else if(b>c && b>a){
            System.out.println("B Is Greater");
        }
        else{
            System.out.println("C Is Greater");
        }

        //System.out.println(Math.max(a,b));
    }
}
