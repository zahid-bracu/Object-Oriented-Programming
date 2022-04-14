package Series;
public class Factors {
    public static void factors(int n,int i){
        if(i<=n){
            if(n%i==0){
                System.out.println("Factors : "+i);
            }
            factors(n,i+1);
        }
    }
    public static void main(String [] args){
        int n=20;
        factors(n,1);
    }
}
