//  4 sep 2025
//  

    interface Rider
    {
        void drive();
    }

    class bike implements Rider
    {
        public void drive()
        {
            System.out.println("Rider start Drive bike");
        }
    }
    class car implements Rider
    {
        public void drive()
        {
            System.out.println("Rider start Drive car");
        }
    }
    class truck implements Rider
    {
        public void drive()
        {
            System.out.println("Rider start Drive truck");
        }
    }

    class All 
    {
        int ref;
        Rider rider;

        public All(Rider rider)
        {
            this.rider=rider;
        }
        public void start()
        {
            rider.drive();
        }
    }

    class dc_16
{
    public static void main(String ar[])
    {  
        All all= new All();
        all.start();
    }
}
//
