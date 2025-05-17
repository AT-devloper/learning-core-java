//  16 may 2025
//  GO-TO - first generation of loop 
//  they make our code unreadable
//  forward reverse jumping

//  LOOP - to perform iterations.
//  DO-WHILE / WHILE / FOR / FOR-EACH. - Use According / depend to the situations
//  DO-WHILE - Exit control.
//  WHILE - position of veriable. - Entry Controled loop
//  FOR - (position) initialize break int / dec / multi / divid.


import java.util.Scanner;
class Ten
{
    public static void main(String ar[])
    {
        {
            
            // int sum=0;                   // Sum of first natural numbers
            // for(int i=1;i<=10;++i)
            // {
            //     sum=sum+i;
            // }
            // System.out.print("The sum of an natural numbers is :- " +sum);


            // int fac=1;              //Factorial
            // for(int i=1;i<=10;++i)
            // {
            //     fac=fac*i;
            // }
            // System.out.print("Factorial :- " +fac);

        Scanner sc=new Scanner(System.in);    

        // System.out.print("Enter 2 numbers :- ");     // HCF - Higher common factors
        // int num = sc.nextInt();                      // this type of are avilable in 2 devident
        // int num1 = sc.nextInt();
        // int min=(num<num1)?num:num1;

        //     for(int i=1 ;i<=min; i++)
        //     {
        //         if(num%i==0 && num1%i==0)
        //         {
        //             System.out.println(i);
        //         }
        //     }


        System.out.print("Enter 2 numbers :- ");   // LCM - Least Common Multiple 
            int n=sc.nextInt();                    // those type of number they completly divids the given 2 number 
            int n1=sc.nextInt();

                int mx=(n>n1)?n:n1;
                int i=mx;                                

                //  while(true)
                //     {
                //         if(i%n==0 && i%n1==0)  
                //         {   
                //             System.out.println(i);
                //             break;
                //         }
                //         i=i+mx;                      //  incorrect - if(n%i ==0 && n1%i ==0)  
                                                        //  correct - if(i%n ==0 && i%n1 ==0) 
                //     }
                //     mx++;                    


                    while(true)
                    {
                        if(i%n==0 && i%n1==0)
                        {
                            break;
                        }
                        i=i+mx;
                    }
                    System.out.println(i);

        }
    }
}

