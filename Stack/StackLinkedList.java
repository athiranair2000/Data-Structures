public class StackLinkedList{
	private int length;
	private NodeClass top;
	
	public StackLinkedList(){	//first state
		length=0;
		top=null;
	}
	
	public void push(int data){	//adding data
		NodeClass ns=new NodeClass(data);	
		ns.setNext(top);	//changing top
		top=ns;
		length++;		//increases length
	}
	
	public boolean isEmpty(){	//checking if empty
		return (length==0);
	}
	public int pop() throws EmptyStackException{  
		//deleting data
			throw new EmptyStackException();
		}
		int res=top.getData();	//top value
		top=top.getNext();	//changes top value
		length--;		//length decreases
		return res;
	}
	public int size(){		//size of stack
		return length;
	}
	public String toString(){	//printing values in format
		String str-" ";
		NodeClass ns=top;
		while(ns!=null){
			str=str+ns.toString()+" ->>";
		}
		return str;
	}
	}


		
