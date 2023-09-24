
public class queueimp {
	int front,rear,count;
	int size=4;
	int queue[]=new int[size];
	
	queueimp()
	{
		front=0;
		rear=0;
		count=0;
		
		for (int i = 0; i < queue.length; i++) {
			queue[i]=0;
		}
	}
	
	public boolean isEmpty()
	{
		if(count==0)
		{
			return true;
		}
		return false;
	}
	
	public boolean isFull()
	{
		if(count==size)
		{
			return true;
		}
		return false;
	}
	
	public int enqueue(int value)
	{
		if(isFull())
		{
			System.out.println("Queue is full");
			return -1;
		}
		else
		{
			queue[rear]=value;
			count++;
			rear++;
			return 1;
		}
		
	}
	
	public int dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty");
			return -1;
		}
		else
		{
			int temp=queue[front];
			count--;
			for (int i = 0; i < queue.length-1; i++) {
				queue[i]=queue[i+1];
			}
			queue[--rear]=0;
			return temp; 
		}
	}
	
	public String toString()
	{
		if(count>0)
		{
			System.out.println("values in queue are:");
			 for (int i = 0; i < queue.length; i++) {
				System.out.print(queue[i] + "\t");
			}
			 System.out.println();
		}
		return "";
	}

	public static void main(String[] args) {
		queueimp q=new queueimp();
		q.enqueue(5);
		q.enqueue(9);
		q.enqueue(3);
		System.out.println(q);
		System.out.println(q.dequeue());
		System.out.println(q);

	}

}
