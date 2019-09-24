public class ArrayQueue{
	int front,rear,size,enqueued,dequeued;
	static final int CAPACITY=100;			//capacity of array
	int[] queue=new int[CAPACITY];
	public ArrayQueue(){				//initialisaion
		front=0;
		rear=-1;
		size=0;
	}
	
	public boolean isEmpty()			//size if empty
	{
		return (size==0);
	}
	
	public boolean isFull()				//size if full
	{
		return (size==CAPACITY);
	}

	public void enqueue(int element)
	{
		if(isFull()){
			System.out.println("Stack is full");
		}
		else{
			rear=(rear+1)%CAPACITY;		//to get index of array as it is limited to a specific size
			queue[rear]=element;
			System.out.println("element enqueued:"+queue[rear]);
			size++;				//adding so size increases
			System.out.println("After enqueue size:"+size);

			
			
	}
}
	public int dequeue()
	{
		if(isFull()){
			System.out.println("Stack is empty");
		}
		else{
			int dequeued=queue[front];		//element in front
			System.out.println("element dequeued:"+dequeued);
			front=(front+1)%CAPACITY;		//to remove front value
			size--;
								//size decreases due to removal of elements
			}
			return dequeued;
	}
	public void print(){
		if(isEmpty()){
			System.out.println("Stack empty");
		}
		else
		{
			System.out.println("elements in queue:");

			for(int i=front;i<(front+size);i++){
				System.out.println(queue[i]);	//print elements in queue
			}
		}
	}
	public static void main(String a[]){
		ArrayQueue q=new ArrayQueue();
		q.enqueue(1);				//1
		q.enqueue(2);				//2
		q.enqueue(3);				//3
		q.enqueue(4);				//4
		q.enqueue(5);				//5
		q.print();				
		q.dequeue();				//1
		q.dequeue();				//2
		System.out.println("front element:"+q.queue[q.front]);		//3
		System.out.println("rear element is"+q.queue[q.rear]);		//5
	}
}
		

