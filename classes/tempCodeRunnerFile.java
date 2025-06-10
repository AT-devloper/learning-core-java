int arr[]={1,1,1,3,4,3,4,9};    // Friquancy
    int n=arr.length;
    for(int i=0;i<n;i++)
    {   
        if(arr[i]!=-1)
        {
            int fr=1;
            for(int j=i+1;j<n;j++)
            {   
                if(arr[i]==arr[j])
                {
                fr++;
                arr[j]=-1;
                }
            }
            System.out.println(arr[i] +" :- " +fr);
        }
    }