//  1 july 2025
//  Polymorphism - Method Overloading.

class c_36
{   //  Function Overloading.
    void sum()
    {
        System.out.println("Sum 1");
    }
    
    void sum(int a)
    {
        System.out.println("Sum " +a);
    }

    public static void main(String ar[])
    {
        c_36 obj = new c_36();
        obj.sum();
        obj.sum(2);
    }
}

//  Many Foem Of Polymorphism :- 
//  functions (Method Overloading),
//  Objects (Method OverRiding).