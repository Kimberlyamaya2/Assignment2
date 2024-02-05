public class InsertionSort implements SortingAlgorithm {
    public int[] sort(int[] input) {

        int n = input.length;
        int temp;
        for (int i = 1; i < n; i++) {
            temp = input[i];
            int j;
            for (j = i; j > 0 && temp < input[j - 1]; j--) {
                input[j] = input[j - 1];
            }
            input[j] = temp;
        }
        return input;
    }

    public String getName(){
        return "Insertion Sort";
    }
}