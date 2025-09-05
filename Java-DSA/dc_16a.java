//  4 sep 2025
//  Tight Coupling

class Bike
{
    void drive()
    {
        System.out.println("Rider start drive Bike.");
    }
}
class Car
{
    void drive()
    {
        System.out.println("Rider start drive Car.");
    }
}
class Truck
{
    void drive()
    {
        System.out.println("Rider start drive Truck.");
    }
}

class Rider
{
    Bike obj =new Bike();
    Car obj1 = new Car();
    Truck obj2 = new Truck();

    void driveBike()
    {
        obj.drive();
    }
    void driveCar()
    {
        obj1.drive();
    }
    void driveTruck()
    {
        obj2.drive();
    }
}

class dc_16a
{
    public static void main(String ar[])
    {
        Rider rider=new Rider();
        rider.driveBike();
        rider.driveCar();
        rider.driveTruck();
    } 
}