package Lessons;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Java17_ArrayList10142022
{
    public static void main(String[] args)
    {
        // ARRAY LISTS
        // presented in java util class.
        // is on ordered collection of values.
        // Arraylist is dynamic size arrays, so you don't have to specify.
        // we can add and remove arrays to from arraylist
        // arraylist does not support primitives, it only stores objects
        // DECLARATION
  //      ArrayList<String> arrlList = new ArrayList<>();
  //      // or
  //      ArrayList<String> arrList2 = new ArrayList<String>();
        // or
  //      ArrayList<Integer> List10 = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));
//
        // ARRAYLIST METHODS
        // ADD
  //      arrlList.add("Kristian");
  //      arrlList.add("Alejandro");
  //      arrlList.add("Nathaniel");
 //       System.out.println(arrlList);
//
        // GET
  //      System.out.println(arrlList.get(2));

        // SIZE
 //       System.out.println(arrlList.size());
        //ClEAR
        // clear the array and removes all the values
 //       arrlList.clear();
//        System.out.println(arrlList);

        // SET
  //      arrlList.add(0,"Trent");
  //      System.out.println(arrlList);
 //       arrlList.set(0,"Christopher");
//        System.out.println(arrlList);

        // CONTAINS
 //       System.out.println(arrlList.contains("Christopher"));
//        System.out.println(arrlList.contains("Trent"));

        // EQUALS METHOD
        // checks if two array lists are the same or not
   //     ArrayList<String> arr1 = new ArrayList<>(Arrays.asList("a","b","c"));
   //     ArrayList<String> arr2 = new ArrayList<>(Arrays.asList("a","b","c"));
 //       System.out.println(arr1.equals(arr2)); // This will return true
  //      System.out.println(arrlList.equals(arr1)); // This will return false

        // REMOVE METHOD
  //      System.out.println(arr1);
  //      arr1.remove("b");
 //       System.out.println(arr1);

        // INDEX OF METHOD
 //       System.out.println(arr2.indexOf("c"));

        // LAST INDEX OF
//        arr2.add("4");
 //       arr2.add("5");
 //       arr2.add("6");
//        arr2.add("a");
//        System.out.println(arr2.lastIndexOf("a"));
//        System.out.println(arr2.indexOf("a"));

        // is EMPTY checks if the list is empty or not, returns boolean
//        System.out.println(arr2.isEmpty());
//        arr2.clear();
//        System.out.println(arr2.isEmpty());


        // ADD ALL METHOD
        ArrayList<String> listA1 = new ArrayList<>();
        listA1.add("First and only value");
        String[] arrToA1 = {"This contains", "several", "values","you can","also","add more"};
        listA1.addAll(Arrays.asList(arrToA1));
        listA1.add("after adding a list of items");
        System.out.println(listA1);

        // Remove all method
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,2,3,4,4,4,4,4,5,5,56,9));
        numbers.removeAll(Arrays.asList(1,4));
        System.out.println(numbers);

        ArrayList<String> names = new ArrayList<String>(Arrays.asList("Kristian", "Christopher", "Alex", "Trent", "Muammer", "Sebastian", "Ethan", "Nathaniel"));
        Collections.sort(names);
        System.out.println(names);








    }
}
