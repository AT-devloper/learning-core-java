//  18 July 2025
//  

class Timp
{
    int data;
    Timp left;
    Timp right;
    Timp(int data)
    {
        this.data=data;
        left=null;
        right=null;
    }
}
class dc_5
{
    public static void main(String ar[])
    {
        Timp obj=new Timp(10);
        obj.left=new Timp(20);
        obj.right=new Timp(30);

        System.out.println(obj.data);
        System.out.println(obj.left.data);
        System.out.println(obj.right.data);
    }
}