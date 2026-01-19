package arrayprogram;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		//int size;
//		int arr1[] = new int[4];
//		int arr2[] = new int[6];
//		System.out.println("Enter the first array:");
//		for (int i = 0; i <arr1.length; i++) {
//			
//			arr1[i]=sc.nextInt();
//		}
//		
//		System.out.println("Array element:");
//		for (int i = 0; i <arr1.length; i++) {
//			
//			System.out.println(arr1[i]);
//		}
//		
//		System.out.println("Enter the second array:");
//		for (int i = 0; i <arr2.length; i++) {
//			
//			arr2[i]=sc.nextInt();
//		}
//		
//		System.out.println("Array element:");
//		for (int i = 0; i <arr2.length; i++) {
//			
//			System.out.println(arr2[i]);
//		}
//		
////		for(int i=0;i<arr1.length;i++)
////		{
////			for (int j = 0; j < arr2.length; j++) {
////				
////			}
////		}
////		int[] arr3=new int[10];
////		for (int i = 0; i < arr3.length; i++) {
////			arr3[i]=arr1[i]+arr2[i];
////		}
////		
////		for (int i = 0; i < arr3.length; i++) {
////			System.out.println(arr3[i]);
////		}
//		
//		
//		
//		int temp,temp1;
//		for(int i=0;i<arr1.length;i++)
//		{
//			for (int j = i+1; j < arr1.length; j++) {
//				if(arr1[j]>arr1[i])
//				{
//					temp=arr1[i];
//					arr1[i]=arr1[j];
//					arr1[j]=temp;
//					
//					temp1=arr2[i];
//					arr2[i]=arr2[j];
//					arr2[j]=temp1;
//					
//				}
//			}
//		}
//		
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.println(arr2[i]);
//		}
//		
//		
//		
//		sc.close();
		
		 Scanner sc=new Scanner(System.in);
	      int[] arr1=new int[4];
	      int[] arr2=new int[6];
	      int[] arr3=new int[10];
	      System.out.println("Enter element of first array:");
	      for(int i=0;i<arr1.length;i++){
	    	  arr1[i]=sc.nextInt();
	      }
	      System.out.println("First array elements:");
	      for(int i=0;i<arr1.length;i++){
	    	  System.out.println(arr1[i]);
	      }
	      System.out.println("\nEnter element of second array:");
	      for(int i=0;i<arr2.length;i++){
	    	  arr2[i]=sc.nextInt();
	      }
	   // Display second array
	      System.out.println("Second array elements:");
	      for(int i=0;i<arr2.length;i++){
	    	  System.out.println(arr2[i]);
	      }
	     // System.out.println("\n");
	      System.out.println("The third element of array is:\n");
	      
	        int i = 0, j = 0, k = 0;
	      while (i < arr1.length && j < arr2.length) {
	            if (arr1[i] <= arr2[j]) {
	                arr3[k] = arr1[i];
	                i++;
	            } else {
	                arr3[k] = arr2[j];
	                j++;
	            }
	            k++;
	        }
	   // Copy remaining elements of arr1
	        while (i < arr1.length) {
	            arr3[k] = arr1[i];
	            i++;
	            k++;
	        }
	        // Copy remaining elements of arr2
	        while (j < arr2.length) {
	            arr3[k] = arr2[j];
	            j++;
	            k++;
	        }
	        System.out.println("Merged sorted array:");
	        for (int x = 0; x < arr3.length; x++) {
	            System.out.print(arr3[x] + " ");
	        }
	        sc.close();

	}

}
