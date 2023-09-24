import java.util.Scanner;
import java.util.Stack;

public class StackOverview {

	public static void main(String[] args) {
	Stack s =new Stack();
	Scanner input=new Scanner(System.in);
	System.out.println("How many elements you want to add");
	int size=input.nextInt();
	if(s.isEmpty())
	{
		for (int i = 0; i < size; i++) {
			s.push(i);
		}
	}
	
	System.out.println(s);
	System.out.println(s.peek());
	
	for (int i = 0; i < size; i++) {
		s.pop();
	}
	System.out.println();
	

	
	}

	}


