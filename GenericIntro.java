
public class GenericIntro<T> {
	
	private T x;
	
	public void set(T value)
	{
		x=value;
	}
	
	public T get()
	{
		return x;
	}
	
	public static void main(String arg[] )
	{
		GenericIntro<Integer> g=new GenericIntro();
		g.set(5);
		System.out.println(g.get());
		
		GenericIntro<String> g1=new GenericIntro();
		g1.set("Sana");
		System.out.println(g1.get());
		
		GenericIntro g2=new GenericIntro();
		g2.set("Ali");
		System.out.println(g2.get());
		g2.set(4);
		System.out.println(g2.get());
	
		
	}

}
