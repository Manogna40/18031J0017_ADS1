import java.util.Arrays;
import java.util.Scanner;

public class Noofpairs {

	public static void main(String[] args) {
		int[] a = null;
		Scanner s= new Scanner(System.in);
		System.out.println("enter no of elements:");
		int n=s.nextInt();
		for(int i = 0;i<n;i++)
		{
			System.out.println("enter "+(i+1)+" element");
			a[i]=s.nextInt();
		}
	Arrays.sort(a);
	int count=0;
	for(int i = 0;i<n-1;i++)
	{count=0;
		if(a[i]==a[i+1])
		{
			count++;
		}
	}
	System.out.println(" no of pairs of numvers is "+count);
	}
}