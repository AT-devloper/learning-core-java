//  17 june 2025
//  String

class c_26
{

static char ca(String str)
    {
        char arr[] = str.toCharArray();
            for (int i = 0; i < arr.length; i++) 
            {
                if (arr[i] >= 'a' && arr[i] <= 'z') arr[i] = (char) (arr[i] - 32); //97-122
                
                else if(arr[i]>='A' && arr[i]<='Z') arr[i] = (char) (arr[i] + 32); // 65-90
            
            System.out.print(arr[i]); 
            }
               return 0;
    }

    public static void main(String ar[])
    {

        String str = "aKSHARA";
        ca(str);
        
    }
}

// input array = 5,0,7,5,3,3
//
