package apcsaProjects2233;
public class projectCompensation {
    int baseSalary;
    int step;
    String location;
    public static void main(String[] args)
    {
        System.out.println( findTotalSalary("San Antonio",5,"Mathematics","Masters"));
    }
    public static int findTotalSalary(String location, int step, String subject, String degree)
    {
        int Salary = 0;
        if (location.equalsIgnoreCase("Houston") || location.equalsIgnoreCase("Beaumont") || location.equalsIgnoreCase("Bryan"))
        {
            Salary = 57000;
        }
        else if (location.equalsIgnoreCase("Dallas") || location.equalsIgnoreCase("Waco") || location.equalsIgnoreCase("Odessa") || location.equalsIgnoreCase("Fort Worth"))
        {
            Salary = 56500;
        }
        else if (location.equalsIgnoreCase("San Antonio")||location.equalsIgnoreCase("Laredo")||location.equalsIgnoreCase("Brownsville"))
        {
            Salary=55000;
        }
        else if(location.equalsIgnoreCase("El Paso"))
        {
            Salary=55500;
        }
        else if(location.equalsIgnoreCase("Austin")||location.equalsIgnoreCase("Lubbock"))
        {
           Salary=54000;
        }
        if(subject.equalsIgnoreCase("Mathematics")||subject.equalsIgnoreCase("Science")||subject.equalsIgnoreCase("ESL")||subject.equalsIgnoreCase("Special Education"))
        {
            Salary=Salary+3000;
        }
        else if(subject.equalsIgnoreCase("GT")||subject.equalsIgnoreCase("Computer, Technology Applications"))
        {
            Salary=Salary+2000;
        }
        else if(subject.equalsIgnoreCase("ELA")||subject.equalsIgnoreCase("Social Studies")||subject.equalsIgnoreCase("Generalist"))
        {
            Salary=Salary+1000;
        }
        else if(subject.equalsIgnoreCase("Campus Instructional Coach"))
        {
            Salary=Salary+5000;
        }
        if(step>=5&&step<=9)
        {
            Salary=Salary+1000;
        }
        else if(step>=10||step<=30)
        {
            Salary=Salary+2000;
        }
        if(degree.equalsIgnoreCase("Masters"))
        {
            Salary=Salary+1000;
        }
        else if(degree.equalsIgnoreCase("Doctoral"))
        {
            Salary=Salary+2500;
        }
         return Salary+(step*250);
    }
}           

