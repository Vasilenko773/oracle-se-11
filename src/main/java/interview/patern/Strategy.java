package interview.patern;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

interface PaymentStrategy {
    public void pay(double amount);
}

@AllArgsConstructor
class CreditCardStrategy implements PaymentStrategy {

    private String name;
    private String number;
    private String cvv;


    @Override
    public void pay(double amount) {
        System.out.println("Оплата кредитной картой по реквизитам " + amount);
    }
}

class PayPalStrategy implements PaymentStrategy {
    private String email;

    @Override
    public void pay(double amount) {
        System.out.println("Оплата кредитной картой " + amount);
    }
}

public class Strategy {
    @AllArgsConstructor
    class Item {
        private String name;
        private Integer price;
    }
    public static void pay(PaymentStrategy paymentStrategy, List<Item> items) {
        double sum = items.stream().mapToInt(i -> i.price).sum();
        paymentStrategy.pay(sum);
    }

    public static void main(String[] args) {
        pay(new CreditCardStrategy("Ivan", "12455454", "123"),
                new ArrayList<>(List.of(new Strategy().new Item("картофель", 45),
                        new Strategy().new Item("морковь ", 12))));
        pay(new PayPalStrategy(), new ArrayList<>(List.of(new Strategy().new Item("птица", 265))));
    }
}
