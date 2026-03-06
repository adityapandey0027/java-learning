import java.util.Scanner;
class Polymorphism {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a : ");
		double a = sc.nextDouble();

		System.out.print("Enter b : ");
		double b = sc.nextDouble();

		Calculator c = new Calculator();

		System.out.println(c.add(a, b));
		
	}
}


class Calculator{
	public int add(int a, int b){
		return a+b;
	}
	public double add(int a, double b){
		return a+b;
	}
	public double add( double a, double b){
		return a+b;
	}
	public double add(double a, int b){
	return a+b;
	}
}