package test;

public class RecursionIntro {

	public int fibonacci(int loc)
	{
		if(loc<1)
		{
			throw new IllegalArgumentException("Not possible");
		}
		else if(loc==1 || loc== 2)
		{
			return 1;
		}
		 return fibonacci(loc-1) + fibonacci(loc-2);
	}
	
	public static void main(String[] args) {
		RecursionIntro r= new RecursionIntro();
		for (int i = 1; i <= 7; i++) {
			System.out.print(r.fibonacci(i)+ "\t");
		}
		

	}

}
