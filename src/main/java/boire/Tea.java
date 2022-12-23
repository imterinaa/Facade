package boire;

import java.util.ArrayList;
import java.util.List;

public class Tea implements Boire {
    private final String name;
    private final List<String> ingredients;

    public Tea(String name) {
        this.name = name;
        this.ingredients = new ArrayList<>();
    }

    @Override
    public String boire() {
        StringBuilder builder = new StringBuilder();
        builder.append("Tea ").append(name).append('[');
        for (String i : ingredients) {
            builder.append(i).append(';');
        }
        builder.append(']');

        return builder.toString();
    }

    @Override
    public void addIngredient(String ingredient) {
        ingredients.add(ingredient);
    }
}
