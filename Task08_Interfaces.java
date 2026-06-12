interface Vehicle
{
    void start();
}
class Car implements Vehicle
{
    @Override
    public void start()
    {
        System.out.println("Turning on the ignition button");
        System.out.println("Checking fuel level");
        System.out.println("Car Started Successfully");
    }
}
public class Task08_Interfaces
{
    public static void main(String[] args)
    {
        Car obj = new Car();
        obj.start();
    }
}