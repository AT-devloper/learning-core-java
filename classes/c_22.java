//  June 2025
// 


class c_22
{
    public static void main(String ar[])
    {
    //     int arr[]={0,2,0};
    //     int n=arr.length;

    //     int dp=0;       //  DUPLICTE
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


    // int arr[]={1,1,3,4,6,3,4,6,9};      // UNIQUE
    // int un=0;
    // for(int Arr : arr)
    // {
    //     un=un^Arr;
    // }
    // System.out.print("Unique :- "  +un);

    int arr[]={1,1,1,3,4,3,4,9}; 
    int fn=0;

    for(int i=0; i<arr.length;i++)
    {
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i] == arr[j])
            {
                fn++;
                break;
            }
        }
        
    }
    System.out.print(fn);







    }
}

//  2nd largest
//  Duplicate
//  Uniqu
//  Friqancy