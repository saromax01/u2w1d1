package rosarioscilipoti.u2w1d1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rosarioscilipoti.u2w1d1.entites.Drinks;
import rosarioscilipoti.u2w1d1.entites.Menu;
import rosarioscilipoti.u2w1d1.entites.Pizzas;
import rosarioscilipoti.u2w1d1.entites.Toppings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class BeansConfig {

    @Bean
    public Pizzas margherita() {
        Pizzas pizza = new Pizzas();
        pizza.setName("Margherita");
        pizza.setPrice(4.99);
        pizza.setCalories(1000);
        pizza.setToppings(topMargh());

        return pizza;
    }
    @Bean
    public Pizzas diavola() {
        Pizzas pizza1 = new Pizzas();
        pizza1.setName("Diavola");
        pizza1.setPrice(6.99);
        pizza1.setCalories(1210);
        pizza1.setToppings(topPiccante());

        return pizza1;
    }
    @Bean
    public Pizzas tonnoeCipolla() {
        Pizzas pizza2 = new Pizzas();
        pizza2.setName("TONNO&CIPOLLA");
        pizza2.setPrice(7.99);
        pizza2.setCalories(1121);
        pizza2.setToppings(topTonno());

        return pizza2;
    }
    @Bean
    public Toppings tomato() {
        Toppings tomato = new Toppings("pomodoro");
        tomato.setName("pomodoro");
        tomato.setCalories(89);
        tomato.setPrice(0.99);
        return tomato;
    }
    @Bean
    public Toppings mozzarella() {
        Toppings mozzarella = new Toppings("mozzarella");
        mozzarella.setName("mozzarella");
        mozzarella.setCalories(121);
        mozzarella.setPrice(2.99);
        return mozzarella;
    }
    @Bean
    public Toppings tonno() {
        Toppings tonno = new Toppings("tonno");
        tonno.setName("tonno");
        tonno.setCalories(89);
        tonno.setPrice(0.99);
        return tonno;
    }
    @Bean
    public Toppings olive() {
        Toppings olive = new Toppings("olive");
        olive.setCalories(89);
        olive.setPrice(0.99);
        return olive;
    }
    @Bean
    public Toppings cipolla() {
        Toppings cipolla = new Toppings("cipolla");
        cipolla.setName("cipolla");
        cipolla.setCalories(89);
        cipolla.setPrice(0.99);
        return cipolla;
    }
    @Bean
    public Toppings salamePiccante() {
        Toppings salame = new Toppings("salame piccante");
        salame.setName("salame piccante ");
        salame.setCalories(89);
        salame.setPrice(0.99);
        return salame;
    }
    @Bean
    public Drinks coke() {
        Drinks coke = new Drinks();
        coke.setName("coca cola");
        coke.setPrice(2.99);
        coke.setCalories(300);
        return coke;
    }
    @Bean
    public Drinks water() {
        Drinks water = new Drinks();
        water.setName("acqua");
        water.setPrice(0.50);
        water.setCalories(12);
        return water;
    }
    @Bean
    public Drinks beer() {
        Drinks beer = new Drinks();
        beer.setName("birra");
        beer.setPrice(3.50);
        beer.setCalories(175);
        return beer;
    }
    @Bean
    public Drinks orange() {
        Drinks orange = new Drinks();
        orange.setName("fanta");
        orange.setPrice(2.99);
        orange.setCalories(280);
        return orange;
    }
    @Bean
    public List<Pizzas> pizze() {
        return Arrays.asList(margherita(),diavola(),tonnoeCipolla());
    }
    @Bean
    public List<Toppings> toppings() {
        return Arrays.asList(salamePiccante(),tonno(),olive(),tomato(),mozzarella(),cipolla());
    }
    @Bean
    public List<Drinks> drinks() {
        return Arrays.asList(orange(),water(),coke(),beer());
    }
    @Bean
    public List<Toppings> topMargh() {
        return Arrays.asList(tomato(),mozzarella());
    }
    @Bean
    public List<Toppings> topTonno() {
        return Arrays.asList(tomato(),mozzarella(),tonno(),cipolla());
    }
    @Bean
    public List<Toppings> topPiccante() {
        return Arrays.asList(tomato(),mozzarella(),salamePiccante(),olive());
    }
    @Bean
    public Menu menu() {
        Menu menu = new Menu();
        menu.setPizzas(pizze());
        menu.setToppings(toppings());
        menu.setDrinks(drinks());
        return menu;
    }
 }
