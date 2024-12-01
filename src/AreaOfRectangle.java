import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String args[]){


        System.out.println("ENTER THE LENGTH:");
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();

        System.out.println("ENTER THE BREADTH:");
        int b = obj.nextInt();

        //Area of rectangle
        int area = a*b;
        System.out.println("area of rectangle is" + area);
    }
}
