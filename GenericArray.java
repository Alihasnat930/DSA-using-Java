
public class GenericArray<T> {
	
	T arr[];
	int size;
	int i=0;
	
	GenericArray(int s)
	{
		size=s;
		arr=(T[]) new Object[size];
	}
	
	public void add(T value)
	{
		if(i<size)
		{
			arr[i]=value;
			i++;
		}
	}
	
	public void display()
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		GenericArray<Integer> ga1=new GenericArray(3);
		ga1.add(4);
		ga1.add(5);
		ga1.add(6);
		ga1.display();
		
		GenericArray<String> ga2=new GenericArray(2);
		ga2.add("Ali");
		ga2.add("Sana");
		ga2.display();
		
		GenericArray ga3=new GenericArray(3);
		ga3.add("Ayeza");
		ga3.add(15);
		ga3.add(4.9f);
		ga3.display();
		
		GenericArray<Float> ga4=new GenericArray(2);
		ga4.add(4.3f);
		ga4.add(9.2f);
		ga4.display();
		
		
		

	}

}
