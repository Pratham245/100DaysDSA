package box;

import java.util.Arrays;

public class ALLinOne {

	static void ogarray(int arr[]) {
		//original array code
		System.out.println("The original array was");
		for(int i=0;i<arr.length;i++) {
			
	    	   System.out.print(arr[i] + " ");
	       }
		System.out.println( );
	}
	static void InsertionSort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					swap(arr,j,j-1);
				}
				else {
					break;
				}
			}
		}
		
		
	}
	//selection sort code
	static void selectionsort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int last=arr.length-i-1; 
			int getmax = maxIndex(arr,0,last);
			swap(arr,getmax,last);
		}
	}
	
	static int  maxIndex(int arr[],int start,int end) {
		int max=start;
		for(int i=start;i<=end;i++) {
			if(arr[i]>arr[max]) {
				max=i;
			}
		}
		return max;
	}
	
	static void swap(int arr[],int start,int end) {
		 int temp=arr[start];
		 arr[start]=arr[end];
		 arr[end]=temp;
	}
	static void BubbleSort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					swap(arr,j,i);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[] = {2,4,1,3,5};
      //selectionsort(arr);
      //InsertionSort(arr);
      BubbleSort(arr);
      System.out.println(Arrays.toString(arr));
	}

}
