class Status
{
	public static void main(String args[])
	{
		Queue2 que = new Queue2();
		que.enqueue(2);
		que.enqueue(1);
		que.enqueue(3);
		que.enqueue(2);
		que.enqueue(4);
		que.enqueue(2);
		que.enqueue(3);
		que.display();
		que.dequeue();
		que.dequeue();
		que.dequeue();
		que.display();
		que.enqueue(2);
		que.enqueue(3);
		que.enqueue(4);
		que.enqueue(1);
		que.display();
	}
}
