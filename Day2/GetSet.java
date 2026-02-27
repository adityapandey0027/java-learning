public class GetSet{
	// Getter and setter are declared in the private function
	private int roll ;
	private String name;
	
	public void setName(String n){
		this.name = n;
	}
	public void setRoll(int r){
		this.roll = r;
	}
	
	// seter
	public int getRoll(){
		return this.roll;
	}
	public String getName(){
		return this.name;	
	}

	public static void main(String [] args){
		GetSet obj = new GetSet();
		
		obj.setName("Aditya");
		obj.setRoll(005);
		
		System.out.println(obj.getName());
		System.out.println(obj.getRoll());
	}
}
