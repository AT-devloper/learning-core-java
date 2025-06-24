//  20 June 2025
//  String - Anagram

class c_29
{
        static boolean ag(String Str , String str)
        {
            if(Str.length()!=str.length())   return false;

            int count[]=new int[26];
            for(int i=0;i<Str.length();i++)
            {
                count[Str.charAt(i)-'a']++;
                count[str.charAt(i)-'a']--;
            }
            for(int i=0;i<26;i++)
            {              
                if(count[i]!=0) return false;
            }

            return true;
        }
                    
    public static void main(String ar[])
    {
        String Str ="anagram";
        String str ="ragnaam";

        if(ag(Str,str)) System.out.print("Anagram");
        else System.out.print("Not anagram");

    }
}

//
//