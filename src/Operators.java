public class Operators {
    public static void main(String[] args){
        /**
         * OPERATORS :USED TO PERFOM MATHEMATICAL OPERATIONS
         */

        // ARITHMETIC OPERATORS

        int a = 5 , b = 5;
        System.out.println("additon=" + (a+b));
        System.out.println("subtraction=" + (a-b));
        System.out.println("multiplication=" + (a*b));
        System.out.println("division=" + (a/b));
        System.out.println("modulus=" + (a%b));

        // RELATIONAL OPERATORS
        System.out.println("double equalto=" + (a==b));
        System.out.println("g equalto=" + (a>=b));
        System.out.println("l equalto=" + (a<=b));
        System.out.println("not equalto=" + (a!=b));
        System.out.println("greater=" + (a>b));
        System.out.println("lessthan=" + (a<b));

        // ASSINGMENT OPERATOR
        System.out.println("a=" + (a=10));

        // COMPOUND ASSINGMENT OPERATORS
        System.out.println(a+=10);
        System.out.println(a-=10);

        // LOGICAL OPERATORS
        System.out.println("Logical or = " + ((a>=b) || (a!=0)) );
        System.out.println("logical and =" + ((a<b) && (b>0)));
        System.out.println("logical not = " + (!(a==b)));
        System.out.println("combination =" + ((a<0)|| !(b>a) &&(!(true))));

        // TERNARY OPERATORS also known as conditional operator ( ? : )
        System.out.println("ternary =" + (((a==0) && (a!=b)) ?"right" : "wrong"));

        //BITWISE OPERATORS (bit by bit operator)
        System.out.println("bitwise and =" + (a&b));
        System.out.println("bitwise or =" + (a|b));
        System.out.println("bitwise xor =" + (a^b));
        System.out.println("bitwise compliment =" +(~5)); // - (n+1)

        // SHIFT OPERATORS
        System.out.println("Right shift by 3 times = " + (a>>3));
        System.out.println("left shift by 1 times = " + (b<<2));

        // UNARY OPERATORS
        System.out.println("post increment of a =" + (a++));
        System.out.println("a=" + a);
        System.out.println("post increment of b =" + (b++));
        System.out.println("b=" +b);
        System.out.println("pre increment of a =" +(++a));
        System.out.println("pre increment of b =" +(++b));

        int c = (++a) + (--b) - (a++) + (b--);
        System.out.println("c=" + c);
        System.out.println("a=" +a);
        System.out.println("b=" +b);

       int d = ++c+a---c-3+b*10+c++;
        System.out.println("d=" + d);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c); }
}
