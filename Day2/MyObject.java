package Day2;

public class MyObject {
	int age;
	String name;

	MyObject() {
		name = "ADITYA";
		age = 19;
	}

	public void print() {
		System.out.println("Name " + this.name + " Age " + this.age);
	}

	public static void main(String[] args) {
		System.out.println("Hello");
		MyObject obj = new MyObject();
		obj.print();
	}
}

// Geter and seter are said to be the muttator