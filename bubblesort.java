public class quicksort{

        public static int[] quicksort(int[] v){

                int n = v.length;

                for(int i = 0; i < n - 1; i++){

                        for(int j = 0; j < n -1 - i; j++){

                                if(v[j] > v[j+1]){
                                        int aux = v[j];
                                        v[j] = v[j+1];
                                        v[j+1] = aux;
                                }
                        }
                }


                return v;

        }

        public static void main(String[] args){

                int[] v = {3,4,2,6,1,7,4};

                System.out.println("Original array: " + java.util.Arrays.toString(v));

                int[] qsv = quicksort(v);

                System.out.println("Original array: " + java.util.Arrays.toString(qsv));

        }
}
