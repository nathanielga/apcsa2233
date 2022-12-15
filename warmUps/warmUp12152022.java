package warmUps;
public class warmUp12152022
{
    public static String eraseDel(String input)
    {
        if (input.contains("del"))
        {
            return input.replace("del", "");
        }
        return input;
    }
    public static void main(String[] args)
    {
        System.out.println(eraseDel("delete"));
    }
}
