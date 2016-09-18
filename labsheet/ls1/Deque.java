import java.io.*;
import java.util.Scanner;
public class Deque
{
	int front = -1;
	int rear = -1;
	char Queue[] = new char[10];
	public boolean isEmpty()
	{
		if(front == -1 && rear == -1)
			return true;	
		else
			return false;
	}
	public void Enqueue_front(char x)
	{
		if(isEmpty())
		{
			front = 0;
			rear = 0;
		}
		else
			front = front-1;
		Queue[front] = x;
	}
	public void Enqueue_rear(char x)
	{
		if(isEmpty())
		{
			front = 0;
			rear = 0;
		}
		else
			rear = rear+1;
		Queue[rear] = x;
	}
	public char Dequeue_front()
	{
		
		if(isEmpty())
		{
			System.out.println("Cannot be removed");
			return '0';
		}
		else if(front == rear)
		{
			char f = Queue[front];
			front = -1;
			rear = -1;
			return f;
		}
		else
		{
			char f = Queue[front];
			front = front+1;
			return f;
		}
		
	}
	public char Dequeue_rear()
	{
		if(isEmpty())
		{
			System.out.println("cannot be removed");
			return '0';
		}		
		else if(front == rear)
		{
			char r = Queue[rear];
			front = -1;
			rear = -1;
			return r;
		}
		else 
		{
			char r = Queue[rear];
			rear = rear-1;
			return r;
		}
		
	}
	public void checkPalindrome()
	{
		while(front<rear )
		{
			char f = Dequeue_front();
			char r = Dequeue_rear();
			//if(Dequeue_front() != Dequeue_rear())
				//break;
			if(f!=r)
			{
				System.out.println("is not a palindrome");
				break;
			}
			else if(front == rear)
			{
				System.out.println("is a palindrome");
			}
		}
	}			
	public static void main(String [] args) throws Exception
	{
		Deque d = new Deque();
		/*d.Enqueue_rear('a');
		d.Enqueue_rear('b');
		d.Enqueue_rear('b');*/
		System.out.println("enter /, after completion of Sring");
		System.out.println("enter the input");
		char ch = '0';
		while(ch != '/')
		{
			Scanner in = new Scanner(System.in);
			ch = in.next().charAt(0);
			if(ch == '/')
				break;
			d.Enqueue_rear(ch);
		}
		d.checkPalindrome();
	}
}
