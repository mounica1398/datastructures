class linkedList
{
	public Node head;
	public int size;
	public int countnode = 0;
	public linkedList()
	{
		head = null;
	}
	public int getSize()
	{
		int count = 0;		
		Node tmp = head;
		while(tmp.next != null)
		{
			count++;
			tmp = tmp.next;
		}
		return count+1;
	}	
	public void insert_at_head(int x)
	{
		Node n = new Node(x,null);
		countNode();
		if(head == null)
			head = n;
		else
		{
			n.next = head;
			head = n;
		}
	}
	public void insert_at_end(int x)
	{
		Node n = new Node(x,null);
		countNode();
		Node tmp = head;
		if(head == null)
			head = n;
		else
		{
			while(tmp.next != null)
				tmp = tmp.next;
			tmp.next = n;
		}
	}
	public void insert_at_position(int x , int pos)
	{
		Node n = new Node(x,null);
		countNode();
		Node tmp = head;
		if(pos == 0)
			insert_at_head(x);
		else if(pos == getSize()+1)
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
			tmp.next = n;
		}
		
	}
	public void delete_at_position(int pos)
	{
		Node tmp = head;
		Node prev = tmp;
		if(pos == 1)
			head = head.next;
		else
		{
			int i =1;
			while(i != pos)
			{
				prev = tmp;
				tmp = tmp.next;
				i++;
			}
			prev.next = tmp.next;
		}
	}
	public void checkEmpty()
	{
		if(head == null)
			System.out.println("list is empty");
		else
			System.out.println("not empty");
	}
	public void display()
	{
		System.out.println("Singly linked list = ");
		Node tmp = head;
		while(tmp.next != null)
		{
			System.out.println(tmp.data);
			tmp = tmp.next;
		}
		System.out.println(tmp.data);
	}
	public int countNode()
	{
		return countnode++;
	}
	public void insert_in_sorted(int x)
	{
		Node n = new Node(x,null);
		Node tmp = head;
		if(head == null)
			head = n;
		else if(head.next == null)
		{
			if(n.data < tmp.data)
			{
				n.next = tmp;
				head = n;
			}
			else
				tmp.next = n;
		}	
		else 
		{
			while(tmp.next!=null)
			{
				if( (n.data < tmp.data)&&(tmp == head) )
					insert_at_head(x);
				else if( (n.data > tmp.data)&&(n.data < tmp.next.data) )
				{
					n.next = tmp.next;
					tmp.next = n;
				}
				tmp = tmp.next;
			}
			if( (tmp.next == null) && (n.data >tmp.data) )
				tmp.next = n;
				
		}	
	}
					
		
}
		
		
	
				
