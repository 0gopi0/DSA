
public class QuickSort {
    public void quickSort(int[] arr, int low, int high){
    if(low<high){
        int pivit = sort(arr, low, high);
        quickSort(arr, low, pivit-1);
        quickSort(arr, pivit+1, high);
    }
    }
    public int sort(int[] arr, int low, int high){
        int pivit = arr[high];
        int i = low-1;
        for(int j=low; j<high; j++){
            if (arr[j] < pivit){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return i+1;
    }
    public void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
