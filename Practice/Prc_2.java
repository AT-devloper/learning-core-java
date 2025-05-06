
import java.util.Scanner;
class Prc_2
{
    public static void main(String ar[])
    {
        Scanner obj=new Scanner(System.in);

        int unit;
        System.out.print("Enter Unit :- ");
        unit=obj.nextInt();
        if(unit>0 && unit<=50)
        {
            System.out.println(unit*10 +"rs");
        }
        else if(unit>50 && unit<=100)
        {
            System.out.println(unit*20-500 +"rs");
        }
        else if(unit>100 && unit<=150)
        {
            System.out.println(unit*30-2000 +"rs");
        }
        else if(unit>150 && unit<=200)
        {
            System.out.println(unit*40-4500 +"rs");
        }
        else
        {
           System.out.println(unit*50-8000 +"rs"); 
        }
        


        

        





    }
}