//  14 july 2025
//  Stack using Link-list

class Node
{
    int value;
    Node ref;

    Node(int value) {
        this.value=value;
        this.ref = null;
    }
}

class dc_3a
{
    public static void main(String ar[])
    {
        Node top=null;

        Node obj1=new Node(11);
        obj1.ref=top;
        top=obj1;

        Node obj2=new Node(12);
        obj2.ref=top;
        top=obj2;

        Node obj3=new Node(13);
        obj3.ref=top;
        top=obj3;

        Node obj=top;
        while(obj!=null)
        {
            System.out.println(obj.value);
            obj=obj.ref;
        }

    }
}