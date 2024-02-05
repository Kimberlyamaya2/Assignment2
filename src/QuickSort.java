public class QuickSort implements SortingAlgorithm {
    public int[] sort(int[] input){
         QuickSort(input, 0, input.length-1);
         return input;
    }
    public static void QuickSort ( int[] input, int start, int end){

            if (end <= start) {
                return;
            }
            int high = partition(input, start, end);
            QuickSort(input, start, high);

            QuickSort(input, high + 1, end);
        }

    public String getName(){
            return "Quick Sort";
    }

       public static int partition ( int[] input, int start, int end){
            int midpoint = start + (end - start) / 2;
            int pivot = input[midpoint];

            int low = start;
            int high = end;

            boolean done = false;
            while (!done) {
                // Increment low while numbers[low] < pivot
                while (input[low] < pivot) {
                    low = low + 1;
                }

                // Decrement high while pivot < numbers[high]
                while (pivot < input[high]) {
                    high = high - 1;
                }

                // If low and high have crossed each other, the loop is done. If not, the elements are swapped, low is
                // incremented and high is decremented.
                if (low >= high) {
                    done = true;
                } else {
                    int temp = input[low];
                    input[low] = input[high];
                    input[high] = temp;
                    low++;
                    high--;
                }
            }

            // "high" is the last index in the left segment.
            return high;
        }
    }
