package dev.aknb.corsconfig.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dev.aknb.corsconfig.model.Coffee;
import dev.aknb.corsconfig.model.Size;

@RestController
@RequestMapping("/api/coffee")
// @CrossOrigin
public class CoffeeController {

    private List<Coffee> coffeeList = new ArrayList<>();

    public CoffeeController() {
        coffeeList.add(new Coffee(1, "Coffee Latte", Size.GRANDE));
        coffeeList.add(new Coffee(2, "Coffee Americano", Size.VENTI));
        coffeeList.add(new Coffee(3, "Cappuccino", Size.TALL));
    }

    // @CrossOrigin(origins = "localhost:3000")
    @GetMapping
    public List<Coffee> findAll() {
        return coffeeList;
    }

    @DeleteMapping
    public void delete(Integer id) {
        coffeeList.removeIf(coffee -> coffee
                .id()
                .equals(id));
                
    }

}
