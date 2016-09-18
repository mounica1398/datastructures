class DoublyList
{
	public Dnode head;
	public int size;
	public int countnode = 0;
	public DoublyList()
	{
		head = null;
	}
	public int getSize()
	{
		int count = 0;		
		Dnode tmp = head;
		while(tmp.next != null)
		{
			count++;
			tmp = tmp.next;
		}
		return count+1;
	}	
	public void insert_at_head(int x)
	{
		Dnode n = new Dnode(x,null,null);
		countNode();
		if(head == null)
			head = n;
		else
		{
			n.next = head;
			head.prev = n;
			head = n;
		}
	}
	public void insert_at_end(int x)
	{
		Dnode n = new Dnode(x,null,null);
		countNode();
		Dnode tmp = head;
		if(head == null)
			head = n;
		else
		{
			while(tmp.next != null)
				tmp = tmp.next;
			tmp.next = n;
			n.prev = tmp;
		}
	}
	public void insert_at_position(int x , int pos)
	{
		Dnode n = new Dnode(x,null,null);
		countNode();
		Dnode tmp = head;
		if(pos == 0)
			insert_at_head(x);
		else if(pos == getSize()+1 || pos == getSize())
			insert_at_end(x);
		else
		{
			int i = 1;
			while(i != pos)
			{
				tmp = tmp.next;
				i++;
			}
			n.next = tmp.next;
			tmp.next.prev = n;
			tmp.next = n;
			n.prev = tmp;
		}
		
	}
	public void delete_at_position(int pos)
	{
		Dnode tmp = head;
		Dnode pretmp = tmp;
		if(pos == 1)
			head = head.next;
		else if(pos == getSize())
			delete_at_end();
		else
		{
			int i =1;
			while(i != pos)
			{
				pretmp = tmp;
				tmp = tmp.next;
				i++;
			}
			tmp.next.prev = pretmp;
			pretmp.next = tmp.next;
		}
	}
	public void delete_at_end()
	{
		Dnode tmp = head;
		while(tmp.next.next != null)
			tmp = tmp.next;
		tmp.next = null;
	}
	public void checkEmpty()
	{
		if(head == null)
			System.out.println("list is empty");
		else
			System.out.println("not empty");
	}
	public void display_forward()
	{
		System.out.println("Singly linked list = ");
		Dnode tmp = head;
		while(tmp.next != null)
		{
			System.out.println(tmp.data);
			tmp = tmp.next;
		}
		System.out.println(tmp.data);
	}
	public void display_backward()
	{
		System.out.println("Singly linked list = ");
		Dnode tmp = head;
		while(tmp.next != null)
		{
			tmp = tmp.next;
		}
		while(tmp.prev != null)
		{
			System.out.println(tmp.data);
			tmp = tmp.prev;
		}
		System.out.println(tmp.data);
	}
	public int countNode()
	{
		return countnode++;
	}
					
		
}
		
		
	
				
