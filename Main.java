public class Main {
    public static void main(String[] args) {
        CoffeeI coffee = new Coffee();
        System.out.println(printCoffee(coffee));

        CoffeeI coffeeWithMilk = new MilkDecorator(new Coffee());
        System.out.println(printCoffee(coffeeWithMilk));

        CoffeeI coffeeWithSugar = new SugarDecorator(new Coffee());
        System.out.println(printCoffee(coffeeWithSugar));
    }

    private static String printCoffee(CoffeeI coffee) {
        return coffee.getDescription() + "\n" + "Price: " + coffee.getCost() + "€" + "\n";
    }
}