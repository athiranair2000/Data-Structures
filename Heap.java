public class MinHeap {
    int[] arr;
    int size; //Size of heap

    
    public MinHeap(int[] keys) {
        arr = keys;  
	size = arr.length; 
    }

    
    public void print()  {
        System.out.print(arr[0]);
        for (int i=1; i<size; i++)
            System.out.print(" " + arr[i]);
        System.out.println();
    }

    
   
    
    public int parent(int i) {
        
        if (i == 0) 
            return 0;		//root node
        else 
            return (i-1)/2;
        
    }

    
    public int left(int i) {
        
        if ( 2*i+1 < size ) //left node(internal)
            return 2*i+1;
        else                // 2. leaf node
            return -1;
    }

    
    public int right(int i) {
        
        if ( 2*i+2 < size ) // 1. internal node(right)
            return 2*i+2;
        else                // 2. leaf node
            return -1;
    }

    
    public int checkProperty(int i) {
        if (left(i) == -1 && right(i) == -1)
            return i;
        else if (right(i) == -1) {
            if (arr[i] < arr[left(i)])
                return i;
            else
                return left(i);
        }
        else if (arr[i] < arr[left(i)] && arr[i] < arr[right(i)])
            return i;
        else if (arr[i] > arr[left(i)] && arr[i] < arr[right(i)])
            return left(i);
        else if (arr[i] < arr[left(i)] && arr[i] > arr[right(i)])
            return right(i);
        else if (arr[left(i)] < arr[right(i)])
            return left(i);
        else
            return right(i);
    }

    
    void exchange(int i, int j) {	//swapping
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    
    void fixHeap(int i) {
        int j = checkProperty(i);	
        if (i == j)
            return;
        else {
            exchange(i,j);	//swapping function
            fixHeap(j);		//recursively fixing heap using next node as root
        }
    }

   
   void buildHeap() {
        for (int i=(size-2)/2; i>=0; i--) 
            fixHeap(i);		//start from smallest parent till ancestor
    }
	
	
   int extractMin() {
        int val = arr[0]; // First copy the value at root
	
        arr[0] = arr[size-1]; // Bring last element to root
	fixHeap(0); // Fix the heap from the root
	size--;  // Decrement the size

        return val;
    }

    
    
	

    public static void main(String[] args) {
        int[] keys = {5, 3, 8, 6, 2, 1, 7, 9, 4, 0};
        MinHeap m = new MinHeap(keys);
        m.print();  //5 3 8 6 2 1  7 9 4 0

        m.buildHeap();
        m.print();  // prints 0 2 1 4 3 8 7 9 6 5
	System.out.println( m.extractMin() ); 
        m.print();

       
    }


}
