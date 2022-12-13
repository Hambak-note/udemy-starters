package week4.day2.field_lecture.question2.test;

public class Board extends Information{
    private String contents;
    private int viewCount;

    public Board(String id, String name, String contents, int viewCount) {
        super(id, name);
        this.contents = contents;
        this.viewCount = viewCount;
    }

    @Override
    String print() {
        return super.print()+":"+this.contents+":"+this.viewCount;
    }
}
