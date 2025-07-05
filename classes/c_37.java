//  2 july 2025
//  Exception Handaling.

class c_37
{
    public static void main(String ar[])
    {   
        System.out.println("Start hua");

        try
        {
            System.out.println(1/0); 
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        System.out.println("Complete hua");
    }
}

//
//