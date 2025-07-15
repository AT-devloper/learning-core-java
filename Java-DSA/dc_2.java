//  14 july 2025
//  Stack using Array


class Stack
{
    int arr[];
    int top;
    Stack(int n)
    {
        arr=new int[n];
        top=-1;
    }
}

class dc_2
{
    public static void main(String ar[])
    {
        Stack s=new Stack(3);
        s.arr[++s.top]=11;
        s.arr[++s.top]=12;
        s.arr[++s.top]=13;

    for(int i=s.top;i>=0;i--)
    {
        System.out.println(s.arr[i]);
    }
        } }

//