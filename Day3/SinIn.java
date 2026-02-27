class SinIn {
	
	void show(){
		System.out.println("Hello, I am Parent class ");
	}
}

class Child extends SinIn {
	void print(){
		System.out.println("Hello, Child class");
	}
  
	public static void main(String[] args){
		Child obj = new Child();
		obj.print();
		obj.show();
	}
}