// 3 may 2025
// taking input

import java.util.Scanner;
class Five

{
    public static void main(String ar[])
    {
        Scanner obj=new Scanner(System.in);

        // 5 WAYS TO GET INPUT FROM USER

            System.out.print("enter int value :- ");
            int a=obj.nextInt();
            System.out.println(a);

            System.out.print("enter float value :- ");
            float f =obj.nextFloat();
            System.out.println(f);

            System.out.print("enter double value :- ");
            double d =obj.nextDouble();
            System.out.println(d);

            System.out.print("enter string value :- ");
            String s=obj.next();
            System.out.println(s);

            System.out.print("enter char value :- ");
            char c =obj.next().charAt(0);
            System.out.println(c);

    }
}

//  Hw
//  about jdk
//  5 ways to get input 




