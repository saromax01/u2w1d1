package rosarioscilipoti.u2w1d1.entites;

import lombok.Data;
import rosarioscilipoti.u2w1d1.class_abstract.PizzeriaProducts;

import java.util.List;

@Data
public class Pizzas extends PizzeriaProducts {
    private List<Toppings> toppings;
    public void setToppings(List<Toppings> toppings) {
        this.toppings = toppings;
    }
}
