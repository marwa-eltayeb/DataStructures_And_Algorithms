package algorithms.sorting;

/**
 *
 * @author Marwa
 */
public class SelectionSort {
    
    public static void main(String[] args) {
        
         int[] array={1,50,30,10,60,80};
	 selectionSort(array);
	 for(int i=0;i<array.length;i++)
	 System.out.print(array[i] +"\t");
    }
    
    static void selectionSort(int[] arr){
	for(int i=0;i<arr.length-1;i++){
		int index=i;
		for(int j=i+1;j<arr.length;j++){
			if( arr[j]<arr[index])
				index=j;
		}
		if(index!=i){
			int temp= arr[index];
			arr[index]=arr[i];
			arr[i]=temp;
		}
	}
}
    
}
