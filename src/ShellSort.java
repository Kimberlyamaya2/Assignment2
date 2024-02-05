public class ShellSort implements SortingAlgorithm {
    public int[] sort(int [] input){

        int n = input.length;
        int a;

        for(int gap = n/2; gap > 0; gap /=2){
            for(int i = gap; i < n; i++){
                a = input[i];  int j;
                for( j = i;  j >= gap && a < input[j - gap]; j-=gap){
                    input[j] = input[j - gap];
                }
                input[j] = a;
            }
        }
        return input;
    }

    public String getName(){
        return "Shell Sort";
    }
}

