//   May 2025
//   


import java.util.Scanner;
class Prc_3
{
    public static void main(String ar[])
    {
        Scanner obj=new Scanner(System.in);

        // System.out.print("Enter year :- ");
        // int year=obj.nextInt();
        // if((year%4==0 && year%100!=0)||(year%400==0))
        // {
        //     System.out.println("Leap Year");
        // }
        // else{System.out.println("Not a leap year");}


        // System.out.print("Enter 3 Number :- ");
        // int a=obj.nextInt();
        // int b=obj.nextInt();
        // int c=obj.nextInt();

        // if(a>b && a>c){
        //     System.out.println("Geater number is " +a);
        // }
        // else if(b>a && b>c){
        //     System.out.println("Geater number is " +b);
        // }
        // else{System.out.println("Geater number is " +c );}

        System.out.print("Enter Website name :- ");
        String web=obj.next();

        if(web.equals("cardekho.com"))
        {
           System.out.println("Select any car => ERTIGA , SUZUKI :- ");
           String car=obj.next();

           if(car.equals("ertiga")){
                System.out.println("CAR RATE IS 100rs");
                System.out.println("Enter journey in km :- ");
                int r=obj.nextInt();
                double p = (108*r)/108;
                double rs=100+p;
                System.out.println("Your car Ertiga " +rs +"Rs is your Amount of journey");

           }
           else if(car.equals("suzuki")){
                System.out.println("CAR RATE IS 200rs");
                
                
                System.out.println("Enter journey in km :- ");
                int r =obj.nextInt();
                double p = (108*r)/108;
                double rs=200+p;
                System.out.println("Your car Ertiga " +rs +"Rs is your Amount of journey");

           }
           else{System.out.println("No car Avilable");}


        }
        else{System.out.println("You try another website");}
        
        
    }
}