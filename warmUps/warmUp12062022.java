package warmUps;
public class warmUp12062022
{
public static String addNot(String str)
{
    if(str.substring(0,3).equals("not"))
    {
        return str;
    }
    else
    return"not "+str;
}
    public static void main(String[] args)
    {
        System.out.println(addNot("not bruh"));
    }

}
