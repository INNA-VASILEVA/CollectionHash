package Products;

import java.util.HashSet;

public class RecipeList {
    final private HashSet<Recipes> recipeHashSet = new HashSet<>();

    public void addRecipe(Recipes recipe) {
        recipeHashSet.add(recipe);
    }
}

