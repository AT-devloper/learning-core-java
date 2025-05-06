// 3 may 2025
// taking input

import java.util.Scanner;
class Five

{
    public static void main(String ar[])
    {
        Scanner obj=new Scanner(System.in);

        // 7 WAYS TO GET INPUT FROM USER

            System.out.print("enter byte value :- ");
            byte y = obj.nextByte();
            System.out.println(y);

            System.out.print("enter int value :- ");
            int a=obj.nextInt();
            System.out.println(a);

            System.out.print("enter float value :- ");
            float f =obj.nextFloat();
            System.out.println(f);

            System.out.print("enter double value :- ");
            double d =obj.nextDouble();
            System.out.println(d);

            System.out.print("enter boolean (T/F) value :- ");
            boolean b = obj.nextBoolean();
            System.out.println(b);

            System.out.print("enter string value :- ");
            String s=obj.next();
            System.out.println(s);

            System.out.print("enter char value :- ");
            char c =obj.next().charAt(0);
            System.out.println(c);

            System.out.print("enter short value :- ");
            short st =obj.nextShort();
            System.out.println(st);

            System.out.print("enter long value :- ");
            long l =obj.nextLong();
            System.out.println(l);

    }
}

//  Hw
//  about jdk
//  5 ways to get input 




