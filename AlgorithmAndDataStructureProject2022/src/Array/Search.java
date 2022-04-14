package Array;
public class Search {
    public int SearchMethod(int array[], int value){
        for(int i=0;i<=array.length-1;i++){
            if(array[i]==value)
                return i;
        }
        return -1;
    }
    public static void main(String [] args){
        int value=33;
        int array[]= {11,22,35,44,55,66,77,88,99,110};
        Search object = new Search();
        int position=object.SearchMethod(array,value);
        if(position>=0)
            System.out.println("Found at position :"+position);
        else
            System.out.println("Not Found");
    }
}
