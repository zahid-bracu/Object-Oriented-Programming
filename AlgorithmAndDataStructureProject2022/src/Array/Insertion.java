package Array;
public class Insertion {
    public int[] InsertionMethod(int array[],int value, int pos){
        for(int i=array.length-1;i>=pos;i--){
            array[i]=array[i-1];
        }
        array[pos]=value;
        return array;
    }
    public void PrintArray(int array[]){
        for(int i=0;i<=array.length-1;i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String [] args){
        int value=43;
        int position=3;
        int array[]= {11,22,33,44,55,66,77,88,99,110,0};
        Insertion object = new Insertion();
        array=object.InsertionMethod(array,value,position);
        object.PrintArray(array);
    }
}
