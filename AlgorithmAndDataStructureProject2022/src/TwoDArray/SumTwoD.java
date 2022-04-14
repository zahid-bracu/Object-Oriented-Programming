package TwoDArray;
public class SumTwoD {
    public static void main(String [] args){
        int arrayOne[][]={{1,2},{3,4},{5,6}};
        int arrayTwo[][]={{7,8},{9,10},{11,12}};
        int sumArray[][]=new int[3][2];
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++)
                sumArray[i][j]=arrayOne[i][j]+arrayTwo[i][j];
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.print(sumArray[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
