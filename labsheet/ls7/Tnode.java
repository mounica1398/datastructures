
class Tnode
{
	public int data;
	public Tnode right;
	public Tnode left;
	public Tnode()
	{
		left = null;
		right = null;
		data = 0;
	}
	public Tnode(int d , Tnode n1, Tnode n2)
	{
		data = d;
		left = n1;
		right = n2;
	}
}

