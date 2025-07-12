

class Node{
    int value;
    Node ref;

    Node(int value)
    {
        this.value=value;
        this.ref=null;
    }
}


class Test_4
    {
        public static void main(String ar[])
        {
            Node obj=new Node(10);
            Node obj1=new Node(20);
            Node obj2=new Node(30);

            ref.obj=obj1.ref;
            ref.obj1=obj2.ref;
            ref.obj2=null;
        }
    }