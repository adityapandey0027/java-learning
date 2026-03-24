class OverRiding {
	public void sound(){
		System.out.println("Parent class ");
	}	
}

class Child extends OverRiding{
	pulbic void sound(){
		System.out.println("Child class");
	}
	public static void main(String [] args){
		OverRiding obj = new Child();
		obj.sound();
	}
}
