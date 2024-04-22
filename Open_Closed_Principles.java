/**
 * Represents a flower with basic properties such as name, color, and price.
 */
interface Flower {
    /**
     * Gets the name of the flower.
     *
     * @return The name of the flower.
     */
    String getName();

    /**
     * Gets the color of the flower.
     *
     * @return The color of the flower.
     */
    String getColor();

    /**
     * Gets the price of the flower.
     *
     * @return The price of the flower.
     */
    double getPrice();
}

/**
 * Represents a Rose flower, implementing the Flower interface.
 */
class Rose implements Flower {
    private String name;
    private String color;
    private double price;

    /**
     * Constructs a Rose flower with the given properties.
     *
     * @param name  The name of the Rose flower.
     * @param color The color of the Rose flower.
     * @param price The price of the Rose flower.
     */
    public Rose(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

/**
 * Represents a Lily flower, implementing the Flower interface.
 */
class Lily implements Flower {
    private String name;
    private String color;
    private double price;

    /**
     * Constructs a Lily flower with the given properties.
     *
     * @param name  The name of the Lily flower.
     * @param color The color of the Lily flower.
     * @param price The price of the Lily flower.
     */
    public Lily(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

/**
 * Represents a flower shop that can sell flowers.
 */
class FlowerShop {
    /**
     * Sells a flower and prints its details.
     *
     * @param flower The flower to be sold.
     */
    public void sellFlower(Flower flower) {
        System.out.println("Selling " + flower.getName() + " flower");
        System.out.println("Color: " + flower.getColor());
        System.out.println("Price: $" + flower.getPrice());
    }
}

/**
 * Main class to demonstrate flower system functionalities.
 */
public class Open_Closed_Principles {
    public static void main(String[] args) {
        FlowerShop shop = new FlowerShop();

        Flower rose = new Rose("Red Rose", "Red", 10.99);
        Flower lily = new Lily("White Lily", "White", 12.50);

        shop.sellFlower(rose);
        System.out.println("-------------------");
        shop.sellFlower(lily);
    }
}
