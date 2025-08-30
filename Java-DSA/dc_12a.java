//  30 Aug 2025
//  Leaner searching with to element

class dc_12a
{
    static void search(int arr[],int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    System.out.print("Yes " +arr[i] +" + " +arr[j] +" = " +target);
                     return;
                }   
            }
        }
        System.out.print("No two element are there for " +target);
    }
    public static void main(String ar[])
    {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int target=9;
        search(arr,target);
    }
}