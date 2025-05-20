//  19 May 2025
//  loop



class Twelve
{
    public static void main(String ar[])
    {
        // int number=1234;
        // int lg=0;
        // while(number!=0)
        // {
        //     int digit= number%10;

        //     if(digit>lg) lg=digit ;

        //     number=number/10;
        // }
        // System.out.println(lg);

        // int rev=0;              //reverse
        // while(number!=0)
        // {
        //     int digit= number%10;
        //     rev=rev*10+digit;
        //     number=number/10;
        // }
        // System.out.println(rev);
        // int num=12;

        // for(int i=2;i*i<=num;i++)
        //     {
        //         if(num%i==0)
        //         {
        //             System.out.println("Not A Prime number");
        //         }
        //         else{
        //             System.out.println(num +" Is Prime number");
        //         }
        //     }

       
    // int number=153;    // number of digit = power is called amstrong number.
    // int sum=0; 
    // int ams=number;

    //  while(num>0)
    //     {
    //         int digit = num%10 ;
    //         sum+=(digit*digit*digit);
    //         num = num/10 ;
    //     } 
    //     if(ams==sum)
    //     {
    //         System.out.println("AMSTRONG Number ");
    //     }
    //     else {System.out.println("NOT A AMSTRONG Number ");} 


   
    // int rev=0;                      // pallindrome - numbers = reverse ( 32123 )
    // int num=32123;
    // int pl=num;

    // while(num!=0)
    // {
    //     int digit=num%10;
    //     rev=rev*10+digit;
    //     num=num/10;
    // }
    // if(pl==rev) System.out.println("pallindrome");
    // else{System.out.println("not pallindrome");}


//    int a=1,n=5,d=2 , nth=0 ;   // AP(nth=a+(n-1)*d;) // series (nth=a+i*d; System.out.println(nth);)

//    for(int i=a ; i<=n ; i++)
//     {
//         nth=a+(i)*d;
//         System.out.println(nth);
//     }
   
           


                // H - W 



    // int number=54748;            // ALL TYPE AMSTRONG NUMBERS
    // int sum=0; 
    // int num=number;
    // int ams=num;
    // int count=0;
        
    //  while(number!=0)
    //     {
    //         int digit = number%10;
    //         count++;
    //         number = number/10;
    //     }

    //     System.out.println("Digit :- " +count);

    // switch(count){

    // case 3 -> {
    //     while(num>0)
    //     {
    //         int digit = num%10 ;
    //         sum+=(digit*digit*digit);
    //         num = num/10 ;
    //     } 
    //     if(ams==sum)
    //     {
    //         System.out.println("AMSTRONG Number ");
    //     }
    //     else {System.out.println("NOT A AMSTRONG Number ");} 
    // }
    // case 4 ->{
    //     while(num>0)
    //     {
    //         int digit = num%10 ;
    //         sum+=(digit*digit*digit*digit);
    //         num = num/10 ;
    //     } 
    //     if(ams==sum)
    //     {
    //         System.out.println("AMSTRONG Number ");
    //     }
    //     else {System.out.println("NOT A AMSTRONG Number ");} 
    // }
    // case 5 ->{
    //     while(num>0)
    //     {
    //         int digit = num%10 ;
    //         sum+=(digit*digit*digit*digit*digit);
    //         num = num/10 ;
    //     } 
    //     if(ams==sum)
    //     {
    //         System.out.println("AMSTRONG Number ");
    //     }
    //     else {System.out.println("NOT A AMSTRONG Number ");} 
    // }
    
    // }


   
        int num=1479;
        int rev=0;
        while(num>0)
        {
            int vl = num%10;
            rev = rev*10+vl;
            num = num/10;
        }
        while(rev!=0)
        {
            int digit = rev%10;
              switch(digit)
                    {   
                        case 0 -> System.out.print("Zero ");
                        case 1 -> System.out.print("One ");
                        case 2 -> System.out.print("Two ");
                        case 3 -> System.out.print("Three ");
                        case 4 -> System.out.print("Four ");
                        case 5 -> System.out.print("Five ");
                        case 6 -> System.out.print("Six ");
                        case 7 -> System.out.print("Seven ");
                        case 8 -> System.out.print("Eight ");
                        case 9 -> System.out.print("Nine ");
                    }
            rev = rev/10;
        }
 
}
}


//  HW - digit to number name