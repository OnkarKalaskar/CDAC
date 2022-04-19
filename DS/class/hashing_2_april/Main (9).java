
public class Main {

	public static void main(String[] args) {
		
		Hashing hash = new Hashing(7);
		
		hash.insertQ("Shrinivas");
		hash.insertQ("Pooja");
		hash.insertQ("Shrinivas");
		
		hash.removeQ("Shrinivas");
		hash.removeQ("Shrinivas");
		
		
	}
	
}
