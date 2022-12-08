package week3.day4.online_lecture.abstract_class;

public abstract class AbstractRecipe {

    public void execute(){
        getReady();
        doTheDish();
        cleanUp();
    }

    abstract void getReady();
    abstract void doTheDish();
    abstract void cleanUp();

    //prepare
    //recipe
    //cleanup





}
