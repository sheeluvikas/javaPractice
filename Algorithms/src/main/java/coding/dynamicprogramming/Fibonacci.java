package coding.dynamicprogramming;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.println(f(25));
    }

    public static int f(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        else if(n == 0){
            return 0;
        }

        return f(n-1) + f(n-2) + f(n - 3);
    }
}
