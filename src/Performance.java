import java.io.FileWriter;
import java.io.PrintWriter;

public class Performance {

    public static void main(String[] args) {
        SortingAlgorithm[] sortingAlgorithms = {
                new BubbleSort(),
                new MergeSort(),
                new QuickSort(),
                new ShellSort(),
                new InsertionSort(),
                new SelectionSort(),
        };

        int[] inputSizes = {100, 500, 1000, 2000, 5000, 10000, 20000, 75000, 150000};
        int iterations = 20;

        try {
            FileWriter file = new FileWriter("performance_report.text");
            PrintWriter print = new PrintWriter(file);

            for (SortingAlgorithm algorithm : sortingAlgorithms) {
                System.out.println("Sorting Algorithm: " + algorithm.getName());

                Tester tester = new Tester(algorithm);

                for (int size : inputSizes) {
                    tester.test(iterations, size);

                    //K-sorted
                     tester.generateKSorted(size);
                }
            }
            print.close();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
