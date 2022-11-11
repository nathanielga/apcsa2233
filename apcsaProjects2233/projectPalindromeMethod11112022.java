package apcsaProjects2233;
public class projectPalindromeMethod11112022
{
    public static boolean  checkIfPalindrome (String word)
    {
        int left =0, right = word.length() -1;

        while(left<right)
        {
            if(word.charAt(left) != word.charAt(right))
            {
                return false;
            }
            left++;
            right--;

        }
        return true;
    }
    public static void main(String[] args)
    {
        if (checkIfPalindrome("Level"))
        {
            System.out.println("Level "+ "is a palindrome string");
        }
        else
        {
            System.out.println("Level "+ "is not a palindrome string");
        }
    }
}