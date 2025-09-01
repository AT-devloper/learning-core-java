//  1 sep 2025
//  Binary searching

class dc_13a
{
    static int BS(int arr[],int target)
    {
        int low=0;
        int high=arr.length-1;

        while(low<=high)
        {
            int mid=(high+low)/2;

            if(arr[mid]==target)    return mid;
            else if(arr[mid]<target)    low=mid+1;
            else    high=mid-1;

        }
        return -1;
    }
    public static void main(String ar[])
    {
        int arr[]={1,2,3,4,5,6};
        int target=5;

        System.out.print(BS(arr,target));
    }
}