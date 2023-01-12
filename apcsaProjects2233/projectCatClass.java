    package apcsaProjects2233;

    public class projectCatClass
    {
        public static void main(String[] args)
        {
            Cat cat1 = new Cat();
            cat1.age=4;
            cat1.breed="Calico";
            cat1.color="Orange";


        }
    }
    class Cat
    {
        String breed;
        String color;
        int age;

        public void sleep()
        {
            System.out.println("The cat sleeps");
        }
        public void eat()
        {
            System.out.println("The cat eats some tuna");
        }
        public void drink()
        {
            System.out.println("The cat drinks some water");
        }


    }

