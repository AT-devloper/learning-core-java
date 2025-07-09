//
//

class Prc_7
{
    public static void main(String ar[])
    {
    // String str="0000123456";

    // int in=0;
    // while(in<str.length() -1 && str.charAt(in)=='0') 
    // {
    //     in++;
    // }
    
    // System.out.print(str.substring(in));

    String str = "ABCD";

    char arr[]=str.toCharArray();
    int le=0,re=str.length()-1;

    while(le<re)
    {
       char temp=arr[le];
       arr[le]=arr[re];
       arr[re]=temp;

        le++;
        re--;
    }
    System.out.println(str);
    System.out.print(arr);

}}
