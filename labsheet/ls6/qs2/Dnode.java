import java.util.Scanner;
class Dnode
{
	public int data;
	public Dnode prev;
	public Dnode next;
	public Dnode()
	{
		prev = null;
		next = null;
		data = 0;
	}
	public Dnode(int d , Dnode n1, Dnode n2)
	{
		data = d;
		prev = n1;
		next = n2;
	}
}
