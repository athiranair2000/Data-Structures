public class StackMainTest{
	
	public static void main(String a[]){
		StackLinkedList stack=new StackLinkedList();
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		stack.push(10);
		stack.push(20);
		stack.push(50);
		
		System.out.println(stack.toString());
		
		Stack.pop();
		
		}
}
