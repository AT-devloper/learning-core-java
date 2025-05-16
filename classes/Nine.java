//  15 May 2025
//  Switch Case

import java.util.Scanner;
class Nine
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("What you want (VEG / FRUIT) :- ");
        String want=sc.next();
        switch(want)
        {
            case "veg" -> {
                System.out.print("Enter any one (Baingan / Aloo / Matar ) :- " );
                String sabji=sc.next();
                    switch(sabji)
                    {
                        case "baingan" -> {System.out.println("Baingan Packed ");} 
                        case "aloo" -> {System.out.println("Aloo Packed ");} 
                        case "matar" -> {System.out.println("Matar Packed ");} 
                        default -> {System.out.println(sabji +" is not Avilable");}
                    }
                }

            case "fruit" -> {
                System.out.print("Enter any one (Apple / Kela / Orange ) :- ");
                String fhal=sc.next();
                    switch(fhal)
                    {
                        case "apple" -> {System.out.println("Apple Packed ");}
                        case "kela" -> {System.out.println("Kela Packed ");}
                        case "orange" -> {System.out.println("Orange Packed ");}
                        default -> {System.out.println(fhal +" is not Avilable");}
                    }
                }

            default -> {
                System.out.println(want +" is not Avilable");
               }
        }


        // switch (want)
        // {
        //     case "veg" :{System.out.print("Enter veg name :- ");
        //                 String item=sc.next();
        //                 switch(item)
        //                 {
        //                 case "le" : {System.out.println("baingan");
        //                 }
        //                 break;
        //                 default : {System.out.println("bye");}
        //                 }
        //                 break; 
        //     }
        //     default : {System.out.println("bye");}

        // }
    }
}
