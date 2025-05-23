//  21 may 2025
//  Pattens 


class Fourteen
{
    public static void main(String ar[])
    {
         System.out.println();
    
        for(int r = 1 ; r<=5 ; ++r)         //Right angle
        {
            for(int c =1 ; c<=5 ; ++c)
            {
                if(c<=r)
                {
                    System.out.print("^");
                }
                else{System.out.print(" ");}

            }
            System.out.println();
        }

            System.out.println();

        for(int r = 1 ; r<=5 ; ++r)             //inverted Left angle
        {
            for(int c =1 ; c<=5 ; ++c)
            {
                if(c>=r)
                {
                    System.out.print("^");
                }
                else{System.out.print(" ");}

            }
            System.out.println();
        }

        System.out.println();

        for(int r = 1 ; r<=5 ; ++r)             // inverted Right angle
        {
            for(int c =1 ; c<=5 ; ++c)
            {
                if(c<=6-r)
                {
                    System.out.print("^");
                }
                else{System.out.print(" ");}

            }
            System.out.println();
        }

 System.out.println();                      // c<=6-r   (6-1=5).........(6-5=1)

        for(int r = 1 ; r<=5 ; ++r)              // left angle
        {
            for(int c =1 ; c<=5 ; ++c)
            {
                if(c>=6-r)
                {
                    System.out.print("^");
                }
                else{System.out.print(" ");}

            }
            System.out.println();
        }


    }
}


