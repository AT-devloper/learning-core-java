//
//

class c_31
{   
    int a;
    c_31()  
    {
        System.out.println("DF :- " +a);
    }
    c_31(int a)
    {
        this.a=a;
        System.out.println("OL Parameterized :- " +this.a);
    }
    c_31(c_31 obj1)
    {
        this.a=obj1.a;
        System.out.print("Copy :- " +this.a);
    }
    public static void main(String ar[])
    {
        c_31 obj=new c_31();        // Default
        c_31 obj1=new c_31(1);      // Overloaded
        c_31 objc=new c_31(obj1);   // Copy 
        
    }
}

//
//