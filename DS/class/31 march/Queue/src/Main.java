
public class Main {

	public static void main(String[] args) {
		
		Queue q1 = new Queue();
		
		q1.insert(20);
		q1.insert(200);
		q1.insert(2000);
		q1.remove();

		Queue q2 = new Queue(34);
		
		q2.insert(70000);
		q2.remove();
		q2.insert(900);
		q2.insert(40000);
		
		Queue q3 = q2.concat(q1);
		
		System.out.println(q3);
		
	}
}

