package Lessons;
public class Java25_Encapsullation01102023 {
    /*
    ACCESS MODIFIERS   SAME CLASS        SAME PACKAGE      SUB_CLASSES      EVERYWHERE ELSE
    public                  y                 y              y                   y
    protected               y                 y              y                   n
    default                 y                 y              n                   n
    private                 y                 n              n                   n

     */

    public static String myPublicVariable = "myPublicName";
    protected String myProtectedVariable = "myProtectedVariable";
    String myDefaultVariable = "myDefaultVariable";
    String myPrivateVariable = "myPrivateVariable";
}

class newClass
{
    public static void main(String[] args) {
        Java25_Encapsullation01102023 java25Encapsullation01102023 = new  Java25_Encapsullation01102023();
        System.out.println(Java25_Encapsullation01102023.myPublicVariable);
        System.out.println(java25Encapsullation01102023.myProtectedVariable);
        System.out.println(java25Encapsullation01102023.myDefaultVariable);
        System.out.println(java25Encapsullation01102023.myPrivateVariable);

    }
}

