


	public class Bubble_Sort{
	
	public static void bubblesort(int arr[]){
		
		int n=arr.length;   //storing size of array to variable n
		int temp=0;	//created a temp variable to store swapped element 
	for(int i=0;i<n;i++){	//an outer loop which counts number of iterations.
		for(int j=0;j<n-i-1;j++){		//inner loop to swap elements if a[j]>a[j+1]
							//Elements at end are large.
			if(arr[j]>arr[j+1]){	//swapping
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	}

}
	
		
		
		

		
