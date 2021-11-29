package ch.bbw.pizza.enums;

public enum PizzaSize {
    Small(7.5, "Small"),
    Medium(10, "Medium"),
    Large(12.5, "Large"),
    ExtraLarge(15, "Extra Large"),
    TresLarge(50, "TRÈS LARGE!");

    private final double price;

    private final String displayText;

    PizzaSize(double price, String displayText) {
        this.price = price;
        this.displayText = displayText;
    }

    public double getPrice() {
        return price;
    }

    public String getDisplayText(){
        return displayText;
    }

    public String generateDisplayText(){
        return String.format("%s (%s Fr.)", getDisplayText(), price);
    }
}
