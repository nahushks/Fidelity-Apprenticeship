public class Problem2 {
    public static void main(String[] args) {
        int pizzaPrice = 200;
        int puffPrice = 40;
        int coolDrinkPrice = 120;

        int numberOfPizzas = 5;
        int numberOfPuffs = 6;
        int numberOfCoolDrinks = 2;

        int totalPizzaCost = numberOfPizzas * pizzaPrice;
        int totalPuffCost = numberOfPuffs * puffPrice;
        int totalCoolDrinkCost = numberOfCoolDrinks * coolDrinkPrice;

        int grandTotal = totalPizzaCost + totalPuffCost + totalCoolDrinkCost;

        System.out.println("Bill Details:");
        System.out.println("Total cost of Pizzas: Rs. " + totalPizzaCost);
        System.out.println("Total cost of Puffs: Rs. " + totalPuffCost);
        System.out.println("Total cost of Cool Drinks: Rs. " + totalCoolDrinkCost);
        System.out.println("Grand Total: Rs. " + grandTotal);
    }
}

