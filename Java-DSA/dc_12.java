//  29 Aug 2025
//  Linear search

class dc_12

{   
    static int search(int arr[],int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target) return 1;
        }
        return -1;
    }

    public static void main(String ar[])
    {
       int arr[]={2,4,7,9,1};
       int target = 9; 
       int ans=search(arr,target);

       if(ans==1) System.out.print("Yes " +target +" is present");
       else{System.out.print("no");}
        
    }
}

//