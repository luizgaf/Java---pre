public class selectionsort{

        public static int[] selection(int[] v){

                int n = v.length;

                for(int i = 0; i < n ; i++){

                        int index = i;

                        for(int j = i; j < n; j++){
                                if(v[index] > v[j]){
                                        index = j;
                                }

                        }
                        int temp = v[index];
                        v[index] = v[i];
                        v[i] = temp;

                }

                return v;

        }

        public static void main(String[] args){

                int[] v = {3,4,2,6,1,7,4};

                System.out.println("Original array: " + java.util.Arrays.toString(v));

                int[] qsv = selection(v);

                System.out.println("Original array: " + java.util.Arrays.toString(qsv));

        }
}
