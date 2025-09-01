//  1 Sep 2025
//  Binary Search

class dc_13
{
    static int biSearch(int arr[],int target)
    {
        int left=0;
        int right=arr.length-1;
        
        while(left<=right)
        {
            int mid=left+(right-left)/2;    //Half the array

            if(arr[mid]==target)    return mid;     //Target is at mid
            else if(arr[mid]<target)    left = mid+1;       // target is right side
            else    right = mid-1;              // target is left side
        }
        return -1;      //target not found
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