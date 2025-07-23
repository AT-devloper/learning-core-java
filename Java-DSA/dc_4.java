//  16 july 2025
//  QUEUE using Array

class Que{
    int arr[];
    int front , rear;

    Que(int n)
    {
        arr=new int[n];
        front=0;
        rear=-1;
    }
}

class dc_4
{
    public static void main(String ar[])
    {
        Que obj = new Que(3);
        obj.arr[++obj.rear]=10;
        obj.arr[++obj.rear]=20;
        obj.arr[++obj.rear]=30;

        for(int i=obj.front ; i<=obj.rear ; i++)
        {
            System.out.println(obj.arr[i]);
        }
    }
}

// Queue = Fifo - First in first out.