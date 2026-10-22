class BubbleSort {

	public static void main(String [] args ) {
		BubbleSort obj = new BubbleSort();
		int [] arr = {1, 2,5,3, 4, 10, 8, 6};

		obj.printArray(arr);

		System.out.println("After Sorting");
		obj.bubbleSortAlgo(arr);
		obj.printArray(obj.bubbleSortAlgo(arr));
	}
	public void printArray(int [] arr ) {
		System.out.println("Printing arrays ");

		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}

	public int [] bubbleSortAlgo( int [] arr){
		// bubble sorting algorithms

		for(int i = 0; i<arr.length-1; i++){
			// inner loop to perform a circle

			for(int j = 0; j < arr.length-i - 1; j++){
				if( arr[j] > arr[j+1] ){
					int c = arr[j +1];
					arr[j+1] = arr[j];
					arr[j] = c;
				}
			}
		}
		return arr;
	}
}