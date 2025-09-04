//  4 sep 2025
//  Sliding window

class prc_9
{
    static int subm(int arr[],int size)
    {
        if(arr.length<size);

        int ws=0;
        for(int i=0;i<size;i++)
        {
            ws=ws+arr[i];
        }
        int Max=ws;
        for(int i=size;i<arr.length;i++)
        {
            ws=ws+arr[i]-arr[i-size];

            Max=Math.max(ws,Max);
        }
        return Max;
    }
    public static void main(String ar[])
    {
        int arr[]={1,2,3,4,5,6,7};
        int size=3;

        System.out.print(subm(arr,size));
    }
}