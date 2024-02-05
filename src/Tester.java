import java.util.Random;

public class Tester {
        private SortingAlgorithm sortingAlgorithm;

        //constructor
        public Tester(SortingAlgorithm algorithm) {
            this.sortingAlgorithm = algorithm;
        }


        public double singleTest(int size) {

            int[] input = generateKSorted(size);

            long startTime = System.nanoTime();
            sortingAlgorithm.sort(input);
            long endTime = System.nanoTime();

            return (endTime - startTime) / 1e6;
        }

        public void test(int iterations, int size) {
            double totalTime = 0;
           for (int i = 0; i < iterations; i++) {
              totalTime += singleTest(size);
         }
         double average = totalTime/ iterations;
           //normal print (#8)
           // System.out.println("Sorted " + size + "elements in  " + average + "ms (avg)");

            //kSorted print
            System.out.println("Sorted " + size + "elements in  " + average + "ms (avg) with 10-sorted data");
        }

    public int[] generateKSorted (int size) {
        int[] input = new int[size];

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            input[i] = random.nextInt();
        }

            for(int gap = size/10; gap > 0; gap /= 2){
                for(int i = gap; i < size; i++){
                    int a  = input[i];  int j;
                    for( j = i;  j >= gap && a < input[j - gap]; j-=gap){
                        input[j] = input[j - gap];
                    }
                    input[j] = a;
                }
            }
            return input;
    }
}