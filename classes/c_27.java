//
//

class c_27
{
    public static void main(String ar[])
    {
        String Str ="AYUSH";
        String str ="ayu";

       char arry[]= Str.toCharArray();
       char arr[]= str.toCharArray();

       for(int i=0;i<arry.length;i++)
       {
            int count=0;
        for(int j=0;j<arr.length;j++)
        {   
            if(arry[i]==arr[j])
            {
                j++;
                count++;
            }
        }
        if(j==str) System.out.print("Sub");
       }


    }
}

//
//