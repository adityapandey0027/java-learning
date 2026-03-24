// throwable class is the super and parent class of all errors and expection in java.

		// Throwable = super class 

class Exception {
	public static void main(String [] args){
		try{
			int a = 10;
			int b = 0;
			int c =  a/ b;

			System.out.println(c);
		} catch( ArithmeticException e ){
			e.printStackTrace();
			System.out.println("------");

			System.out.println(e.toString());
			System.out.println("------");

			System.out.println(e.getMessage());

			System.out.println(" can't devide by zero" );
		}
		
	}	
}