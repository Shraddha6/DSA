package recursions;

public class RangeSolution {
    public int recursiveRange(int num) {
        //  TODO
        if (num < 0) {
            return -1;
        }
        if (num == 0) {
            return 0;
        }

        return num + recursiveRange(num - 1);
    }
    public static void main(String[] args) {

    }
}
