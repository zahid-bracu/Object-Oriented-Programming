package TwoDArray;
public class RowSum {
    public static void PrintResult(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String [] args){
        int array[][]={{11,22,33},{44,55,66},{77,88,99}};
        int rowSum[]=new int[3];
        int sum=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sum=sum+array[i][j];
                rowSum[i]=sum;
            }
            sum=0;
        }
        PrintResult(rowSum);
    }
}
