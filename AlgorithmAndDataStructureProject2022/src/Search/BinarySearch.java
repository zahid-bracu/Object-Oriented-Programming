package Search;
public class BinarySearch {
    public static int binarySearch(int array[], int value, int low , int high){
        if(low<high){
            int mid=low+(high-low)/2;
            if(array[mid]==value){
                return mid;
            }else if(array[mid]>value){
                return binarySearch(array,value,low,mid-1);
            }else{
                return binarySearch(array,value,mid+1,high);
            }
        }
        
        return -1;
    }
    public static void main(String [] args){
        int array[]={11,22,33,44,55,66,77,88,99,110};
        int searchValue=56;
        int index=binarySearch(array,searchValue,0,array.length-1);
        if(index>=0)
            System.out.println("Found at Position : "+index);
        else
            System.out.println("Not Found");
    }
}
