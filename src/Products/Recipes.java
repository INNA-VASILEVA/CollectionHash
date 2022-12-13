package Products;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipes {

    String nameRecipes;
    Product[] products;
    static public Set<Recipes> recipesSet = new HashSet<>();

    public Recipes(String nameRecipes, Product... products) {
        this.nameRecipes = nameRecipes;
        this.products = products;
    }

    public String getNameRecipes() {
        return nameRecipes;
    }

    public Product[] getProducts() {
        return products;
    }


    static void addRecipes(Recipes recipes) {
        if (recipesSet.size() == 0) {
            recipesSet.add(recipes);
        } else {
            for (Recipes recipe : recipesSet) {
                if (recipe.hashCode() == recipesSet.hashCode()) {
                    throw new IllegalArgumentException("Повторяющий элемент");
                }
            }
        }
        recipesSet.add(recipes);
    }

    // метод расчета стоимости продуктов

    int costOfProducts() {
        int sum = 0;
        for (int i = 0; i < products.length; i++) {
            sum += products[i].getPrice();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Рецепт " + nameRecipes + " нужные продукты " + Arrays.toString(products);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipes recipes = (Recipes) o;
        return Objects.equals(nameRecipes, recipes.nameRecipes) && Arrays.equals(products, recipes.products);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nameRecipes);
        result = 31 * result + Arrays.hashCode(products);
        return result;
    }
}
