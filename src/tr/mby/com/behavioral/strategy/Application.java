package tr.mby.com.behavioral.strategy;

public class Application {

    public static void main(String[] args) {
        ShoppingCard shoppingCard = new ShoppingCard();

        Item table = new Item("TBL_123", 85.99);
        Item chair1 = new Item("CHR_123", 25.99);
        Item chair2 = new Item("CHR_123", 25.99);

        shoppingCard.addItem(table);
        shoppingCard.addItem(chair1);
        shoppingCard.addItem(chair2);

        CreditCardStrategy creditCardStrategy =  new CreditCardStrategy(
                "Username",
                "1234 5678 8765 4321",
                "100",
                "2025-06-27"
        );

        shoppingCard.pay(creditCardStrategy);

        shoppingCard.removeItem(table);
        shoppingCard.removeItem(chair1);
        shoppingCard.removeItem(chair2);

        /*----*/

        Item fifa2022 = new Item("FF_123", 125.99);
        Item exoMecha = new Item("EXO_123", 150.99);

        shoppingCard.addItem(fifa2022);
        shoppingCard.addItem(exoMecha);

        PaypalStrategy paypalStrategy = new PaypalStrategy("user@yopmail.com", "123456");
        shoppingCard.pay(paypalStrategy);

        // OUTPUT
        // TBL_123 cost: 85.99
        // CHR_123 cost: 25.99
        // CHR_123 cost: 25.99
        // 137.97 paid with credit/debit card by Username

        // FF_123 cost: 125.99
        // EXO_123 cost: 150.99
        // 276.98 paid using Paypal by user@yopmail.com
    }
}
