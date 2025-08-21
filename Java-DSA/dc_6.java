// 20 Aug 2025
//

class dc_6{
    public static void main(String ar[])
    {
    int arr[]={1,3,6,9,4};
    for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr.length-i-1;j++)
        {
            if(arr[j+1]<arr[j])
            {
            int sh=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=sh;
            } 
        }    
    }
    for(int Arr:arr)
        {
            System.out.print(Arr);
        } 

    // int arr[]={12,64,34,47,9};

    // for(int i=0;i<arr.length-1;++i)
    // {
    //     int min = i;
    //     for(int j=i+i;j<arr.length;++j)
    //     {
    //         if(arr[j] < arr[min])
    //         {
    //             min=j;
    //         }
    //     }
    //     int temp=arr[i];
    //     arr[i]=arr[min];
    //     arr[min]=temp;
    // }
    // for(int Arr : arr)
    // {
    // System.out.print(Arr +" ");
    // }
}
    
}