package Day2;
class Oops {
    public static void main(String[] args) {
        Demo obj = new Demo();
        Demo obj1 = new Demo("Aditya");
	
	// method calling 
	obj.setDetails(12345, "Aditya Pandey");
	obj.getDetails();
	
    }
}

class Demo{
	int roll ;
	String name;
	
	public void setDetails( int r, String n){
		this.roll = r;
		this.name = n; 	
	}	
	public void getDetails(){
		System.out.println("Hii "+ this.name  + " your roll number is " + this.roll);
	}
	
    	public Demo(){
       	System.out.println("Default constructor");
    	}
    	public Demo(String name){
        	System.out.println("Parameter constructor"+ name);
    	}
}