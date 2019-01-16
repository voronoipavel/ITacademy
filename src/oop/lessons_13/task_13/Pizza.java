package oop.lessons_13.task_13;

public class Pizza {
    private int price;
    private int weight;
    private boolean recipe;

    public Pizza(int price, int weight, boolean recipe) {
        this.price = price;
        this.weight = weight;
        this.recipe = recipe;
    }

    public boolean isRecipe() {
        return recipe;
    }

    public String label() {
        return "Цена = " + price + ", Вес = " + weight;
    }
}
