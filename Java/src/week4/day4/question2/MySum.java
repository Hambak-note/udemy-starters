package week4.day4.question2;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MySum mySum = (MySum) o;
        return (first+second) == (mySum.first+mySum.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
}
