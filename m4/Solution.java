



import java.util.Scanner;

public class Solution {
	char[] in;
	int len;
	int top=-1;
	Solution(int n)
	{
		in=new char[n];
		this.len=n;
	}
	boolean isEmpty(int t)
	{
		return t==-1;
	}
	boolean isfull(int t)
	{
		return t==this.len;
	}
	
	public void push(char n)
	{
		if(!isfull(this.top))
		{
		in[++top]=n;
		}
		
	}
	public char pop()
	{
		if(!isEmpty(top))
		{
			return in[top--];
		}
		else
		{
			//System.out.println("Stack is empty !");
			return 0;
		}
	}
public static void main(String args[])
{Scanner s=new Scanner(System.in);String a = null;boolean boo=false;int nuu=0;String b[] = null ;int i11=0;
nuu=s.nextInt();
while(s.hasNext())
{
	
	//b=new String[nuu];
// b[i11]
	a=s.nextLine();
// i11++;


	Solution p=new Solution(a.length());


char ch;

	for(int j = 0;j<a.length();j++)
	{
		char c1=a.charAt(j);
		if(c1=='{' )
		{
			p.push(c1);
			}
		else if( c1=='(')
		{
			p.push(c1);
		}
		else if( c1=='[')
		{
			p.push(c1);
		}
		else if( c1==')')
		{
			ch=p.pop();
			if(ch=='(')
			{
				boo=true;
			}
			else
			{
				boo=false;
				
			}
		}
		else if( c1==']')
		{
			ch=p.pop();
			if(ch=='[')
			{
				boo=true;
			}
			else
			{
				boo=false;
				
			}
		}
		else if( c1=='}')
		{
			ch=p.pop();
			if(ch=='{')
			{
				boo=true;
			}
			else
			{
				boo=false;
			
			}
		}
		if(boo==false)
		{
			break;
		}
		

	
	}
	


if(boo==false)
{
	
	System.out.println("NO");
	boo=true;
}
else
{
	System.out.println("YES");

	}

	}

}

}
