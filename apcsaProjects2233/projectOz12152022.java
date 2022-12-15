package apcsaProjects2233;
public class projectOz12152022
{
    public static String startWithOorZorOz(String input) {
        if (input.startsWith("oz"))
        {
            return "oz";
        } else if (input.startsWith("o"))
        {
            return "o";
        } else if (input.startsWith("z"))
        {
            return "z";
        }
        return "";
    }
    public static void main(String[] args)
    {
        startWithOorZorOz("Ozpay");
    }
}
