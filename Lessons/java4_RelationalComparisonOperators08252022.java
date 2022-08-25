package Lessons;

public class java4_RelationalComparisonOperators08252022 {
    public static void main(String[] args) {

        //RELATIONAL/COMPARISON OPERATORS
        /*


           Description                Operator
              >                     Greater than
              <                     Less than
              >=                    Greater than or equal too
              <=                    less than or equal too
              ==                    equal to
              !=                    not equal to
         */

        System.out.println(6>3);
        System.out.println(1<40);
        System.out.println(45>=45);
        System.out.println(20<=10);
        System.out.println(10==10);
        System.out.println(5!=5);

        int a = 2;
        int b = 4;

        System.out.println("first number is greater than the second number -" + (a>b) );

        /*
           LOGICAL OPERATORS

           Operator   Description
              &&          Bitwise logical AND
              //          Bitwise logical inclusive OR
              ^           Bitwise logical exclusive OR

         */

        System.out.println(true&&true);  //true
        System.out.println(true&&false); //false
        System.out.println(false&&true); // false
        System.out.println(false&&false);//false


        System.out.println(true||true); //true
        System.out.println(true||false);//true
        System.out.println(false||true);//true
        System.out.println(false||false);//false

        System.out.println(true^true); //true
        System.out.println(true^false);//true
        System.out.println(false^true);//true
        System.out.println(false^false);//false


        double aa = 20;
        double bb = 80;







    }
}
