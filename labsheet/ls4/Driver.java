import java.io.*;
class Driver
{
	public static void main(String[] args)throws Exception 
	{
		int n;
		do
		{
			BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
			Queue b = new Queue();
			System.out.println("enter your choice");
			System.out.println(" 1. Enqueue \n 2. Dequeue \n 3. Front \n 4. Size  \n 5. Exit");
			n = Integer.parseInt( br.readLine());
			switch(n)
			{
				case 1 : BufferedReader br1 =new BufferedReader (new InputStreamReader(System.in));
					 System.out.println("enter an element to be inserted");
					 int a = Integer.parseInt( br1.readLine());
					 b.Enqueue(a);
					 b.displayElements();
					 break;
				case 2 : b.Dequeue();
					 break;
				case 3 : b.getFront();
					 break;
				case 4 : b.getSize();
					 break;
			}
				
		}while(n != 5);
	}

}
