package pizzastore;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
    public static ArrayList<String> menu = new ArrayList<>();
    public static ConcurrentLinkedQueue<Integer> orderNumber = new ConcurrentLinkedQueue<>();
    public static void main (String[] args){

        //adding pizzas to the menu
        menu.add("Paneer-Onion");
        menu.add("Pepperoni");
        menu.add("Margherita");
        menu.add("BBQ Peri-peri Chicken ");
        menu.add("Farm House");
        menu.add("Mexican Green Wave");
        menu.add("Veg Extravaganza");
        //displaying the menu
        System.out.println("\n************************************** WELCOME TO TASTY PIZZA'S ****************************************");
        System.out.println("\nTODAY'S MENU : \n");
        System.out.println("Pizza code \t       Pizza Name");
        for( int  i = 0 ;i < menu.size() ;i++){
            System.out.println("     " +  (i+1) + "              \t" + menu.get(i));
        }
        System.out.println();

        //creating thread objects  and naming them
        
        CounterClass counter1 = new CounterClass();
        Thread counterTh1 = new Thread(counter1);
        counterTh1.setName("Counter - 1 ");

        CounterClass counter2 = new CounterClass();
        Thread counterTh2 = new Thread(counter2);
        counterTh2.setName("Counter - 2 ");

        CounterClass counter3 = new CounterClass();
        Thread counterTh3 = new Thread(counter3);
        counterTh3.setName("Counter - 3 ");

        ChefClass chef1 = new ChefClass();
        Thread chefTh1 = new Thread( chef1 );
        chefTh1.setName("Rie");

        ChefClass chef2 = new ChefClass();
        Thread chefTh2 = new Thread( chef2 );
        chefTh2.setName("Adam");

        ChefClass chef3 = new ChefClass();
        Thread chefTh3 = new Thread( chef3 );
        chefTh3.setName("Merle");

        //starting the initialized threads
        
        counterTh1.start();
        counterTh2.start();
        counterTh3.start();

        chefTh1.start();
        chefTh2.start();
        chefTh3.start();

    }

}
