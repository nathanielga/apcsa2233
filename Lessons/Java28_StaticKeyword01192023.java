package Lessons;
public class Java28_StaticKeyword01192023
{
    // In the Java programming language, the keyword static means that the particular member belongs to a type itself,
    // rather than to an instance of tha type. This means we'll create only one instance of that static member, that's
    // shared across all instances of the class

    static String natName="Nathaniel";
    static int natAge =16;
}
class Static2
{
    public static void main(String[] args)
    {
        System.out.println(Java28_StaticKeyword01192023.natAge);
        System.out.println(Java28_StaticKeyword01192023.natName);
        Java28_StaticKeyword01192023 Java28StaticKeyword = new Java28_StaticKeyword01192023();
        System.out.println(Java28_StaticKeyword01192023.natName);
    }

}
