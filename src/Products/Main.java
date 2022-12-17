package Products;

import java.util.Set;

public class Main {

    public static void main(String[] args) {
        ProductList productList = new ProductList();
        RecipeList recipeList = new RecipeList();

        Product product1 = new Product("Масло сливочное.", 150, 1);
        productList.addProduct(product1, product1.getNum());
        Product product2 = new Product("Яблоки.", 120, 1);
        productList.addProduct(product2, product1.getNum());
        Product product3 = new Product("Сахар ", 60, 1);
        productList.addProduct(product3, product1.getNum());
        Product product4 = new Product("Мука", 130, 1);
        productList.addProduct(product4, product1.getNum());

        // -------------рецепты-----------------
        Recipes recipes1 = new Recipes("Пирог", Set.of(product1, product3));
        recipeList.addRecipe(recipes1);
        Recipes recipes2 = new Recipes("Торт", Set.of(product2, product4));
        recipeList.addRecipe(recipes2);
        ;
        System.out.println(recipes1.toString());
        System.out.println(recipes1.costOfProducts());
        System.out.println(recipes2.costOfProducts());

    }
}
