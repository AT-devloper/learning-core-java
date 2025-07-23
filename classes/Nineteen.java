//  2 June 2025
//  ARRAY

import java.util.*;
class Nineteen
{
    public static void main(String ar[])
    {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter Size of Array :- ");
        int size = obj.nextInt();

        int arr[]=new int[size];
        System.out.print("Enter Elements of Array :- ");

            for(int i=0;i<arr.length;i++){
                arr[i]=obj.nextInt();
                }
                
            //     for(int Arr : arr){         
            //         System.out.println(Arr);
            //         }

            //             int sum=0;              // SUM OF ARRAY
            //             for(int i=0; i<arr.length;i++)
            //             {
            //                 sum+=arr[i];
            //             }
            //             System.out.print(sum);

                    for(int i=0;i<arr.length/2;++i){
                        int temp=arr[size-i-1];
                        arr[size-i-1]=arr[i];           //reverse array
                        arr[i]=temp;
                    
                    for(int j:arr )
                    {
                        System.out.print(j +" ");
                    }
                    }

                        


        

    }
}

// HW - Reverse
//

