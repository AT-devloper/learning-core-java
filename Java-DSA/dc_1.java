//  12 July 2025
//  Link list

class Node{
    int value;
    Node ref;

    Node(int value)
    {
        this.value=value;
        this.ref=null;
    }
}

class dc_1
    {
        public static void main(String ar[])
        {
            Node obj1=new Node(10);
            Node obj2=new Node(20);
            Node obj3=new Node(30);
            Node obj4=new Node(40);

            obj1.ref=obj2;
            obj2.ref=obj3;
            obj3.ref=obj4;
            obj4.ref=null;

            Node obj = obj1;        // Reference pointout = Hashcode
                while(obj!=null)
                {
                    System.out.print(obj.value +" ");
                    obj=obj.ref;
                }
        }
    }