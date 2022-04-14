package Sort;
public class BubbleSort {
    public static void bubbleSort(int array[]){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[i]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
    }
    public static void printArray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String [] args){
        int array[]={55,22,77,33,11,99,88,44,66,110};
        bubbleSort(array);
        printArray(array);
        
    
    }
}
