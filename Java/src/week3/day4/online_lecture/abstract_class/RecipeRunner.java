package week3.day4.online_lecture.abstract_class;

public class RecipeRunner {

    public static void main(String[] args) {
        Recipe1 recipe = new Recipe1();
        recipe.execute();
        System.out.println("======================================");
        RecipeWithMicrowave recipeWithMicrowave = new RecipeWithMicrowave();
        recipeWithMicrowave.execute();
    }
}
