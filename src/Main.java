import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception{

        Product banan = new Product("Бананы", 100f, 1f);
        Product apple = new Product("Яблоки", 70f, 2f);
        Product raspberry = new Product("Малина", 120f, 0.2f);
        Product apple2 = new Product("Яблоки", 70f, 2f);

        Set<Product> productSet1 = new HashSet<>();
        productSet1.add(banan);
        productSet1.add(apple);
        productSet1.add(raspberry);
        productSet1.add(apple2);
        System.out.println(Arrays.toString(productSet1.toArray()));

        Product bread = new Product("Хлеб", 30f, 0.4f);
        Product butter = new Product("Масло сливочное", 180f, 0.2f);
        Product potato = new Product("Картофель", 100f, 2f);

        Set<Product> productSet2 = new HashSet<>();
        productSet2.add(bread);
        productSet2.add(butter);
        productSet2.add(potato);
        System.out.println(Arrays.toString(productSet2.toArray()));

        Recipe r1 = new Recipe("Рецепт1", productSet1 );
        Recipe r2 = new Recipe("Рецепт2", productSet2 );

        Set<Recipe> recipeSet = new HashSet<>();
        addRecipe(recipeSet,  new Recipe("Рецепт1", productSet1));
        addRecipe(recipeSet, new Recipe("Рецепт2", productSet1 ));
        //addRecipe(recipeSet, new Recipe("Рецепт1", productSet2 ));//будет исключение

        System.out.println(Arrays.toString(recipeSet.toArray()));

    }

    private static void addRecipe(Set<Recipe> recipeSet, Recipe recipe) throws Exception {
        if(! recipeSet.add(recipe)){
            throw new Exception("Ресепт "+recipe.getNameRecipe()+" уже добавлен");
        }
    }
}