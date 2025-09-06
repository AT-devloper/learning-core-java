//  5 sep 2025
//  Back Tracking

import java.util.List;
import java.util.ArrayList;

class dc_17
{
    static void genSub(int arr[],List<Integer> li,int index)
    {
        if(index==arr.length)
        {
            System.out.print(li);

            return ;
        }
        li.add(arr[index]);
        genSub(arr,li,index+1);

        li.remove(li.size()-1);
        genSub(arr,li,index+1);
    }
    
    public static void main(String ar[])
    {
      int arr[]={1,2,3};
      List<Integer>li=new ArrayList();
      genSub(arr,li,0);
    }
}