import java.util.*;
class Test2{
	public static void main(String [] args){
		//try{
		//	Object s = "Hello";

          // 	 Integer num = (Integer) s;
		
		//} catch(ClassCastException e){
		//	System.out.println("exception "+e.getMessage());
		//}

		try{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a number : ");
			int a = sc.nextInt();
			
			System.out.println("value is : " +a);
		} catch(InputMismatchException e){
			System.out.println("Only number allowed ");
		}
	}
}