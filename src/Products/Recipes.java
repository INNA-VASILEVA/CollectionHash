package Products;

import java.util.Set;

public class Recipes {

    String nameRecipes;
    private final Set<Product> productSet;

    public Recipes(String nameRecipes, Set<Product> productSet) {
        this.nameRecipes = nameRecipes;
        this.productSet = productSet;
    }

    public String getNameRecipes() {
        return nameRecipes;
    }

    @Override
    public String toString() {
        return "Рецепт - " + nameRecipes +
                ", продукты" + productSet;
    }

    // метод расчета стоимости продуктов
    public int costOfProducts() {
        int sum = 0;
        for (Product product : productSet) {
            sum = sum + product.getPrice() * product.getNum();
        }
        return sum;
    }
}
