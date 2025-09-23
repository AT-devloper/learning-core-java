//  23 sep 2025
// Anagram

import java.util.Arrays;
import java.util.*;

class prc_10
{
    static boolean isAnagram(String Str,String str)
    {
        Str=Str.toLowerCase();
        str=str.toLowerCase();

    if(Str.length()!=str.length())  return false;

        char arr1[]=Str.toCharArray();
        char arr2[]=str.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return  Arrays.equals(arr1,arr2);
    }

    public static void main(String ar[])
    {
        String Str="Anagram";
        String str="rangaam";

        System.out.print(isAnagram(Str,str));
    }
}