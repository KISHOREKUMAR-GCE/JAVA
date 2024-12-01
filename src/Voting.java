import java.util.Scanner;

public class Voting {
    public static void main (String args[]){


        //VOTEING OR NOT

        System.out.println("ENTER YOUR AGE:");
        Scanner obj =new Scanner(System.in);
        int a = obj.nextInt();

        if(a>=18){
            System.out.println("ELIGIBLE FOR VOTING");
        }
        else{
            System.out.println("RETURN TO HOME");
        }

    }
}
