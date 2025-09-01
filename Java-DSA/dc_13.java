//  
//  Binary Search

class dc_13
{
    static int biSearch(int arr[],int target)
    {
        int left=0;
        int right=arr.length-1;
        
        while(left<=right)
        {
            int mid=left+(right-left)/2;

            if(arr[mid]==target)    return mid;
            else if(arr[mid]<target)    left = mid+1;
            else    right = mid-1;
        }
        return -1;
    }

    public static void main(String ar[])
    {
        int arr[]={0,2,4,6,8,10};
        int target=10;

        int found = biSearch(arr,target);

        System.out.print(found==-1 ? "No " : "Yes " +target +" is present in index " +found );
    } 
}

//