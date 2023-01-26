package Lessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Java30_Predicate
{
    // predicate does the job of an if statement in only one line of code

    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12));
        Predicate<Integer> oddnumber = p->p%2==1;
        arr.removeIf(oddnumber);
        System.out.println(arr);

        ArrayList<String> studentList = new ArrayList<>(Arrays.asList("Alex","Kristian","Trent","Muammer"));
        Predicate<String> startsWithA = p->p.charAt(0)=='A';
        Predicate<String> startsWithk = p->p.charAt(0)=='K';
        studentList.removeIf(startsWithk);
        studentList.removeIf(startsWithA);


        ArrayList<Character> charList = new ArrayList<>(Arrays.asList('a','b','c','1','2'));
        Predicate<Character> onlyNumbers = p -> p.equals('1')||p.equals('2');
        charList.removeIf(onlyNumbers);
        System.out.println(charList);


    }
}
