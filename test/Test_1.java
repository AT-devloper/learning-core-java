// 8 may 2025
// 



import java.util.Scanner;
class Test_1
{
    public static void main(String ar[])
    {
        Scanner obj=new Scanner(System.in);
    
        System.out.print("Enter year :- "); //LEAP YEAR
        int year=obj.nextInt();

        if((year%4==0 && year%100!=0)||(year%400==0))
        {
            System.out.println(year +" is Leap Year.");
        }
        else{System.out.println(year +" is Not a leap year.");}


        System.out.print("Enter Alphabet :- "); // VOWEL/CONSONANT
        char word=obj.next().charAt(0);
        if((word=='a' ||word=='e'||word=='o'||word=='u'||word=='i')||
        (word=='A' ||word=='E'||word=='O'||word=='U'||word=='I'))
        {
            System.out.println(word +" is Vowel ");
        }
        else{System.out.println(word +" iS Consonant");}


        System.out.print("Enter temprature :- "); //temprature
        int temp=obj.nextInt();

        if(temp>=0 && temp <10){
            System.out.println("Very Cool Weather");
        }
        else if(temp>=10 && temp< 20){
            System.out.println("Cold Weather");
        }
        else if(temp>=20 && temp< 30){
            System.out.println("Normal in temp");
        }
        else if(temp>=30 && temp< 40){
            System.out.println("Hot");
        }
        else if(temp>=40){
            System.out.println("Very Hot");
        }
        else{
            System.out.println("Freezing Weather");
        }

         System.out.print("Enter Grade :- "); // GREAD - (A B C D E FAIL)
        char gr = obj.next().charAt(0);

        if(gr=='a')
        {
            System.out.println("Exellence");
        }
        else if(gr=='b'){
            System.out.println("very good");
        }
        else if(gr=='c'){
            System.out.println("good");
        }
        else if(gr=='d'){
            System.out.println("fair");
        }
        else if(gr=='e'){
            System.out.println("need work");
        }
        else{
            System.out.println("fail");
        }


        // System.out.print("Enter Your Customer ID :- "); // ELECTRICTY
        // int ID = obj.nextInt(); 

        // System.out.print("Enter Your Name :- ");
        // String name = obj.next(); 

        // System.out.print("Enter Your Units :- "); 
        
        // int unit = obj.nextInt(); 
        // float bill = 0;

        // if(unit <= 0){ 
        // bill = 0; }

        // else{ 
        // if (unit > 600) { 
        // bill += (unit - 600) * 2.00; unit = 600;
        // } 
        // if (unit > 400) { 
        // bill += (unit - 400) * 1.80 ; unit = 400;
        // } 
        // if (unit > 200) {
        //     bill += (unit - 200) * 1.50; unit = 200;
        // } 
        // if (unit > 199) { 
        // bill += (unit - 199) * 1.20; unit = 199;
        // } 
        // } 
        // System.out.println(" Your Id " +ID  +" Name " +name +" Bill is:- " + bill );











    }
}


//
//