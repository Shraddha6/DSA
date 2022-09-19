package recursions;

public class ProductOfArray {

    public static int productofArray(int A[], int N)
    {
        if(N<0){
            return -1;
        }
        //Base condition
        if(N==0){
            return 1;
        }
        //  recursive condition
        return A[N-1] * productofArray(A, N-1);
    }

    public static void main(String[] args) {
        int[] A = {3,4,5,2,1};
        System.out.println(productofArray(A,5));
    }
}
