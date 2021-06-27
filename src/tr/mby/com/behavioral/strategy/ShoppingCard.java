package tr.mby.com.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCard {

    //List of items
    List<Item> items;

    public ShoppingCard(){
        this.items=new ArrayList<Item>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    public double calculateTotal(){
        double sum = 0;
        for(Item item : items){
            System.out.println(item.getUpcCode() + " cost: " + item.getPrice());
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentStrategy){
        double amount = calculateTotal();
        paymentStrategy.pay(amount);
    }
}
