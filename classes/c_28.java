//  19 June 2025
//  Perantheses

class c_28
{   
    static boolean bp(String Str)
    {
        int i=0,curly=0,square=0,circle=0;
        
        while(i<Str.length())
        {
            char ch=Str.charAt(i);

            if(ch=='[') square++ ;
            else if(ch==']') square-- ;
            else if(ch=='{') curly++ ;
            else if(ch=='}') curly-- ;
            else if(ch=='(') circle++ ;
            else if(ch==')') circle-- ;

            ++i ;
        }
        return curly==0 && square==0 && circle==0;
    }

    public static void main(String ar[])
    {
        String Str ="[{()}]";
        if(bp(Str)) System.out.print("Valid");
        else System.out.print("Invalid");
    }
}

//
//