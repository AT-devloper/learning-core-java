// 7+8 may 2025
// loops (for,while,do-while)


import java.util.Scanner;
class Prc_4
{
    public static void main(String ar[])
    {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter number :- ");
        int num = sc.nextInt();
        

        // for(int i=0;i<=num;i++){
        //     System.out.println(i);
        // }
        // int fac=1;
        // if(num<=0){
        //     System.out.println("number are smaller or equals to 0 ");
        // }
        // else{
        //     for(int i=1; i<=num; i++)
        //     {
        //         fac=fac*i ;
        //         System.out.println(fac);
        //         //     }
        // }
        // int i=1,sum=0;
        // if(num>=1)
        // {
        //     while(num>=i)
        //     {
        //         sum=sum+i;
        //         i++;
        //         System.out.println(sum);
        //     }
        // }

        // int sum=0;
        // for(int i=1;i<=num;i++)
        // {
        //     sum=sum+(i*i);
        //     System.out.print(sum +" ");
        // }

    // for(int i=2;i<=num;i++){
    //     for(int j=1;j<=10;j++)
    //     {   
    //         int tb=i*j;
    //         System.out.print(tb +"\t ");
    //     }
    // }

    // for(int i=2;i*i<=num;i++)
    // {
    //     if(num%i==0)
    //     {
    //         System.out.println("Not A Prime number");
    //     }
    //     else{
    //         System.out.println(num +" Is Prime number");
    //     }
    // }

    // int rev = 0;
    // while(num>0)
    // {
    //     int digit=num % 10;
    //     rev = rev * 10 + digit;
    //     num = num / 10;
    // }
    // System.out.println(rev);

    // int sum=0,count=0;

    // while(num>0){
    //     int digit=num%10;
    //     sum=sum+digit;
    //     num=num/10;
    //     count++;
        
    // }
    
    // System.out.println(count);

//     int sum=0;
// while(num>0){
//     int digit=num%10;
//     sum=sum+digit;
//     num=num/10;
// }
//  System.out.println(sum);

    // FEBONACCI SERIES

    // int fi=0,sec=1,nxt;
    // System.out.println(fi);
    // System.out.println(sec);
    // for(int i=3;i<=num;i++){
    //     nxt = fi+sec;
    //     fi=sec;
    //     sec=nxt;
    //     System.out.println(nxt);
    // }


    // int rev=0,ple;
    // ple=num;
    // while(num>0)
    // {
    //     int digit=num%10;
    //     rev=rev*10+digit;
    //     num=num/10;
    // }
    // if(ple==rev){
    //     System.out.println("PELENDROM");
    // }    
    // else{
    //     System.out.println("NOt A PELENDROM");
    // }
   
//    int sum=0,ams;
//    ams=num;
//    while(num>0){
//     int digit = num%10;
//     sum+=(digit*digit*digit);
//     num= num/10;

//    } 
//    if(ams==sum)
//    {
//     System.out.println("AMSTRONG");
//    }
//    else {System.out.println("NOT A AMSTRONG");}

    // int num1 = sc.nextInt();
    // int hcf;
    // for(int i=1 ;i<=num && i<=num1 ; i++)
    // {
    //     if(num%i==0 && num1%i==0)
    //     {
    //         hcf=i;
    //         System.out.println(hcf);
    //     }}

    int num1 = sc.nextInt();

    int mx=(num>num1)?num:num1;
     int i=mx;

     while (true)
     {
        if(num%i==0 && num1%i==0){
            break;
        }
            i+=mx;
     }
      System.out.println(i);

    
    
    




    









    }




}