import java.util.ArrayList;
import java.util.List;
class ListCol {
	
	public static void main(String [] args) {
		List<String> list = new ArrayList<>();

		list.add("Aditya");
		list.add("bbb");
		
		// add with index
		list.add(0, " java");
		System.out.println(list);

		// set method
		list.set(0, "Python");
		System.out.println(list);
		

		// size()
		System.out.println("Size "+ list.size());
		System.out.println(list.get(0));
		
		System.out.println(list);
		// remove method
		list.remove("bbb");
		
		System.out.println(list);
	}
}