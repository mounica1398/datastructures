import java.util.Scanner;
public class Driver
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		linkedList list = new linkedList();
		System.out.println("Insert in sorted order Test"); 
		char ch;
		do
		{
			System.out.println("Enter data ");
			list.insert_in_sorted(s.nextInt());
			System.out.println("List in sorted insertion");
			list.display();
			System.out.println("\nDo you want to continue (Type y or n) ");
			ch = s.next().charAt(0);
		}while(ch == 'Y'|| ch== 'y');
		//int cn = list.countNode();
		//System.out.println("count of the nodes : "+cn) ;
	}
}
