public class MergeSort {
    public void mergeSort( int[] arr, int left, int right){
        if(left < right){
            int mid = left + (right - left) /2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            sort(arr, left, right, mid);
        }
    }
    public void sort(int[] arr, int left, int right, int mid){
        int n1 = (mid-left)+1;
        int n2 = right-mid;
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        for(int i=0; i<n1; i++){
            leftArray[i] = arr[i+left];
        }
        for(int j=0; j<n2; j++){
            rightArray[j] = arr[j+mid+1];
        }
        int i=0;
        int j=0;
        int k=left;
        while (i<n1 && j<n2){
            if(leftArray[i] < rightArray[j]){
                arr[k] = leftArray[i];
                i++;
            }else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i<n1){
            arr[k++] = leftArray[i++];
        }
        while (j<n2){
            arr[k++]  = rightArray[j++];
        }
    }
}
