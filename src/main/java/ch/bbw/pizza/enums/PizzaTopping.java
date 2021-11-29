package ch.bbw.pizza.enums;

public enum PizzaTopping {
    Pineapple(1),
    Peperoni(1),
    Bacon(2),
    Corn(1),
    Chicken(2),
    Mushrooms(1.5),
    Olives(1.5);

    private final double price;

    PizzaTopping(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String generateText(){
        return String.format("%s (%s Fr.)", name(), price);
    }
}
