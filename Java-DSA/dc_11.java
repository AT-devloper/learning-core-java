//  28 Aug 2025
//  Quick sort

class dc_11
{
    static void Qs(int arr[],int low,int high)
    {
        if(low<high)
        {
        int pivotin = part(arr,low,high);
        
        Qs(arr,low,pivotin-1);
        Qs(arr,pivotin+1,high);
        }
    }

    static int part(int arr[],int low ,int high)
    {
        int pivot=arr[high];
        int i=low;

        for(int j=low;j<high;++j)
        {
            if(arr[j]<pivot)
            {
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                ++i;
            }
        }
        int temp = arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
     
        return i;
    }

    public static void main(String ar[])
    {
       int arr[]={4,5,6,7,1,3};
       int high=arr.length-1;
       int low=0;

       Qs(arr,low,high);
       for(int Q : arr)
       {
        System.out.print(Q +" ");
       }

    }
}

//
