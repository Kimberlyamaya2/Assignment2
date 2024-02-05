public class SelectionSort implements SortingAlgorithm {
    public int[] sort(int [] input){

        int n = input.length;

        for(int i = 0; i < n - 1 ; i++){
            int min = i;
            for(int j = i + 1; j < n; j++) {
                if (input[j] < input[min]) {
                    min = j;
                }
            }
            int tmp = input[min];
            input[min] = input[i];
            input[i] = tmp;
        }
        return input;
    }

    public String getName(){
        return "Selection Sort";
    }
}
