//  2 sep 2025
//  fibonacci  tabletion(b t) 

class dc_14a
{
    static int fibo(int n)
    {
        if(n<=1)    return n;

        int dp[]=new int[n+1];

        dp[0]=0;  
        dp[1]=1;

        for(int i=2;i<dp.length;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        
        return dp[n];
    }
    
    public static void main(String ar[])
    {
        int n=4;
       
        System.out.print(fibo(n));
    }
}