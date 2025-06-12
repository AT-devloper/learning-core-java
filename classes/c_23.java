// 10 june
//  Array


class c_23
{
    public static void main(String ar[])
    {
        // int arr[]={1,1,4,1,6,4,6,2};      //missing

        // for(int i=0;i<arr.length;i++)
        // {
        //     if(arr[i]!=-1)
        //     {
        //     int fr=1;
        //     for(int h=i+1;h<arr.length;h++)
        //     {
        //         if(arr[i]==arr[h])
        //         {
        //             fr++;
        //             arr[h]=-1;
        //         }
        //     }
        //     System.out.println(arr[i] +" :- " +fr);
        //     }
        // }

    // int arr[]={1,3,5,7,9};
    // for(int i=0; i<arr.length-1;i++)
    // {
    //     if(arr[i+1]-arr[i]>1) System.out.print(arr[i]+1 +" ");
    // }

    int arr[]={1,3,5,7,9,15};     // Multiple missing
    for(int i=0; i<arr.length-1;i++)
    {
        if(arr[i+1]-arr[i]>1) 
        {
            for(int j=arr[i]+1 ; j<arr[i+1] ; ++j)
            {
                System.out.print(j +" ");
            }
        }
    }


    
    }
}

