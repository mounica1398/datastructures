class BST
{
	public Tnode root;
	public BST()
	{
		root = null;
	}
	public Tnode insert_node(Tnode Root ,int x)
	{
		if(Root == null)
			Root = new Tnode(x,null,null);
		else if( x < Root.data )
			Root.left = insert_node(Root.left,x);
		else if( x > Root.data )
			Root.right = insert_node(Root.right,x);
		return Root;
	}
	public void inorder(Tnode v)
	{
		if(v == null)
			return ;
		else
		{
			inorder(v.left);
			System.out.print(v.data + ",");
			inorder(v.right);
		}
	}
	public void preorder(Tnode v)
	{
		if(v == null)
			return ;
		else
		{
			System.out.print(v.data + ",");
			preorder(v.left);
			preorder(v.right);
		}
	}
	public void postorder(Tnode v)
	{
		if(v == null)
			return ;
		else
		{
			postorder(v.left);
			postorder(v.right);
			System.out.print(v.data + ",");
		}
	}
	public void Search(Tnode root, int key)
	{
		Tnode tmp = root;
		if(key == tmp.data)
		{
			System.out.println("key is found");
		}
		else
		{
			if(key < tmp.data)
			{
				if(tmp.left == null)
					System.out.println("key not found");
				else
					Search(tmp.left,key);
			}
			else if(key > tmp.data)
			{
				if(tmp.right == null)
					System.out.println("key not found");
				else
					Search(tmp.right,key);
			}
		}
	}
	public Tnode Deletion(Tnode root1, int val)
	{
		if(root1 == null)
			return root1;
		else if( val < root1.data)
			root1.left = Deletion(root1.left,val);
		else if( val > root1.data)
			root1.right = Deletion(root1.right,val);
		else
		{
			if(root1.left == null)
				return root1.right;
			else if(root1.right == null)
				return root1.left;
			root1.data = Succesor(root1.right);
			root1.right = Deletion(root1.right,root1.data);
		}  
		return root1;
	}
	public int Succesor(Tnode root2)
	{
		while(root2.left != null)
			root2 = root2.left;
		return root2.data;
	}
//	public void maxNum
			

}	

	

