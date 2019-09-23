public class StackArrayImplementation{
	int top;				//top element
	int length;				//length is fixed(array)
	int[] stack;				//Array with name stack
	StackArrayImplementation(){		//constructor
		top=-1;
		length=10;
		stack=new int[length];
	}
	public boolean isEmpty(){		//array is empty
		return top==-1;
	}
	public boolean isFull(){		//array is full
		return top==length-1;
	}
	public int push(int data){		//insert top
		if(isFull()){
			System.out.println("Stack is full");
	}
	return stack[++top]=data;
	}
	public int pop()			//remove top
	{	
		if(isEmpty()){
			System.out.println("Stack is Empty");
		}
		return stack[top--];
	}
	public int peek(){			//top value
		return stack[top--];
	}
	public static void main(String ar[]){
		StackArrayImplementation st=new StackArrayImplementation();
		st.push(34);
		st.push(314);
		st.push(24);
		st.push(14);
		st.push(40);
		System.out.println(st.isEmpty());	//false
		System.out.println(st.isFull());	//false as size is 10
		System.out.println(st.peek());		//40
		System.out.println(st.pop());		//14
	}
}
		
		
