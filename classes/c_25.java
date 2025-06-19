//  17 June 2025
//  String


class c_25
{
    static char ca(String str)
    {
         char arr[] = str.toCharArray();
            for (int i = 0; i < arr.length; i++) 
            {
                if (arr[i] >= 'a' && arr[i] <= 'z') arr[i] = (char) (arr[i] - 32);
                
                else if(arr[i]>='A' && arr[i]<='Z') arr[i] = (char) (arr[i] + 32);
            
            System.out.print(arr[i]); 
            }

        // String upper = " ";  // str.toUpperCase()
        // String lower = " ";  // str.toLowerCase()
        // char arr[] = str.toCharArray();

        // for (int i = 0; i < arr.length; i++) 
        //     {
        //         if(arr[i]>='A' && arr[i]<='Z')  lower=str.toLowerCase(); 
        //         // else if (arr[i] >= 'a' && arr[i] <= 'z') upper=str.toUpperCase();
        //     }
        //        System.out.println(lower);
        //     // System.out.println(upper);

           return 0; 
    }


    public static void main(String ar[])
    {
        String str = "aYUSH";
        ca(str);
        

        
    }
}
