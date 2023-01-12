package apcsaProjects2233;
public class projectCar01052023
{
    public static void main(String[] args)
    {
        Car car1 = new Car();
        car1.make="BMW";
        car1.model="X1";
        car1.color="White";
        car1.year=2014;
        car1.engineSize=2.8;

        car1.getInfo();

        Car car2 = new Car();
        car2.make="Kia";
        car2.model="Sportage";
        car2.color="Grey";
        car2.year=2023;
        car2.mileage=1500;
        car2.engineSize=2.5;

        car2.getInfo();

        Car car3 = new Car();
        car3.make="McLaren";
        car3.model="P1";
        car3.color="Black";
        car3.year=2023;
        car3.engineSize=3.8;

        car3.getInfo();
    }
}
class Car
{
    String make;
    String model;
    int year;
    int mileage;
    String color;
    double engineSize;
    public void getInfo()
    {
        System.out.println("The car is a "+year+" "+make+" "+model+" with an engine size of "+engineSize+" liters with a mileage of "+mileage);
    }
}
