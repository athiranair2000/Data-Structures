public class NodeClass{
	
	public int data;
	//defining data
	public NodeClass next;	
	//defining next node to store address
	
	public NodeClass(int data){

		this.data=data;     //declaring values
		this.next=null;
		
	}
	
	public int getData(){	    //getter method
		return data;
	}
	public void setData(int data){	//setter method
		this.data=data;
	}
	
	public NodeClass getNext(){	//getter method
		return next;
	}
	
	public void setNext(NodeClass next){	//setter method
		this.next=next;
	}
