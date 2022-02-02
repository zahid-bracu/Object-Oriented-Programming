public class FinalizeMethod {
    int numbers=10;
    public static void main(String [] args){
        FinalizeMethod objOne=new FinalizeMethod();
        System.out.println(objOne.numbers);
        objOne.finalize();
    }
    protected void finalize(){
        System.out.println("Destroyed");
    }
}
