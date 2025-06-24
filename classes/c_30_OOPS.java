//  23 June 2025
//  OOPS Starting

class c_30_OOPS
{
    int a;              // Member Variable

    void set(int a)     // Member Function
    {
        this.a=a;       // (this) - This oprator repersent instance variable of  current class.
    }
    void get()  
    {
    System.out.println(a);
    }

    public static void main(String ar[])
    {

        c_30 obj = new c_30();        // Use Always Current Class name.
        obj.set(51);
        obj.get();

    }
}

//
//