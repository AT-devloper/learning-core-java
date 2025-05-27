
        int  num=6;                     
        int sum =0;                             // Perfect number
        for (int i=1;i<num;++i)
        {
            if(num%i==0) sum=sum+i;
        }
        if(sum==num)  System.out.println("Perfect number");
        
        else{ System.out.println("Not perfect number");}