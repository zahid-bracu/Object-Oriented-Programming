package Search;
public class LinearSearch {
    public static int linearSearch(int array[],int value){
        for(int i=0;i<array.length;i++){
            if(array[i]==value)
                return i;
        }
        return -1;
    }
    public static void main(String [] args){
        int array[]={55,22,77,33,11,99,88,44,66,110};
        int index=linearSearch(array,44);
        if(index>=0)
            System.out.println("Found at Position : "+index);
        else
            System.out.println("Not Found");
    }
}
