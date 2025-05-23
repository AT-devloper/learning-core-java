//  22 may 2025
//  Pattens


class Fifteen
{
    public static void main(String ar[])
    {

        // for(int r=1 ; r<=5 ; ++r)
        // {
        //     for(int c =1; c<=9 ;++c)    // upper Pramid
        //     {
        //         if(c>=6-r && c<=4+r)
        //         {
        //             System.out.print("^");
        //         }
        //         else{System.out.print(" ");}
        //     }
        //      System.out.println();
        // }


        // for(int r=1 ; r<=5 ; ++r)       // bottom Pramid
        // {
        //     for(int c =1; c<=9 ;++c)
        //     {
        //         if(c>=r && c<=10-r)
        //         {
        //             System.out.print("^");
        //         }
        //         else{System.out.print(" ");}
        //     }
        //      System.out.println();
        // }


        for(int r=1 ; r<=5 ; ++r)
        {
            for(int c =1; c<=9 ;++c)  
            {
                if(c>=6-r && c<=4+r)
                {
                    System.out.print("^");
                }
                else{System.out.print(" ");}
            }
             System.out.println();
        }
       
    }
}

// R - c<=r    -  IL - c>=r
// L - c<=6-r  -  IR - c>=6-r
