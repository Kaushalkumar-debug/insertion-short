public class insert {
    static void insertionSort(int[]array){
        int n= array.length;
        for(int i=0;i<n;i++){
        int j=i;
        while(j> 0 && array[j]<array[j-1] ){
            int temp=array[j];
            array[j]=array[j-1];
            array[j-1]=temp;
            j--;
        }
        }
    }
    public static void main(String[]args){
        int array[]={20,3,7,1,2};
        insertionSort(array);
        for(int i : array){
            System.out.println(i);
        }
    }
    
}
