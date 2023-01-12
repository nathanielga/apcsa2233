package warmUps;
public class warmUp01122023
{
    public static String everyOther(String str)
    {
       StringBuilder result =  new StringBuilder();
       for(int i=0;i<str.length();i+=2)
       {
            result.append(str.charAt(i));
       }
       return result.toString();
    }
    public static void main(String[] args)
    {
        System.out.println(everyOther("Nathaniel"));

    }
}
