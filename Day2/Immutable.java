
final class Immutable {
	final private int rollNumber;
	final private String  fullName;

	Immutable(int r, String n){
		this.rollNumber = r;
		this.fullName = n;
	}
	
	// Getter method
	public  int getRoll(){
		return  this.rollNumber;
	}
	
	public String getName (){
		return this.fullName;
	}
	

	public static void main(String [] args){
		Immutable obj = new Immutable(12345, "Aditya");
		
		System.out.println(obj.getRoll());
		System.out.println(obj.getName());
	}
}
	
	