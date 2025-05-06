 // 5 may 2025
 // 

import java.util.Scanner;
 //     Package | Class

class Prc_1
    {
        public static void main(String ar[])
        {
            Scanner obj=new Scanner(System.in);
            char word ;

            System.out.print("Enter charector :-  ");
            word=obj.next().charAt(0);

            // if(give>='a' && give<='z')
            // {
            //     System.out.println("Small Alphabate :- " +give);
            // }
            // else if(give>='A' && give<='Z')
            // {
            //     System.out.println("capital Alphabate :- " +give);
            // }
            // else {
            //     System.out.println("Symbol :- " +give);
            // }

            if(Character.isLowerCase(word))
            {
                System.out.println("Lowercase :- " +word);
            }
            else if (Character.isUpperCase(word))
            {
                System.out.println("Uppercase :- " +word);
            }
            else if(!Character.isLetterOrDigit(word))
            {
                System.out.println("Symbol :- " +word);
            }
            else if(Character.isDigit(word))
            {
                System.out.println("Digit :- " +word);
            }
            else{
                System.out.println("Other :- " +word);
            }
        }
    }

 // Character is a Keyword;
 // Functions :-
 // isLowerCase(),isUpperCase(),isDigit(),isLetterOrDigit();
