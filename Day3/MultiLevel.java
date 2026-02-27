class MultiLevel{

	void show(){
		System.out.println("First class");
	}
}
class Parent extends MultiLevel{
	
	void parent(){
		System.out.println("Parent Class ");	
	}
}
class Child extends Parent {
	void childShow(){
		System.out.println("Hii I am Child class");
	}	
	
	public static void main(String []args){
		Child obj = new Child();
		obj.childShow();
		obj.parent();
		obj.show();
	}
}