//  22 Aug 2025
//  Recourson (Febonacci)

class dc_8
{
    static int feb(int n)
        {
            if(n==0) return 0;
            if(n==1) return 1;
            return feb(n-1) + feb(n-2);
        }

    public static void main(String ar[])
        {
            int n = 5;
            for(int i=0;i<n;i++)
            {
                System.out.print(feb(i) +" ");
            }

        }
}