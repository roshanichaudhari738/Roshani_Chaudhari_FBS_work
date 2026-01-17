package selectionsort;

public class SelectionSortProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {64,25,12,22,11};
		int n=arr.length;
		
		//i is current element index
		//go to the n-1 
		for (int i = 0; i < n-1; i++) {
			int min=i;
			
			for (int j = i+1; j < n; j++) {
				if (arr[j]<arr[min]) {
					min=j;
				}
			}
				
				//min swap to current index
				int temp=arr[min];
				arr[min]=arr[i];
				arr[i]=temp;
			
		}
		
		System.out.println("Sorted Array is :");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
