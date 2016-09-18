import java.io.*;
class Queue
{
	int  q[] = new int [20];
	int front = -1;
	int rear = -1;
	public void Enqueue(int num)
	{
		if(isEmpty())
		{
			front = 0;
			rear = 0;
			q[rear] = num;
		}
		else
		{ 
			rear = rear+1;
			q[rear] = num;
		}
		System.out.println("after Enqueue");
		
	}
	public void Dequeue()
	{
		if(!(isEmpty() ) && front ==rear)
		{
			front = -1;
			rear = -1;
			q[front] = 0;
		}
		else
		{
			front= front+1;
			q[front] = 0;
		}
		System.out.println("after Dequeue");
		displayElements();
	}
	public boolean isFull()
	{
		if(front ==0 && rear == 19)
			return true;
		else
			return false;
	}
	public boolean isEmpty()
	{
		if(front == -1 && rear == -1)
			return true;
		else 
			return false;
	}
	public int getFront()
	{
		if( !( isEmpty() ) )
			return q[front];
		else 
			return 0;
	}
	public int getSize()
	{
		if (front < rear)
			return (rear-front)+1;
		else 
			return 1;
	}
	public void displayElements()
	{
		for (int i = 0; i <= rear; i++) 
		{
			System.out.println(q[i]);
		}
	}

}
