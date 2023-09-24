import java.util.Scanner;

public class ArrayIntro {
	int arr[];
	int arr1[];
	int size;
	
	public int[] store(int x[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter array size");
		size=input.nextInt();
		x=new int[size];
		System.out.println("Enter array values");
		for (int i = 0; i < x.length; i++) {
			x[i]=input.nextInt();
		}
		
		return x;
		
	}
	
	
	public void display(int y[])
	{
		System.out.println("Values are:");
		for (int i = 0; i < y.length; i++) {
			System.out.print(y[i] +"\t");
		}
		System.out.println();
	}
	
	
	public void sum(int s[])
	{
		int total=0;
		for (int i = 0; i < s.length; i++) {
			total=total+s[i];
		}
		System.out.println("Sum of array values are: " + total);
	}
	
	public boolean search(int u[],int value)
	{
		boolean status=false;
		for (int i = 0; i < u.length; i++) {
			if(u[i]==value)
			{
				status=true;
			}
		}
		return status;
	}
	
	

	public static void main(String[] args) {
	/*	int  arr[]=new int[5];
		arr[0]=5;
		arr[1]=6;
		int arr1[]={2,4,6};
		int rr[];
		rr=new int[size];*/
		
		ArrayIntro t=new ArrayIntro();
		int arr2[]={7,6,4};
		int qw[]=t.store(t.arr);
		t.display(qw);
		/*int r[]=t.store(t.arr1);
		t.display(r);
		t.display(arr2);*/
		t.sum(qw);
		System.out.println(t.search(qw, 4));
		

	}

}
