package Series;
class Fibonacci{  
    public static int Fibo(int n){
        if(n==0)
            return 0;
        if(n==1 || n==2)
            return 1;
        return Fibo(n-2)+Fibo(n-1);
    }
    public static void main(String args[]){
        int steps=10;
        for(int i=0;i<10;i++){
            System.out.println("");
        }
    }  
}  
