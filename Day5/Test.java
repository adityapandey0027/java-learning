public class Test {
	public static void main(String [] args){
		try{
				int [] arr = new int[5];
				arr[10] = 20;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index out of bound "+ e.getMessage());
		} 

		try{
				int a = 6;
				int b = 0;
				int c = a/b;
			} catch(ArithmeticException e) {
				System.out.println("Arithmectic Exception " + e.getMessage());
			} 
	} 
} 