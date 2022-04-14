package Sort;
public class InsertionSort {
    public static void insertionSort(int array[]){
        for(int i=1;i<array.length;i++){
            int temp=array[i];
            int j=i-1;
            while(j>=0 && array[j]>temp){
                array[j+1]=array[j];
                j--;
            }
            array[++j]=temp;
        }
    }
    public static void printArray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String [] args){
        int array[]={55,22,77,33,11,99,88,44,66,110};
        insertionSort(array);
        printArray(array);
    }
}
