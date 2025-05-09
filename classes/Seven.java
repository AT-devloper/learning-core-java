//  May 2025
//

    import java.util.Scanner;
    class Seven
    {
        public static void main(String ar[])
        {
        
            Scanner obj=new Scanner(System.in); 
            System.out.print("Enter the Units :- "); 
            
            int unit = obj.nextInt(); 
            int bill = 0;

            if(unit <= 0){ 
            bill = 0; }

            else{ 
            if (unit > 200) { 
            bill += (unit - 200) * 50; unit = 200;
            } 
            if (unit > 150) { 
            bill += (unit - 150) * 40; unit = 150;
            } 
            if (unit > 100) {
                bill += (unit - 100) * 30; unit = 100;
            } 
            if (unit > 50) { 
            bill += (unit - 50) * 20; unit = 50;
            } 
            if (unit > 0) { 
            bill += unit * 10;
            }
            } 
            System.out.println("Bill is:- " + bill +"rs");
            
        }
    }

//