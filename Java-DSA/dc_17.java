//  5 sep 2025
//  Back Tracking

import java.util.*;

class dc_17
{
    void genSub(int arr[],list li,int index)
    {
        if(index==arr.length)
        {
            System.out.print(li);

            return ;
        }

        li.add(arr(index));
        genSub(arr,li,index+1);

        li.remove(arr(index));
        genSub(arr,li,index+1);
    }
    
    public static void main(String ar[])
    {
      int arr[]={1,2,3};
      genSub(arr,new arraylist(),0);

    }
}