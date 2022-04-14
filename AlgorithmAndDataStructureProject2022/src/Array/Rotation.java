package Array;
public class Rotation {
    public void PrintArray(int array[]){
        for(int i=0;i<=array.length-1;i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String [] args){
        int pos=1;
        int array[]={11,22,33,44,55,66,77,88,99,110};
        int copyArray[]=new int[pos];
        for(int i=0;i<pos;i++){
            copyArray[i]=array[i];
        }
        int j=0;
        for(int i=pos;i<array.length;i++){
            array[j++]=array[i];
        }
        
        int k=array.length-1;
        for(int i=copyArray.length-1;i>=0;i--){
            array[k--]=copyArray[i];
        }
        Rotation object=new Rotation();
        object.PrintArray(array);
        
    }
}
