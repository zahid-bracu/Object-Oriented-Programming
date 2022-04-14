package Array;
public class MaxThree {
    public static void main(String [] args){
        int x=10,y=11,z=12;
        int max=x;
        if(y>max)
            max=y;
        if(z>max)
            max=z;
        System.out.println("Max Value : "+max);
        //Console Output : Max Value : 12
    }
}
