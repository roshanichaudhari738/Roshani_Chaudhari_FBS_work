package bubblesortprogam;

public class Bubbleprogram {

	public static void main(String[] args) {
		int[] arr= {12,11,22,25,34,64};
		int n=arr.length;//size of array
		bubblesort(arr, n);
		System.out.println("Bubble Sort is:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static void bubblesort(int[] arr, int n) {
		// TODO Auto-generated method stub
		for (int i = 0; i <n-1 ; i++)//this are outer loop for passes
		{
			int swap=0;
			for (int j = 0; j < n-i-1; j++) {
				if (arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swap++;
				}
			}
			if(swap==0) 
				break;
			System.out.println("No of iteration is "+(i+1) +"\nSwapping is "+swap);
			
		}
	}

}
