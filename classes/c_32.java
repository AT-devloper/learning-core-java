//  26 June 2025
//  Copy Constructor - Shallow / Deep .

class c_32
{
        int b[];
        c_32(int b[])
        {
            this.b=b;   
        }
        c_32(c_32 obj1)                     // Deep Copy Constructor make new memory.
        {  this.b=new int[obj1.b.length];
            this.b[0]=obj1.b[0];
        }
    public static void main(String ar[])
    {
        int b[]={10};
        c_32 obj1 = new c_32(b);
        c_32 obj2 = new c_32(obj1);
     
        System.out.println(obj1.b[0]);
        System.out.println(obj2.b[0]);

        obj1.b[0]=20;

        System.out.println(obj1.b[0]);
        System.out.println(obj2.b[0]);
        

    }
}

//
//