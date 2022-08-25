package Lessons;

public class Java3_Arithmaticoperators08232022 {
    // if you need to change the last name you can not do it directly
    // use refactor option when right-clicking on a class
    public static void main(String[] args) {
        // ARITHMETIC OPERATORS
    // priority is just like algebra +-*/%
        //    OPERATOR      USE     DESCRIPTION              EXAMPLE
        /*       +          x+y      adds x and y             3+7=10
                 -          x-y      subtracts y from x       12-3=9
                 *          x*y      Multiplies x and y       2*4=8
                 /          x/y      divide x by y            12/4=3
                 %          x%y      remainder                8%6=2
                 -          -x       mathematically negates x int a = 3; , -a =-3;
                 ++         X++      increases number by 1    a++
                 --         --x      decreases number by 1    a--
         */

        System.out.println(3+7);//10
        System.out.println(8-2);//6
        System.out.println(4*6);//24
        System.out.println(3*2.3);// if using decimals answer will contain decimals

        // CONCATENATION
        // writing different data types within sout. if you put a string it won't be considered as arithmetic unless you put
        // math within parenthesis

        System.out.println("collection of five and three"+(5+3));// must add math in own parenthesis only does within parenthesis
        System.out.println("collection of five and three"+5+3);// will not do the math
        System.out.println("c"+(3+2)); //this will do math within parenthesis
        System.out.println((5-2)+(4*7));// java and arithmetic handles parenthesis first
        int number = 3;
        System.out.println(number);
        number++;
        System.out.println(number);
        int number2 = 7;
        System.out.println("number2 = " + number2);
        number2--;
        System.out.println("number2 = " + number2);


        // CASTING
        // casting converts datatype one to another if possible

        double dd =3.9;
        System.out.println(dd);
        int asdf = (int)dd; // this casting is going to take only the whole number part
        System.out.println((int)dd);

        // implicit casting
        double d1 = 3000;
        long l = asdf;
        System.out.println(d1);
        System.out.println(l);

        // Explicit casting
        double price = 200.55;
        System.out.println((int)price);

        // SHORThAND OPERATORS
        int number3 = 5;
        number3 = 5+5; //10
        number3+=5; // same meaning as the line above

        int numberA = 33;
        numberA+=22; // numberA plus 22
        System.out.println(numberA);
        numberA*=numberA;
        System.out.println(numberA);
        numberA/=3;
        System.out.println(numberA);
        numberA-=3;
        System.out.println(numberA);
        numberA-=9;
        System.out.println(numberA);
        numberA%=3;
        System.out.println(numberA);

    }
}
