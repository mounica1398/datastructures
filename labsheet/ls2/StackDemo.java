public class StackDemo 
{
	private static int n_size = 10;
	int A[] = new int[n_size];
	int top = -1;
	public void push(int x)
	{
		// Implement push operation
		//Display proper message
		// Call displayElements()
		if(isFull())
			System.out.println("stack is full : Overflow");

		else 
		{	
			top++;
			A[top] = x;
			System.out.println("after push the element is: ");
			displayElements();
		}		
	}
	public void pop() 
	{
		// Implement pop operation
		//Display proper message
		// Call displayElements()
		if(isEmpty())
			System.out.println("Stack is empty : Underflow");
		else
		{
			int a;			
			a = A[top];
			System.out.println( "the element popped out is : "+a);
			A[top] = 0;
			top--;
		}	
		displayElements();
	}
	public void displayElements()
	{

		for (int i = 0; i <= top; i++) 
		{
			System.out.println(A[i]);
		}
	}
	public static int getSize() 
	{
		int size = 10;
		return size;
	}
	public static int getTop()

	{
		int top = -1;
		return top;
		
	}
	public boolean isEmpty()
	{
		if(top == -1)
			return true;
		else 
			return false;
	}
	public boolean isFull()
	{
		if(top == n_size-1)
			return true;
		else 
			return false;
	}
	public static void main(String[] args) 
	{
		StackDemo s = new StackDemo();
		s.push(5);
		s.push(7);
		//Try push on a full stack
		s.pop();
		//Try pop on empty stack
		int n= getSize();
		System.out.println("the size of Stack is :"+n);
		int m= getTop();
	}

}
