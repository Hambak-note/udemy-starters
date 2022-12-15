package week4.day4.question2;

public class MySum {

    int first;
    int second;

    MySum (int first, int second){
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return String.valueOf(first+second);
    }


    @Override
    public boolean equals(Object obj) {
        return this.toString().equals(obj.toString());
    }

}
