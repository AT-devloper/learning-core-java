// 3 June 2025
// Array
 

import java.util.*;
class c_20
{
    public static void main(String ar[])
    {
        // Scanner obj = new Scanner(System.in);

        // System.out.print("Enter Size of Array :- ");
        // int size = obj.nextInt();

        // int arr[]=new int[size];
        // System.out.print("Enter Elements of Array :- ");

        //     for(int i=0;i<arr.length;i++){
        //         arr[i]=obj.nextInt();
        //         }




        int arr[]={56,42,23,68,11};
        int n=arr.length;
        // ARRAY IN ASSENDING ORDER.

        for(int i=0;i<n-1;i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    int ac=arr[i];
                    arr[i]=arr[j];
                    arr[j]=ac;
                }}}

        System.out.print("AC :- ");
        for(int ARR:arr){
            System.out.print(ARR +" ");
        }

        System.out.println();
        // ARRAY IN DECENDING ORDER.
       
        for(int a=0; a<n-1 ; ++a){
            for(int b=a+1; b<n ; ++b){
                if(arr[a]<arr[b]){
                    int dc=arr[a];
                    arr[a]=arr[b];
                    arr[b]=dc;
                }}}

        System.out.print("DC :- ");
        for(int ARR:arr){
            System.out.print(ARR +" ");
        }
        }}