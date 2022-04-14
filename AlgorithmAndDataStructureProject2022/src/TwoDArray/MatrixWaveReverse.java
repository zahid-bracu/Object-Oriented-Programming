package TwoDArray;
public class MatrixWaveReverse {
    public static void main(String [] args){
        int array[][]={{11,22,33},{44,55,66},{77,88,99}};
        for(int i=3-1;i>=0;i--){
            if(i%2==0){
                 for(int j=3-1;j>=0;j--){
                     System.out.print(array[j][i]+" ");
                 }
            }else{
                for(int j=0;j<3;j++){
                    System.out.print(array[j][i]+" ");
                }
            }
        }
    }
}
