package Array;
public class PairSum {
    public static void main(String [] args){
        int array[]={1,5,7,-1,5};
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                int sum=array[i]+array[j];
                if(sum==6)
                    System.out.println("{"+array[i]+","+array[j]+"}");
            }
        }
    }
}
