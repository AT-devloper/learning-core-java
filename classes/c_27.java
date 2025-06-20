// 18 June 2025
//  String - Subsequence

class c_27
{
    static void check(String Str , String str)
    {
    //     char arry[] = Str.toCharArray();                 // Usig for-loop
    //     char arr[]  = str.toCharArray();
    //     int count=0;

    //    for(int i=0;i<arry.length;i++)
    //    {    
    //     for(int j=0;j<arr.length;j++)
    //     {   
    //         if(arry[i]==arr[j]) count++; 
    //     } 
    //    }
        
    //     if(count == arr.length)  System.out.print(str +" is subsequance of " +Str);
        
    //     else System.out.print(str +" is not subsequance of " +Str);

    int i=0,j=0;                                        // Using while loop
    while(i<Str.length() && j<str.length())
    {
        if(Str.charAt(i)==str.charAt(j)) j++;
        
        i++;
    }

    if(j==str.length()) System.out.print("Subsequance");
    else System.out.print("Not Subsequance");

    }

    public static void main(String ar[])
    {
        String Str ="AYUSH";
        String str ="AYH";

        check(Str,str);
    }
}

//
//