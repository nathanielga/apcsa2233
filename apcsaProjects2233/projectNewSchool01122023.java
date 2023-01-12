package apcsaProjects2233;
public class projectNewSchool01122023
{
    public static void main(String[] args) {
        projectSchool school1 = new projectSchool("Harmony Science Academy","San Antonio",true);
    }
}


class projectSchool
    {
            String location;
            String name;
            boolean isStemSchool;

        public projectSchool(String name, String location, boolean isStemSchool) {
            this.name = name;
            this.location = location;
            this.isStemSchool = isStemSchool;
        }
        public void getInfo()
        {
            if (isStemSchool=true)
            {
                System.out.println(name+" is located in "+location+" and is a stem school.");
            }
            else
            {
                System.out.println(name+" is located in "+location+" and is not a stem school.");
            }

        }

    }
