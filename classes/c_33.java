//  27 june 2025
//  Encaptulation & Abstraction .

class c_33
{   
    int a;
    String b;

    void bind(int a , String b)
    {
        this.a=a;
        this.b=b;
    }
    void Display()
    {
        System.out.println(a +" " +b);
    }
    
    public static void main(String ar[])
    {
        c_33 obj = new c_33();
        obj.bind(1 , "Ayush");

        obj.Display();
    }
}

//  Encaptulation - Data binding (member variable value to asign through member function).
//  Abstraction - Thay provide's PRIVACY and Showing Neccessory data (value) and hiding Unneccessory data (variable). 