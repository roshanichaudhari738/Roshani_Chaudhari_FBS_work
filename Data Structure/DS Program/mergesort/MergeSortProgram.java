package mergesort;

public class MergeSortProgram {
	public static void mergeSort(int arr[],int l,int r) {
		if(l<r)
		{
			int mid=(l+r)/2;
			mergeSort(arr, l, mid);
			mergeSort(arr,mid+1 , r);
			merge(arr,l,mid,r);
		}
	}
	
	

	private static void merge(int[] arr, int l, int mid, int r) {
		// TODO Auto-generated method stub
		int n1=mid-l+1;
		int n2=r-mid;
		
		int[] L=new int[n1];//create a array L
		int[] R=new int[n2];//create a array R
		
		for (int i = 0; i <n1; i++) {
			L[i]=arr[l+i];
		}
		
		for (int j = 0; j <n2; j++) {
			R[j]=arr[mid+1+j];
		}
		
		int i=0,j=0,k=l;
		
		while (i<n1 && j<n2) {
			if(L[i]<=R[j])
			{
				arr[k++]=L[i++];
			}
			else {
				arr[k++]=R[j++];
			}
		}
		
		while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
	}



	public static void main(String[] args) {
		int[] arr= {64,34,25,12,22,11,90};
		//int n=arr.length-1;
		
		mergeSort(arr,0, arr.length-1);
		System.out.println("Merge Sort :");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		for (int i : arr) {
			System.out.println(i+" ");
		}
	}

}
