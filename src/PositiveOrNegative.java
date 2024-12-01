import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String args[]){

        //POSITIVE OR NEGATIVE
        System.out.println("ENTER THE NUMBER:");
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();

        if(a>0){
            System.out.println("POSITIVE");
        } else if (a==0) {
            System.out.println("NEITHER POSITIVE NOR NEGATIVE");

        } else{
            System.out.println("NEGATIVE");
        }

    }
}
