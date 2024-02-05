package rosarioscilipoti.u2w1d1.entites;

import lombok.Data;

import java.util.List;

@Data
public class Menu {
    private List<Pizzas> pizzas;
    private List<Drinks> drinks;
    private List<Toppings> toppings;

    public void printMenu() {
        System.out.println("Menu:");

        System.out.println("Pizze:");
        for (Pizzas pizza : pizzas) {
            System.out.println(pizza.getName() + " - " + pizza.getPrice() + "€");
            System.out.println("Toppings:");
            for (Toppings topping : pizza.getToppings()) {
                System.out.println("  - " + topping.getName());
            }
        }

        System.out.println("Drinks:");
        for (Drinks drink : drinks) {
            System.out.println(drink.getName() + " - " + drink.getPrice() + "€");
        }
    }
}
