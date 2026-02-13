public class insertionsort{

	public static int[] insertion(int[] v){
		
		int n = v.length;

		for(int i = 1; i < n ; i++){
		
			System.out.println(i + ":" + java.util.Arrays.toString(v));
			/*   */
			if(v[i] < v[i-1]){
			
				int j = i;
				
				while(v[j] < v[j-1] && j > 0){

					int aux = v[j-1];
					v[j-1] = v[j];
					v[j] = aux;					
					if(j==1){ continue; }
					j--;
				}
			}			
			
		}

		return v;
	}

	public static void main(String[] args){

		int[] v = {3,4,2,6,1,7,4};

		System.out.println("Original array: " + java.util.Arrays.toString(v));
		
		int[] qsv = insertion(v);	

		System.out.println("Original array: " + java.util.Arrays.toString(qsv));

	}
}
