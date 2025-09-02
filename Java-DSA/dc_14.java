//  1 sep 2025
//  febo with Dynamic programming(recourson + memorization) (t b)

class dc_14
{
    static int fibo(int dp[],int n)
    {
        if(n<=1)    return n;
        else if(dp[n]!=-1)  return dp[n];

        dp[n]=fibo(dp,n-1)+fibo(dp,n-2);

        return dp[n];
    }
    public static void main(String ar[])
    {   
        int n=5;
        int dp[]=new int[n+1];
        
        for(int i=0;i<dp.length;i++)
        {
            dp[i]=-1;
        }
        System.out.print(n +" is " +fibo(dp,n));

    }
}