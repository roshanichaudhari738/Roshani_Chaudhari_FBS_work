package binarysearchprogram;

public class BinarySearchProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr=new int[] {2,4,10,23,31,47,54,62,76,80};
		int x=31;
		int result=binarySearch(arr,x);
		if(result!=-1)
		{
			System.out.println("Found");
		}else {
			System.out.println("Not Found");
		}

	}

	private static int binarySearch(int[] arr, int x) {
		// TODO Auto-generated method stub
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int mid=start+end/2;
			
			if(arr[mid]==x)
			{
				return mid;
			}else if (arr[mid]>x) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		return -1;
	}

}
