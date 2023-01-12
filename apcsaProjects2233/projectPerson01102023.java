package apcsaProjects2233;
public class projectPerson01102023
{
    public static void main(String[] args)
    {
        person person1 = new person();
        person1.name="Alejandro";
        person1.age=17;
        person1.ssn=11202005;
        person1.printInfo();
    }
}
class person
{
        String name;
        int age;
        long ssn;

        public void printInfo()
        {
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
            System.out.println("SSN: "+ssn);
        }
}
