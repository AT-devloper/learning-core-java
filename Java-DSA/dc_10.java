//  25 Aug 2025
//  

class dc_10
{
    
    static int[] div(int arr[])
    {   
        if(arr.length<=1) return arr;

         int mid=arr.length/2;
            int left[]= new int[mid];
            int right[]=new int[arr.length-mid];

         
                for(int i=0;i<mid;i++)
                {
                    left[i]=arr[i];
                }
                for(int i=mid;i<arr.length;i++)
                {
                    right[i-mid]=arr[i];
                }

       
            left=div(left); 
            right=div(right);
        return merge(left,right);
    }

    static int[] merge(int left[],int right[])
    {
        int result[] = new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;

       while(i<left.length && j<right.length)
        {
            if(left[i]<right[j])
            {
                result[k++]=left[i++];
            }
            else
            {
                result[k++]=right[j++];
            }    
        }
        while(i<left.length)
        {
            result[k++]=left[i++];
        }

        while(j<right.length)               // j
        {
            result[k++]=right[j++];
        }
        return result;   
    }

    public static void main(String ar[])
    {
        int arr[]={0,5,3,1,4};
        
        int ans[]=div(arr);

        for(int Ans : ans)
        {
            System.out.print(Ans +" ");
        }
    }
}

//