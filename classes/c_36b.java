//  1 july 2025
//  Polymorphism - Method OverRiding (by interface).

interface engine
{
    void start();
}

class el implements engine
{
    public void start()
    {
        System.out.println("Electric Engine Start");
    }
} 

class pt implements engine
{
    public void start()
    {
        System.out.println("Petrol Engine Start");
    } 
}

class dl implements engine
{
    public void start()
    {
        System.out.println("Diesel Engine Start");
    }
}

class c_36b
{
    public static void main(String ar[])
    {
        el obj = new el();
        obj.start();

        pt obj1 = new pt();
        obj1.start();

        dl obj2 = new dl();
        obj2.start();         
    }
}

// INTERFACE = Abstract - function - method overiding - Using implement keyword - an Abstract class no object creating . 