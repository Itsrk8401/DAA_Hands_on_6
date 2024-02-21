import java.util.Arrays;

public class QuicksortNonRandomPivot {
    public static void quicksortNonRandomPivot(int[] arr) {
        if (arr.length <= 1) {
            return;
        }
        int pivotIndex = arr.length / 2;
        int pivot = arr[pivotIndex];
        int[] lesser = Arrays.stream(arr).filter(x -> x < pivot).toArray();
        int[] equal = Arrays.stream(arr).filter(x -> x == pivot).toArray();
        int[] greater = Arrays.stream(arr).filter(x -> x > pivot).toArray();
        System.arraycopy(lesser, 0, arr, 0, lesser.length);
        System.arraycopy(equal, 0, arr, lesser.length, equal.length);
        System.arraycopy(greater, 0, arr, lesser.length + equal.length, greater.length);

        quicksortNonRandomPivot(lesser);
        quicksortNonRandomPivot(greater);
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 17, 10, 84, 19, 6, 22, 9};
        quicksortNonRandomPivot(array);
        System.out.println(Arrays.toString(array));
    }
}

Output : 

[5, 3, 17, 10, 19, 6, 22, 9, 84]


** Process exited - Return Code: 0 **
