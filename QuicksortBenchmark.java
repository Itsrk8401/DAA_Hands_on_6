import java.util.Arrays;
import java.util.Random;

public class QuicksortBenchmark {
    private static Random random = new Random();

    public static void main(String[] args) {
        int[] arraySizes = {10, 100, 1000, 10000};

        for (int size : arraySizes) {
            int[] bestCaseData = new int[size];
            for (int i = 0; i < size; i++) {
                bestCaseData[i] = i;
            }

            int[] worstCaseData = new int[size];
            for (int i = 0; i < size; i++) {
                worstCaseData[i] = size - i;
            }

            int[] averageCaseData = new int[size];
            for (int i = 0; i < size; i++) {
                averageCaseData[i] = random.nextInt(size * 10);
            }

            long startTime, endTime;

            // Best case benchmark
            startTime = System.nanoTime();
            QuicksortNonRandomPivot.quicksortNonRandomPivot(bestCaseData.clone());
            endTime = System.nanoTime();
            System.out.println("Best Case - Array Size: " + size + ", Time: " + (endTime - startTime) + " ns");

            // Worst case benchmark
            startTime = System.nanoTime();
            QuicksortNonRandomPivot.quicksortNonRandomPivot(worstCaseData.clone());
            endTime = System.nanoTime();
            System.out.println("Worst Case - Array Size: " + size + ", Time: " + (endTime - startTime) + " ns");

            // Average case benchmark
            startTime = System.nanoTime();
            QuicksortNonRandomPivot.quicksortNonRandomPivot(averageCaseData.clone());
            endTime = System.nanoTime();
            System.out.println("Average Case - Array Size: " + size + ", Time: " + (endTime - startTime) + " ns\n");
        }
    }
}

Output : 

Best Case - Array Size: 10, Time: 98711531 ns
Worst Case - Array Size: 10, Time: 309910 ns
Average Case - Array Size: 10, Time: 340531 ns

Best Case - Array Size: 100, Time: 3120577 ns
Worst Case - Array Size: 100, Time: 2976388 ns
Average Case - Array Size: 100, Time: 4322490 ns

Best Case - Array Size: 1000, Time: 94861361 ns
Worst Case - Array Size: 1000, Time: 87449126 ns
Average Case - Array Size: 1000, Time: 6059178 ns

Best Case - Array Size: 10000, Time: 111510820 ns
Worst Case - Array Size: 10000, Time: 291557374 ns
Average Case - Array Size: 10000, Time: 208525643 ns



** Process exited - Return Code: 0 **
