//  4 sep 2025
//  Loose Coupling

    interface Vehical
    {
        void drive();
    }

    class Bike implements Vehical
    {
        public void drive()
        {
            System.out.println("Rider start Drive bike.");
        }
    }
    class Car implements Vehical
    {
        public void drive()
        {
            System.out.println("Rider start Drive car.");
        }
    }
    class Truck implements Vehical
    {
        public void drive()
        {
            System.out.println("Rider start Drive truck.");
        }
    }

    class Rider
    {
        Vehical obj;

        public Rider(Vehical obj)
        {
            this.obj=obj;
        }
        public void start()
        {
            obj.drive();
        }
    }

class dc_16
{
    public static void main(String ar[])
    {   
        Vehical truck= new Truck();
        Vehical bike=new Bike();
        Vehical car=new Car();

        Rider obj = new Rider(bike);
        obj.start();
        
        Rider obj1 = new Rider(car);
        obj1.start();
        
        Rider obj2 = new Rider(truck);
        obj2.start();    
    }
}
//
