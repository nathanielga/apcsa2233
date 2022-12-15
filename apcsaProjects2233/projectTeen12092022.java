package apcsaProjects2233;
public class projectTeen12092022
{
    public static boolean twoInRange1319(int a, int b, int c) {
        int count = 0;
        if (a >= 13 && a <= 19) count++;
        if (b >= 13 && b <= 19) count++;
        if (c >= 13 && c <= 19) count++;
        return count >= 2;
    }
    public static void main(String[] args)
    {
        System.out.println(twoInRange1319(14,20,13));
    }
}
