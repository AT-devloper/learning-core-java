//  12 May 2025
//  Conditions

    import java.util.Scanner;
    class Seven
    {
        public static void main(String ar[])
        {
    //         Scanner sc = new Scanner(System.in);
    //         int path;
    //         System.out.print("Enter path :- ");
    //         path=sc.nextInt();

    //         if(path==1){
    //             System.out.print("Enter next path :- ");
    //             path=sc.nextInt();

    //                 if(path==2){
    //                     System.out.print("Enter next path :- ");
    //                     path=sc.nextInt();
    //                         if(path==3){
    //                             System.out.print("Enter next path :- ");
    //                             path=sc.nextInt();
    //                             if(path==4){
    //                                 System.out.println("Reached");
                                   
    //                             }
    //                             else{System.out.println("!!");}
    //                         }
    //                         else if(path==4){
    //                             System.out.println("Reached");
    //                                 }       
    //                         else{System.out.println("!!");}
    //                     }
                    


    //                 else if(path==3){
    //                     System.out.print("Enter next path :- ");
    //                     path=sc.nextInt();

    //                         if(path==2){
    //                             System.out.print("Enter next path :- ");
    //                             path=sc.nextInt();

    //                              if(path==4) System.out.println("REAched");
    //                              else{System.out.println("!!");}  
    //                         }

    //                         else if(path==4){
    //                             System.out.println("Reached.....");
    //                         }

    //                         else{System.out.println("!!");}
    //                         }
                    
    //                 else if(path==4)System.out.println("You reached");

    //                 else{System.out.println("!!");}        
    //     }
    //     else{System.out.println("!!");}



            int hindi , eng , math;      
                                                // parsentage grade supply fail

            Scanner obj=new Scanner(System.in); 
            System.out.print("Enter the marks Hindi English Maths  :- "); 
            hindi  = obj.nextInt(); 
            eng  = obj.nextInt(); 
            math = obj.nextInt(); 

            int count=0;

            if(hindi<40) count++;
            if(eng<40) count++;
            if(math<40) count++;
            
                double per=(hindi+eng+math)/3;

                if(count==0){ System.out.print(" You passed No Suply " +per +"%");
                            
                }
                else if(count==1) System.out.print("1 Suply" +per +"%");
                else if(count==2) System.out.print("2 Suply" +per +"%");
                else{System.out.println("Fail");} 

    }
    }



     

//