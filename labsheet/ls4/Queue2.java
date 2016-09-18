class Queue2
{
	final int n = 10;
	int[] q = new int[n];
	int front = -1, rear = -1;
	boolean isEmpty()
	{
		if(front == -1 && rear == -1)
			return true;
		else
			return false;
	}
	boolean isFull()
	{
		if( (rear + 1)%n == front)
			return true;
		else
			return false;
	}
	void enqueue(int x)
	{
		if(isFull())
			System.out.println("Queue is full!");
		if(isEmpty())
		{
			front = 0;
			rear = 0;
			q[rear] = x;
		}
		else
		{
			rear = (rear+1)%n;
			q[rear] = x;
		}
	}
	void dequeue()
	{
		if(isEmpty())
			System.out.println("Queue is empty!");
		else if(front == rear)
		{
			q[front] = 0;
			front = -1;
			rear = -1;
		}
		else
		{
			q[front] = 0;
			front = (front+1)%n;
		}
	}
	void size()
	{
		if(!isEmpty())
		{
			if(front<rear)
			{
				int s = (rear - front) + 1;
				System.out.println("The size is: "+s);
			}
			else
				System.out.println("The size is: "+"-1");
		}
		else
			System.out.println("Queue is empty!");
	}
	void front()
	{
		if(isEmpty())
			System.out.println("Queue is empty!");
		else
		{
			System.out.println("The front element is: "+q[front]);
		}
	}
	void display()
	{
		if(!isEmpty())
		{
			System.out.println("The queue is: ");
			for(int i=0;i < n;i++)
			{
				System.out.print("\t"+q[i]);
			}
		}
		else
			System.out.println("Queue is Empty!");
	}
}
