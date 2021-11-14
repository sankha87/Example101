package pac;

class Student{}
class Customer{}

public class Array101 {

	public static void main(String[] args) {
		
		Student[] s = new Student[10000];
		s[0] = new Student();
	//	s[1] = new Customer();	// wrong
		
		Object[] a = new Object[10000];
		a[0] = new Student();
		a[1] = new Customer();
		
	}

}
