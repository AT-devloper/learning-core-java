//  3 sep 2025
//  Sliding window

class dc_15
{
    static int subm(int arr[],int size)
    {
        if(arr.length<size) return -1;

        int ws=0;

        for(int i=0;i<size;i++)
        {
            ws=ws+arr[i];
        }
        int max=ws;
        for(int i=size;i<arr.length;i++)
        {
            ws=ws+arr[i]-arr[i-size];
            max=Math.max(ws,max);
        }
        return max;
    }

    public static void main(String ar[])
    {
        int arr[]={1,2,3,4,5,6,7};
        int size=3;

        System.out.print(subm(arr,size));
    } 
}