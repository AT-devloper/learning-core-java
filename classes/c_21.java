//  5 June 2025
//  Array


class c_21
{
    public static void main(String ar[])
    {
        int arr[]={1,12,5,3,9};
        int n=arr.length;


        // Minimum
        int min=arr[0];
        System.out.print("Min :- ");
        for(int i=0 ; i< n ; i++)
        {
            if(min > arr[i]){
                min=arr[i];
            }
        }
        System.out.print(min);
                                                System.out.println();
        // Maximum
        int mx=arr[0];
        System.out.print("Max :- ");
        for(int j=0 ; j< n ; j++)
        {
            if(mx < arr[j]){
                mx=arr[j];
            }
        }
        System.out.print(mx);
    }
}

//
//