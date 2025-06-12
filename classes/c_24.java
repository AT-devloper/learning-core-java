//  12 june 2025
//  Functions - HW

class c_24
{
    static int sum(int arr[])
    {   
        int s=0;
        for(int i=0;i<arr.length;i++)    s+=arr[i];

        System.out.print("Sum :- " +s);
      return 0;
    }

    static int rev(int arr[])
    {   
        boolean pl=true;    

        for(int i=0;i<arr.length/2;i++)
        {
            int temp=arr[arr.length-i-1];           // For Reverse
            arr[arr.length-i-1]=arr[i];
            arr[i]=temp;

            if(arr[i]!=arr[arr.length-i-1])         // For Palindrome
            {
                pl=false;
            }
        }

        System.out.print("rev :- " );
        for(int re : arr) System.out.print(re +" ");

        System.out.println();
        if(pl) System.out.print("This is Palindrome");
        else  System.out.print("This is Not Palindrome");
        return 0;
    }


    static int friqancy(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {   
            if(arr[i]!=-1)
            {
            int fr=1;
            for(int j=i+1;j<arr.length;j++)
            {   
                if(arr[i]==arr[j])
                {
                fr++;
                arr[j]=-1;
                } }
               System.out.println(arr[i] +" :- " +fr);
            } }
    return 0;
    }

    static int unique(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {   
            boolean un=true;
            for(int j=i+1;j<arr.length; j++)
            {   
                if(arr[i]==arr[j])
                {
                un=false;
                arr[j]=-1;
                }
            }
            if(arr[i]!=-1 && un==true)
            {
                    System.out.print("unique :- " +arr[i] +" ");
            }
        }
        return 0;
    }

    static int duplicate(int arr[])
    {
        int dp=0;
        System.out.print("Duplicate :- ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {   
                if(arr[i]==arr[j]) System.out.print(arr[i] +" ");   
            }}
    
        return 0;
        }
    


    
    
    public static void main(String ar[])
    {
        int arr[]={1,2,3,2,1};
        
        // sum(arr);
        // System.out.println();
        // rev(arr);
        // System.out.println();
        // friqancy(arr);
        // System.out.println();
        // unique(arr);
        // System.out.println();
        duplicate(arr);
        
    }
}

//
//