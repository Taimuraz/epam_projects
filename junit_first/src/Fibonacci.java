public class Fibonacci {
    public int getNumber(int index) {
        if( index <= 0){
            throw new IllegalArgumentException("Index must be > 0!");

        }
        if( index < 3){
            return 1;
        }
        return getNumber(index - 2) + getNumber(index - 1);
    }
}
