// 30 May 2025
// Array

import java.util.*;
// * - For use all Classes from package;

class Eighteen
{
    public static void main(String ar[])
    {

      
        //STATIC :-

            // // Declaration:- 
            // int a;
            //     int arr1[];
            //         int[] arr2;
            //             int []arr3;  

            // // Invalid:- 
            //     // int arr[5];


            // // Instance :-
            //     int[] arr4 = new int[5];

            // // Invalid:- 
            //     // int[] arr = new int[]; 
            

            // // initialization :-
            //     int arr5[]={1,2,3,4,5};
            //         int arr6[]=new int[]{1,2,3,4,5,6};

            // // Invalid:- 
            //     // int arr[5]={1,2,3,4,5};
            //         // int arr[]=new int[5]{1,2,3,4,5,6};




        // DYNAMIC :-
        Scanner obj=new Scanner(System.in);

            System.out.print("Enter size :- ");
            int Size=obj.nextInt();

            int arr[]=new int[Size];
            System.out.print("Enter size :- ");


                for(int i=0;i<arr.length;i++){
                    arr[i]=obj.nextInt();
                }
                    for(int Arr : arr){         // For each loop is using for printing;
                        System.out.println(Arr);
                    }
    }
}

// Array is a object.
// To stpre Multiple element (1,2,3,4,5) of same Datatypes;
// Array stored where in Stack/in Heap ?  - Heap.
// Array - Declaration,intanstistion,initialozation,destruction. 

// JAVA COMPLETE's LACK's OF ALL LAGUAGES.
