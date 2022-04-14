package Series;
public class Factorial {
    public static int factorial(int n){
        if (n>=1)
            return n*factorial(n-1);
        else
            return 1;
    }
    public static void main(String[] args) {
        int n=6;
        int value=factorial(n);
        System.out.println("Factorial Number : "+value);
    }    
}

