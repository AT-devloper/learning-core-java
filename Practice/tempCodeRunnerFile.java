 int num1 = sc.nextInt();

    int mx=(num>num1)?num:num1;
     int i=mx;

     while (true)
     {
        if(num%i==0 && num1%i==0){
            break;
        }
            i+=mx;
     }
      System.out.println(i);
