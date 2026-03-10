#include <stdio.h>

void parray(int v[], int size){

	printf("[ ");
	for(int i = 0; i < size ; i++){
		printf("%d ", v[i]);
	}
	printf("] \n");
}

void bbs(int v[], int size){
	//bubble sort - stable
	for(int i = 0; i < size - 1; i++){
		for(int j = 0; j < size - 1 - i; j++ ){
			if(v[j] > v[j+1]){
				int aux = v[j];
				v[j] = v[j+1];
				v[j+1] = aux;
			}
		}
	}
}

void sls(int v[], int size){
	// selection sort - unstable
	for(int i = 0; i < size ; i++){

		int midx = i;  //index of "first" element to test

		for(int j = i; j < size; j++){
			if(v[midx] > v[j]){
				//change if find a smaller number
				midx = j;
			}
		}

		//change positions

		int aux = v[midx];
		v[midx] = v[i];
		v[i] = aux;
	}
	
}

void ins(int v[], int size){
	// insertion sort - stable
	for(int i = 0; i < size; i++){
		int k = v[i];
		int j = i - 1;

		while(j >= 0 && v[j] > k){
			v[j+1] = v[j];
			--j;
		}
		v[j+1] = k;
	}
}

int lsrch(int v[], int size, int element){
	for(int i = 0; i < size; i++){
		if(v[i] == element){
			return i;
		}
	}
	printf("Element not in array\n");
	return -1;
}

int bsrch(int v[], int start, int end, int element){
	int mid = start + (end - start) / 2;

	if(v[mid] == element){
		return mid;
	}
	else if(v[mid] > element){
		return bsrch(v, 0, mid-1, element);
	}
	else if(v[mid] < element && mid != end){
		return bsrch(v, mid+1, end, element);
	}
	else{
		printf("Element not in array\n");
		return -1;
	}
}

int main(){

	int v[] = {50,40,30,20,10,9,8,7,6,5,4,3,2,1,0};
	
	int size = sizeof(v)/sizeof(v[0]);

	printf("Antes: ");
	parray(v, size);

	printf("Linear Search retornando index do elemento 10: %d \n", lsrch(v,size,20));
	
	//sls(v,size);
	//bbs(v,size);
	ins(v,size);
	
	printf("Depois: ");
	parray(v, size);

	printf("Binary Search retornando index do elemento 10: %d \n", bsrch(v, 0, size-1, 20));
}
