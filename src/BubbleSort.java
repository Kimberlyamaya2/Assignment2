public class BubbleSort implements SortingAlgorithm {

    public int[] sort(int[] input) {

        int n = input.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (input[j + 1] < input[j]) {
                    swap(input, j, j + 1);
                }
            }
        }
        return input;
    }

    public String getName(){
        return "Bubble Sort";
    }
    private static void swap(int[] input, int i, int j) {
        int tmp = input[i];
        input[i] = input[j];
        input[j] = tmp;

    }

}