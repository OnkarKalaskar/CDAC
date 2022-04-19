
public class Main {

	public static void main(String[] args) {
		
		Stack studentStack = new Stack();
		
		Student s1 = new Student("A", 10, 'F');
		Student s2 = new Student("B", 11, 'M');
		Student s3 = new Student("C", 12, 'F');
		
		studentStack.push(s2);
		studentStack.push(s1);
		studentStack.pop();
		studentStack.push(s3);
		
		Student popStudent = studentStack.pop();
		
		System.out.println(popStudent);
		
	}
	
}
