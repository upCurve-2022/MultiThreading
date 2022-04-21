package pizzastore;

public class ChefClass implements Runnable{


    @Override
    public void run()
    {
        while(true){
            synchronized (Main.orderNumber)
            {
                if(!Main.orderNumber.isEmpty())
                {
                    int a = Main.orderNumber.remove();
                    try{
                        Thread.sleep(2000);
                    }
                    catch(Exception e){
                        System.out.println("Chef "+Thread.currentThread().getName() +"has an issue");
                    }
                    System.out.println();
                    System.out.println("Chef " + Thread.currentThread().getName() +" has prepared " + Main.menu.get(a-1));
                    System.out.println("\n"+"++++++++++++++++++++++++++++++++++++++++++++++++++++++ "+ a + " : "+Main.menu.get(a-1)+" is Delivered +++++++++++++++++++++++++++++++++++++++++");
                }
            }

        }



    }
}
