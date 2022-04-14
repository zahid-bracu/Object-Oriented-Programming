package TwoDArray;
public class MultiplicationTwoD {
    public static void PrintArray(int array[][]){
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }}
    public static void main(String [] args){
        int arrayOne[][]={{1,2},{3,4},{5,6}};
        int arrayTwo[][]={{7,8,3},{9,10,4}};
        int arrayMult[][]=new int[3][2];
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                arrayMult[i][j]=arrayOne[i][j]*arrayTwo[j][i];
            }
        }
        PrintArray(arrayMult);
    }}
