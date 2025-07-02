//  1 july 2025
//  Polymorphism - Method OverRiding . (by class , object)


class Animal
{
    void sound()
    {
        System.out.println("Animal Sound");
    }
}

class cat extends Animal
{
    void sound()
    {
        System.out.println("Cat Sound");
    }
}

class dog extends Animal
{
    void sound()
    {
        System.out.println("Dog Sound");
    }
}

class c_36a
{
    public static void main(String ar[])
    {   
        // // By Class (OverRiding) :- 

        // Animal obj =new cat();
        // obj.sound();
        // Animal obj1 =new dog();
        // obj1.sound();

        //  By Object (OverRiding) :- One Class With Two OverRide Objects.

        Animal obj;

        obj=new cat();
        obj.sound();

        obj=new dog();
        obj.sound();
    }
}

// There Are 3 Types Of Method OverRiding :- 
// By Class , By Object , By Interface .