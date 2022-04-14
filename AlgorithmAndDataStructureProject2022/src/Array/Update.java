package Array;
public class Update {
    public int[] UpdateMethod(int array[], int pos , int value){
        for(int i=0;i<=array.length-1;i++){
            if(i==pos)
                array[i]=value;
        }
        return array;
    }
    public void PrintArray(int array[]){
        for(int i=0;i<=array.length-1;i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String [] args){
        int position=2;
        int value=33;
        int array[]= {11,22,35,44,55,66,77,88,99,110};
        Update object = new Update();
        array=object.UpdateMethod(array,position,value);
        object.PrintArray(array);
    }
}
