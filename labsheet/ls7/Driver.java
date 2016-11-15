import java.io.*;
import java.util.Scanner;
public class Driver
{
	public static void main( String [] args)
	{	
		Scanner s = new Scanner(System.in);
		BST b = new BST();
		char ch;
		System.out.println("Binary Search Tree");
		b.root = b.insert_node(b.root,10);
		b.root = b.insert_node(b.root,50);
		b.root = b.insert_node(b.root,75);
		b.root = b.insert_node(b.root,3);
		b.root = b.insert_node(b.root,25);
		b.root = b.insert_node(b.root,20);
		b.root = b.insert_node(b.root,70);
		b.root = b.insert_node(b.root,40);
		b.root = b.insert_node(b.root,15);
		b.root = b.insert_node(b.root,8);
		System.out.println("Inorder Traversal");
		b.inorder(b.root);
		System.out.println();
		System.out.println("Preorder Traversal");
		b.preorder(b.root);
		System.out.println();
		System.out.println("Postorder Traversal");
		b.postorder(b.root);
		System.out.println();
		do
		{
			System.out.println("Enter the element to search");
			b.Search(b.root,s.nextInt());
			System.out.println("\nDo you want to continue search operation(Type y or n) ");
			ch = s.next().charAt(0);
		}while(ch == 'Y'|| ch == 'y');
		do
		{
			System.out.println("Enter the element to be delete");
			b.root = b.Deletion(b.root,s.nextInt());
			b.inorder(b.root);
			System.out.println("\nDo you want to continue delete operation(Type y or n) ");
			ch = s.next().charAt(0);
		}while(ch == 'Y'|| ch == 'y');
	}
}

