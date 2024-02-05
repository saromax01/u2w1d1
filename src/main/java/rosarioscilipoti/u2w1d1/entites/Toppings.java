package rosarioscilipoti.u2w1d1.entites;

import lombok.Data;
import rosarioscilipoti.u2w1d1.class_abstract.PizzeriaProducts;

import java.util.ArrayList;
import java.util.List;

@Data
public class Toppings extends PizzeriaProducts {
    public Toppings(String name) {
        this.setName(name);
    }
}
