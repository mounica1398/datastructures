import java.util.Scanner;
class Cdriver
{
	public static void main(String[] args)
	{
		Cqueue que = new Cqueue();
		Scanner s = new Scanner(System.in);
		int c, x;
		int con = 1;
		do
		{
			System.out.print("Select: \n1. Enqueue\n2. Dequeue\n3. Size\n4. IsEmpty\n5. IsFull\n6. Front\n7. Print");
			System.out.println("\nEnter: ");
			c = s.nextInt();
			switch(c)
			{
				case 1: System.out.println("Enter number to enter: ");
						x = s.nextInt();
						que.enqueue(x);
						break;
				case 2: que.dequeue();
						break;
				case 3: que.size();
						break;
				case 4: if(que.isEmpty())
							System.out.println("Queue is empty!");
						else
							System.out.println("Queue is not empty!");
						break;
				case 5: if(que.isFull())
							System.out.println("Queue is full!");
						else
							System.out.println("Queue is not full!");
						break;
				case 6: que.front();
						break;
				case 7: que.display();
						break;
				default: System.out.println("Wrong choice!");
			}
			System.out.println("Choose again?(1/0)");
			con = s.nextInt();
			
		}while(con == 1);
		s.close();
	}
}
