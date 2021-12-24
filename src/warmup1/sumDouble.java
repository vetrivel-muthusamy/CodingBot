package warmup1;

public class sumDouble {

    public static void main(String[] args) {
        System.out.println(sumDouble(1, 2));
        System.out.println(sumDouble(3, 2));
        System.out.println(sumDouble(2, 2));
    }


    public static int sumDouble(int a, int b) {

        //Store the Sum in a local variable
        int sum = a + b;

        //double the sum value if a and b are same.
        if (a==b){
            sum = sum * 2;
        }
        return sum;
    }
}
