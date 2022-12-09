package week3.day5.online_lecture.javatips;

class Player{
    private String name;
    private static int count;

    public Player(String name) {
        this.name = name;
        count++;
    }

    public static int getCount() {
        return count;
    }
}

public class StaticModifierRunner {

    public static void main(String[] args) {
        Player player1 = new Player("name1");
        Player player2 = new Player("name2");


    }
}
