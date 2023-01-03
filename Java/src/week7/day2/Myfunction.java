package week7.day2;

public interface Myfunction {
    public abstract int max(int a, int b);

    Myfunction f = new Myfunction() {
        @Override
        public int max(int a, int b) {
            return a > b ? a : b;
        }
    };
}
