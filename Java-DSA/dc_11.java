//  28 Aug 2025
//  Quick sort

class dc_11
{
    static void Qs(int arr[],int high,int low)
    {
        if(low<high)
        {
        int pivotin = partition(arr,low,high);
        Qs(arr,low,pivotin-1);
        Qs(arr,high,pivotin+1);
        }
    }

    static int partition(int arr[],int low ,int high)
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
                i++;
            }
        }
        int temp = arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        System.out.print(i);
        return i;
    }

    public static void main(String ar[])
    {
       int arr[]={4,5,6,7,1,3};
       int n=arr.length;
       int low=0;

       Qs(arr,low,n-1);
       for(int Q : arr)
       {
        System.out.print(Q +" ");
       }

    }
}

//
