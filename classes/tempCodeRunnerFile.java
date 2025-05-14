// Find the total fare of driver and and get discount by 1000rs about 500km ?


import java.util.Scanner;
class Eight
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Website :- ");
        String web=sc.next();

        if(web.equals("olacars.com"))
        { 
            System.out.print("Enter Car :- ");
            String car = sc.next();
            if(car.equals("car"))
                {   int Rcar=1000;
                    System.out.print("Enter Traval in Km :- ");
                    int km = sc.nextInt();
                    int fuel =(km/10)*108;
                    int total = Rcar+fuel;
                    System.out.println("You travaled in normal car " +km +" & Total fare "+ total +"rs");

                    if(km>500){
                        int profit=total-1000;
                        System.out.println("You got Discount by 1000rs Payable amount = " +profit +"rs");
                    }
                        
                }
            else if(car.equals("suzuki"))
            {int Rcar=2000;

                    System.out.print("Enter Traval in Km :- ");
                    int km = sc.nextInt();
                    int fuel =(km/20)*108;
                    int total = Rcar+fuel;
                    System.out.println("You travaled in Suzuki car " +km +" & Total fare "+ total +"rs");

                    if(km>500){
                        int profit=total-1000;
                        System.out.println("You got Discount by 1000rs Payable amount =  " +profit +"rs");
                    }
            }
            else if(car.equals("tata"))
            {int Rcar=40000;
                    System.out.print("Enter Traval in Km :- ");
                    int km = sc.nextInt();
                    int fuel =(km/30)*108;
                    int total = Rcar+fuel;
                    System.out.println("You travaled in Tata car " +km +" & Total fare "+ total +"rs");

                    if(km>500){
                        int profit=total-1000;
                        System.out.println("You got Discount by 1000rs Payable amount = " +profit +"rs");
                    }
            }
            else if(car.equals("toyota")){
                int Rcar=3000;
                    System.out.print("Enter Traval in Km :- ");
                    int km = sc.nextInt();
                    int fuel =(km/40)*108;
                    int total = Rcar+fuel;
                    System.out.println("You travaled in Toyota car " +km +" & Total fare "+ total +"rs");

                    if(km>500){
                        int profit=total-1000;
                        System.out.println("You got Discount by 1000rs Payable amount = " +profit +"rs");
                    }
                }
            else System.out.println("!!");
        }
        else System.out.println("Its Other website !! ");
    }
}