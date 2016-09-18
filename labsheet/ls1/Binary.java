import java.io.*;
import java.util.Scanner;
class Binary
{
	int stack[] = new int[10];
	int top = -1;
	public  boolean isFull()
	{
		if(getSize() == 10)
			return true;
		else 
			return false;
	}
	public boolean isEmpty()
	{
		if(top == -1)
			return true;
		else 
			return false;
	}
	public int getSize()
	{
		return (top+1);
	}
	public int getTop()
	{
		return stack[top];
	}
	public void push(int n)
	{
		if(isFull())
			System.out.println("Stack overflow\n");
		else
		{
			top++;
			stack[top] = n;
		}
	}
	public void pop()
	{
		if(isEmpty())
			System.out.println("Stack underflow\n");
		else
		{
			top--;
		}
	}
	/*public void displayElements()
	{
		int i;
		while(top!=-1)
		{
			System.out.println(stack[top]);
			pop();
		}
	}*/
	public void tobinary(int bin)
	{
		int i,res;
		for(i=0;bin>0;i++)
		{
			res = bin % 2;
			push(res);
			bin = bin/2;
		}
		while(!(top == -1))
		{
			System.out.print(stack[top]);
			pop();
		}
			
	}
	public static void main(String[]args) throws IOException
	{
		Binary b = new Binary();
		int num;
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner in = new Scanner(System.in);
		System.out.println("Enter input number");
		num = in.nextInt();
		b.tobinary(num);
		System.out.println(" is the number in binary ");	
		
	}
}
