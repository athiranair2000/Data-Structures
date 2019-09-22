public class QueueinkedList{

public void enque(int key){		//insertion of an element at beginning
	Node temp=new Node();
	temp.data=key;
	
	if(head==null)
		head=temp;
	else{
		Node curr=head;
		while(curr.next!=null)
			curr=curr.next;
		curr.next=temp;
	}
	
}
public int dequeue() throws RuntimeException {
	if(isEmpty())
		throw new RuntimeException("Queue is Empty");
	else{
		int val=head.data;	//Copy data
		head=head.next;		//Remove first node 0(1)
		return val;
	}
}
public int front() throws RuntimeException {
	if(isEmpty())
		throw new RuntimeException("Queue is empty");
	else
		return head.data;
}

public boolean isEmpty(){
	if(head==null)
		return true;
	else
		return false;
	}
}
