package Array;
public class Deletion {
    public int[] DeletionMethod(int array[], int pos){
        for(int i=pos+1;i<=array.length-1;i++){
            array[i-1]=array[i];
        }
        array[array.length-1]=0;
        return array;
    }
    public void PrintArray(int array[]){
        for(int i=0;i<=array.length-1;i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String [] args){
        int position=3;
        int array[]= {11,22,33,35,44,55,66,77,88,99,110};
        Deletion object = new Deletion();
        array=object.DeletionMethod(array,position);
        object.PrintArray(array);
    }
}
