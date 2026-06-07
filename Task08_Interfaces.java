/*
Task 8: Implementing Interfaces

Criteria:
1. Define an interface with a method signature.
2. Implement the interface in a class.
3. Instantiate the class and call the implemented method.
*/

// Criteria 1: Define an interface with a method signature
interface Vehicle
{
    void start();
}

// Criteria 2: Implement the interface in a class
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
        // Criteria 3: Instantiate the class and call the method
        Car obj = new Car();
        obj.start();
    }
}