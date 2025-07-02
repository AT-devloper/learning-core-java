//  28 june 2025
//  Inheritance - Multi level and Hierarchical.

class c_35
{
    public int a;
}

class Second extends c_35
{
    public String b;
}

class Third extends Second
{
    public static void main(String ar[])
    {
    Third obj=new Third();
    obj.a=1;
    obj.b="Poddar";

    System.out.println(obj.a);
    System.out.println(obj.b);
    }
}