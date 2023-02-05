package test2.array;

public class MoveZeros {

    static void moveZerosN (int[] arr, int size){
        int count=0;
        // If the current element is not 0, then we need to
        // append it just in front of last non 0 element we found.
        for (int i = 0; i < size; i++) {
            if(arr[i]!=0){
                arr[count++] = arr[i];
            }
            
        }
        // After we have finished processing new elements,
        // all the non-zero elements are already at beginning of array.
        // We just need to fill remaining array with 0's.
        for (int i = count; i <size ; i++) {
            arr[i]=0;
            
        }

    }
    public static void main (String[] args) {

        int arr[] = {10, 0, 12, 0, 23};
        int size = arr.length;
        moveZerosN(arr,size);
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
            
        }
    }
}
