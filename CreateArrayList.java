
public class CreateArrayList<T> {
	
	T data[];
	int size;
	
	CreateArrayList()
	{
		this(1);
	}
	
	CreateArrayList(int inicap) {
		if(inicap>0)
			data=(T[]) new Object[inicap];
		else if(inicap==0)
			data=(T[]) new Object[0];
		else
			throw new IllegalArgumentException("Capacity cannot be negative");		
	}
	
	public void add(T value)
	{
		ensureCapacity();
		data[size]=value;
		size++;
	}

	public void ensureCapacity() {
		if(data.length<=size)
		{
			int oldcap=data.length;
			int newcap=oldcap+1;
			
			T temp[];
			temp=(T[]) new Object[newcap];
			for (int i = 0; i < data.length; i++) {
				temp[i]=data[i];
			}
			data=temp;
		}	
	}
	public void add(int index,T element)
	{
		if(index>size || index<0)
			throw new ArrayIndexOutOfBoundsException();
		
		ensureCapacity();
		for (int i = size-1; i >=index; i--) {
			data[i+1]=data[i];
		}
		data[index]=element;
		size++;
	}
	
	public T get(int index)
	{
		if(index>size || index<0)
			throw new ArrayIndexOutOfBoundsException();
		
		return data[index];
	}
	
	public void remove(int index)
	{
		if(index>size || index<0)
			throw new ArrayIndexOutOfBoundsException();
		
		for (int i = index; i < data.length-1; i++) {
			data[i]=data[i+1];
		}
		size--;
		T temp[];
		temp=(T[]) new Object[size];
		for (int i = 0; i < temp.length; i++) {
			temp[i]=data[i];
		}
		data=temp;
	}
	
	public int indexof(T element)
	{
		for (int i = 0; i < data.length; i++) {
			if(data[i]==element)
			{
				return i;
			}
		}
		return -1;
	}
	
	public boolean contains(T value)
	{
		if(indexof(value)!=-1)
		return true;
		else
		return false;
	}
	
	
	public String toString()
	{
		for (int i = 0; i < data.length; i++) {
			 System.out.print(data[i]+"\t");
		}
		System.out.println();
		return "";
	}
	
	public static void main(String[] args) {
		CreateArrayList<Integer> c=new CreateArrayList();
		c.add(5);
		c.add(2);
		c.add(6);
		c.add(9);
		System.out.println(c);
		/*c.add(2, 7);
		System.out.println(c);
		c.remove(2);
		System.out.println(c);*/
		System.out.println(c.indexof(7));
		
	}
}
