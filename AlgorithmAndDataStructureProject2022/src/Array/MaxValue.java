package Array;
public class MaxValue {
    public int Maximum(int array[]){
        int max=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>max)
                max=array[i];
        }
        return max;
    }
    public static void main(String [] args ){
        int array[]= {11,1,22,53,14,5,66,27,8,39};
        MaxValue object=new MaxValue();
        int MaxNumber=object.Maximum(array);
        System.out.println(MaxNumber);
    }
}
