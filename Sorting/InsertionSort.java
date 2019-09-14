public class InsertionSort{
	public int[] insertionsort(int arr[]){
		int i,j,temp,key;
		for( i=1;i<arr.length;i++){ //outer loop
			key=arr[i];	//taking first element as key
			j=i-1;		//j as the index of the element before it.
		while(j>=0 && key<arr[j]){  //inner loop
			temp=arr[j];		//swaping
			arr[j]=arr[j+1];
			arr[j+1]=temp;
			j--;			//to check till leftmost end.
		}
	}
	return arr;
}
	
	public static void main(String a[]){    
        int[] arr1 = {9,14,3,2,43,11,58,22};    
        System.out.println("Before Insertion Sort");    
        for(int k:arr){    
            System.out.print(k+" ");    
        }    
        System.out.println();    
            
        insertionsort(arr);//sorting array using insertion sort    
           
        System.out.println("After Insertion Sort");    
        for(int k:arr){    
            System.out.print(k+" ");    
        }    
    }    
}
