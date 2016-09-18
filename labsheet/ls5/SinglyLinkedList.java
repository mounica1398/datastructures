import java.util.Scanner;
public class SinglyLinkedList
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		linkedList list = new linkedList();
		System.out.println("Singly Linked List Test"); 
		char ch;
		do
		{
			System.out.println("\nSingly Linkedlist operations");
			System.out.println("1. insert at beginning");
			System.out.println("2. insert at end");
			System.out.println("3. insert at position");
			System.out.println("4. delete at position");
			System.out.println("5. check empty");
			System.out.println("6. get size"); 
			int choice = s.nextInt();
			switch(choice)
			{
				case 1 : System.out.println("Enter data");
					 list.insert_at_head(s.nextInt());
					 list.display();
					 break;
				case 2 : System.out.println("Enter data ");
					 list.insert_at_end(s.nextInt());
					 list.display();
					 break;
				case 3 : System.out.println("Enter data and position");
					 int x = s.nextInt();
					 int p = s.nextInt();
					 list.insert_at_position(x,p);
					 list.display();
					 break;
				case 4 : System.out.println("Enterposition");
					 list.delete_at_position(s.nextInt());
					 list.display();
					 break;
				case 5 : list.checkEmpty();
					 break;
				case 6 : int size = list.getSize();
					 System.out.println("size is : " +size);
					 break;
			}
			System.out.println("\nDo you want to continue (Type y or n) ");
			ch = s.next().charAt(0);
		}while(ch == 'Y'|| ch== 'y');
		int cn = list.countNode();
		System.out.println("count of the nodes : "+cn) ;
	}
}
