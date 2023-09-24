import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIntro {

	public static void main(String[] args) {
		/*ArrayList<Integer> a=new ArrayList(2);
		a.add(5);
		a.add(6);
		a.add(8);
		System.out.println(a.size());
		System.out.println(a);
		a.add(1, 9);
		System.out.println(a);
		a.remove(2);
		System.out.println(a);
		a.clear();
		System.out.println(a);*/
		
		Student s1=new Student(51619,"Faraz");
		Student s2=new Student(48713,"Qadir");
		
		ArrayList<Student> arn=new ArrayList();
		arn.add(s1);
		arn.add(s2);
		
		Iterator it=arn.iterator();
		
		while(it.hasNext())
		{
			Student std=(Student) it.next();
			System.out.println("Regno: " + std.regno);
			System.out.println("Name: " + std.name);
		}
		
		
		
		
		
		
		
		
		

	}

}
