
public class pgm1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("With default constructor:");
		student s1 = new student();
		System.out.println(s1.display());
		System.out.println("With param constructor:");
		student s2 = new student(10,20,30, 345);
		System.out.println(s2.display());
		System.out.println("With copy constructor:");
		student s3 = new student(s2);
		System.out.println(s3.display());
		System.out.println("With the this constructor:");
		student s4 = new student(231);
		System.out.println(s4.display());

	}

}
