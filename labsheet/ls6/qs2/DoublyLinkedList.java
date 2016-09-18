import java.util.Scanner;
public class DoublyLinkedList
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		DoublyList list = new DoublyList();
		System.out.println("Doubly Linked List Test"); 
		char ch;
		do
		{
			System.out.println("\nDoubly Linkedlist operations");
			System.out.println("1. insert at beginning");
			System.out.println("2. insert at end");
			System.out.println("3. insert at position");
			System.out.println("4. delete at position");
			System.out.println("5. delete at end");
			System.out.println("6. display forward");
			System.out.println("7. display backward"); 
			int choice = s.nextInt();
			switch(choice)
			{
				case 1 : System.out.println("Enter data");
					 list.insert_at_head(s.nextInt());
					 list.display_forward();
					 break;
				case 2 : System.out.println("Enter data ");
					 list.insert_at_end(s.nextInt());
					 list.display_forward();
					 break;
				case 3 : System.out.println("Enter data and position");
					 int x = s.nextInt();
					 int p = s.nextInt();
					 list.insert_at_position(x,p);
					 list.display_forward();
					 break;
				case 4 : System.out.println("Enterposition");
					 list.delete_at_position(s.nextInt());
					 list.display_forward();
					 break;
				case 5 : list.delete_at_end();
					 list.display_forward();
					 break;
				case 6 : list.display_forward();
					 break;
				case 7 : list.display_backward();
					 break;
			}
			System.out.println("\nDo you want to continue (Type y or n) ");
			ch = s.next().charAt(0);
		}while(ch == 'Y'|| ch== 'y');
		int cn = list.countNode();
		System.out.println("count of the nodes : "+cn) ;
	}
}
