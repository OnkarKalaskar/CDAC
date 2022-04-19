
public class Student {
	
	String name;
	int age;
	char gender;
	
	Student(String n, int a, char g) {
		name = n;
		age = a;
		gender = g;
	}

	public String toString() {
		//Shrinivas,34,M
		String str = name + ":" + age + ":" + gender;
		return str;
	}
}
