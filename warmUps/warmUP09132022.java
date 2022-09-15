    package warmUps;

    import java.util.Scanner;

    public class warmUP09132022
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the Operator you would like to use");
            String operator = scanner.nextLine();
            System.out.println("Enter the 2 numbers you would like to calculate");
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();

            switch  (operator)
            {

                case "+":
                    System.out.println(n1+n2);
                    break;
                case "-":
                    System.out.println(n1-n2);
                    break;
                case "*":
                    System.out.println(n1*n2);
                    break;
                case "/":
                    System.out.println(n1/n2);
                default:
                    System.out.println("Invalid Operator");
        }
        }
    }
