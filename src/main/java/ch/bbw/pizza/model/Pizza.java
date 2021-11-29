package ch.bbw.pizza.model;

import ch.bbw.pizza.enums.PizzaSize;
import ch.bbw.pizza.enums.PizzaTopping;

import java.util.ArrayList;

public class Pizza {
    PizzaSize size;
    double price;
    boolean created;

    ArrayList<PizzaTopping> toppings;

    public PizzaSize getSize() {
        return size;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isCreated() {
        return created;
    }

    public void setCreated(boolean created) {
        this.created = created;
    }

    public ArrayList<PizzaTopping> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<PizzaTopping> toppings) {
        this.toppings = toppings;
    }

    public void calculatePrice(){
        this.price = size.getPrice();

        for (PizzaTopping topping : toppings) {
            this.price += topping.getPrice();
        }
    }
}
