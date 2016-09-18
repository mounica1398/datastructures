import java.io.*;
class Estack
{
	int stack1 [] = new int[20];
	int top = -1;
	int stackSize = 20;
	void push(int ch)
	{
		if(isFull())
			System.out.println("stack is full : Overflow");

		else 
		{	
			top++;
			stack1[top] = ch;
		}
	}
	void pop()
	{
		if(isEmpty())
			System.out.println("Stack is empty : Underflow");
		else
		{
						
			stack1[top] = 0;
			top--;

		}	
	}
	boolean isEmpty()
	{
		if( top == -1 )
			return true;
		else
			return false;
	}
	boolean isFull()
	{
		if( top == 20 )
			return true;
		else
			return false;
	}
	boolean operator(char ch)
	{
		// To check whether an operator
		if(ch=='/'||ch=='*'||ch=='+'||ch=='-')
		return true;
		else
		return false;
	}
	boolean isAlpha(char ch)
	{
		// To check whether an alphabet
		//Include characters 0 t0 9
		if(ch>='a'&&ch<='z')
			return true;
		else if( ch >= '0' && ch <= '9' )
			return true;
		else
			return false;
	}
	void evaluate(String str)
	{
		char ch; 
		int op1, op2, res=0;
		int i, p = 0, a, b;
		for( i = 0; i < str.length(); i++)
		{
			ch = str.charAt(i);
			if(isAlpha(ch))
			{
				a = (int)ch - 48;
				push(a);
			}
			else if(operator(ch))
			{
				op2 = stack1[top];
				pop();
				op1 = stack1[top];
				pop();
				switch(ch)
				{
				case '+':	res = op1 + op2;
							break;
				case '-':	res = op1 - op2;
							break;		
				case '*':	res = op1 * op2;
							break;
				case '/':	res = op1 / op2;
							break;
				}
				push(res);
			}
		}
			res = stack1[top];
			System.out.println("The result is: "+res);
			
	}

}
	

