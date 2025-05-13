// 8 may 2025
// if else test 

import java.util.Scanner;
class Test_1
{
    public static void main(String ar[])
    {
        Scanner obj=new Scanner(System.in);
    
        System.out.print("(Q1) Enter year :- "); //LEAP YEAR
        int lyear=obj.nextInt();

        if((lyear%4==0 && lyear%100!=0)||(lyear%400==0))
        {
            System.out.println(lyear +" is Leap Year.");
        }
        else{System.out.println(lyear +" is Not a leap year.");}


        System.out.print("(Q2) Enter Alphabet :- "); // VOWEL/CONSONANT
        char word=obj.next().charAt(0);
        if((word=='a' ||word=='e'||word=='o'||word=='u'||word=='i')||
        (word=='A' ||word=='E'||word=='O'||word=='U'||word=='I'))
        {
            System.out.println(word +" is Vowel ");
        }
        else{System.out.println(word +" iS Consonant");}


        System.out.print("(Q3) Enter temprature :- "); //temprature
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

         System.out.print("(Q4) Enter Grade (E V G A F) :- "); // GREAD - (E V G A F)
        char gr = obj.next().charAt(0);

        if(gr=='e'|| gr=='E')
        {
            System.out.println("Exellence");
        }
        else if(gr=='v'|| gr=='V'){
            System.out.println("very good");
        }
        else if(gr=='g'|| gr=='G'){
            System.out.println("good");
        }
        else if(gr=='a'||gr=='A'){
            System.out.println("avarage");
        }
        else if(gr=='f'||gr=='F'){
            System.out.println("fail");
        }
        else{
            System.out.println("fail");
        }


        System.out.print("(Q5) Enter Year :- ");             // Days in month
        int year=obj.nextInt();

        System.out.print ("Enter month (1-12) :- ");
        int month=obj.nextInt();

        if(month==2)
        {   
            if((year%4==0 && year%100!=0)||(year%400==0)){ 
            System.out.println("Year- "+year +" Month- "+month +" Days- 29");
            }
            else{
                System.out.println("Year- "+year +" Month- "+month +" Days- 28");
            }
        }
        else if(month== 1|| month== 3|| month== 5|| month== 7|| month== 8|| month== 10 || month== 12)
        {
                System.out.println("Year- "+year +" Month- "+month +" Days- 31");
        }
        else{
            System.out.println("Year- "+year +" Month- "+month +" Days- 30");
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