//  June 2025
// 


class c_22
{
    public static void main(String ar[])
    {
    //     int arr[]={0,2,0};
    //     int n=arr.length;

    //     int dp=0;             //  DUPLICTE
    //     for(int i=0;i<n;i++)
    //     {
    //         for(int j=i+1;j<n;j++)
    //         {
    //             if(arr[i]==arr[j])
    //             {
    //                 dp=arr[j];
    //             }
                
    //         }
    //     }
    // System.out.print("Duplicate :- " +dp);
    


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

    // int arr[] = {1,2,4,1,2,5} ;             // Unique

    // for(int i=0; i<arr.length;i++)
    // {
    //     boolean un = false;
    //     for(int j=i+1 ;j<arr.length;j++)
    //     {
    //         if(arr[i]==arr[j])
    //         {
    //         un=true;
    //         arr[j]=-1;
    //         }
    //     }
    //     if(un==false && arr[i]!=-1)
    //     {
    //         System.out.print(arr[i] +" ");
    //     }
    // }
    







    }
}

//  2nd largest
//  Duplicate
//  Unique
//  Friqancy