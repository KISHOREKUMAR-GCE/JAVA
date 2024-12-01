import java.util.Scanner;

public class ControlStatements {
    public static void main (String args[]) {

        // input or requirement

//        System.out.println("Enter any number:");
        Scanner myobj = new Scanner(System.in);
//
//        int a = myobj.nextInt();
//
//        //proccess
//
//        if (a == 5) {
//            //output
//            System.out.println("*****");
//        } else {
//            System.out.println("*");
//        }

        //Switch statement

        System.out.println("Enter the username:");

        String b = myobj.nextLine();

        switch(b){
            case "hi": {
                System.out.println("hi");
                //break;
                }
            case "hello": {
                System.out.println("hello");
                break;}
            default :
                System.out.println("no value found");
            }
        }
}


