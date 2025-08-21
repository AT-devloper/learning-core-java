int arr[]={1,3,6,9,4};
    for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr.length-i-1;j++)
        {
            if(arr[j+1]<arr[j])
            {
            int sh=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=sh;}
        }
         System.out.print(sh);
       
    }