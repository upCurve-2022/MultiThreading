package pizzastore;

import java.util.Scanner;

public class CounterClass implements Runnable{

    int orderNum;
  
    @Override
    public void run() {
        int i=0;
        //each thread will execute for two times
        while ( i <= 1)
        {
            synchronized (Main.orderNumber){
                System.out.println("\n" + Thread.currentThread().getName() +" : ");
                System.out.print("Enter Pizza Code : ");
                Scanner sc = new Scanner(System.in);
                orderNum = sc.nextInt();
                Main.orderNumber.add(orderNum);
                //printing that the order is confirmed
                System.out.println(Thread.currentThread().getName()+ " : order for " + Main.menu.get(orderNum-1) +" is confirmed");
            }
            try{
                
                Thread.sleep(1000);

            }
            catch (Exception e){
                System.out.println(Thread.currentThread().getName() + " is halted \n");
            }
            i++;
        }

    }
}
