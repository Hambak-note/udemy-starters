package week3.day4.online_lecture.abstract_class;

public class RecipeWithMicrowave extends AbstractRecipe{
    @Override
    void getReady() {
        System.out.println("Get the raw materials");
        System.out.println("Switch on the microwave");
    }

    @Override
    void doTheDish() {
        System.out.println("get stuff ready");
        System.out.println("Put it in the microwave");
    }

    @Override
    void cleanUp() {
        System.out.println("Cleanup the utensils");
        System.out.println("Switch off the microwave");
    }


}
