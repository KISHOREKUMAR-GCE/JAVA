import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;


public class DataTypes{

    public static void main(String args[]){
        /**
         * Java Numeric and Non - Numeric DataTYpes */

        int a = 7;
        short b = 75;
        long c = 1234567890;
        byte d = 127;
        boolean e = false;
        char f = 'A';
        float g = 3.3f;
        double h = 10.0098d;



        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("c:" +c);
        System.out.println("d:" +d);
        System.out.println("e:" +e);
        System.out.println("f:" +f);
        System.out.println("g:" +g);
        System.out.println("h:" +h);


        /**
         * non primitive data types
         * Array -> used to store same type of data mutiple values into a single variable
         */

        // initialize an array
        int z[] = {10,12,13};
        String names[] = {"kishore","kumar"}; // multiple values

        String name = "kishore"; // single value
        int arr[] = {0};
        System.out.println(name);
        System.out.println(arr[0]);

    }

}
