import java.util.Arrays;
import java.util.Random;

public class QuicksortRandomPivot {
    private static Random random = new Random();

    public static void quicksortRandomPivot(int[] arr) {
        if (arr.length <= 1) {
            return;
        }
        int pivotIndex = random.nextInt(arr.length);
        int pivot = arr[pivotIndex];
        int[] lesser = Arrays.stream(arr).filter(x -> x < pivot).toArray();
        int[] equal = Arrays.stream(arr).filter(x -> x == pivot).toArray();
        int[] greater = Arrays.stream(arr).filter(x -> x > pivot).toArray();
        System.arraycopy(lesser, 0, arr, 0, lesser.length);
        System.arraycopy(equal, 0, arr, lesser.length, equal.length);
        System.arraycopy(greater, 0, arr, lesser.length + equal.length, greater.length);

        quicksortRandomPivot(lesser);
        quicksortRandomPivot(greater);
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 17, 10, 84, 19, 6, 22, 9};
        quicksortRandomPivot(array);
        System.out.println(Arrays.toString(array));
    }
}

Output : 

[5, 3, 6, 9, 17, 10, 84, 19, 22]


** Process exited - Return Code: 0 **
