package TwoDArray;
public class IterateTwoD {
    public static void main(String [] args){
        int array[][]={{1,2},{3,4},{5,6}};
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
