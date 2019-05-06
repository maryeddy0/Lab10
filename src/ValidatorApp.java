import java.util.Scanner;

public class ValidatorApp {

	public static void main(String[] args) {

		String goAgain = "y";
		int radius = 0;
	
		Validator circle = new Validator();
		System.out.println(circle);
		
while (goAgain.equalsIgnoreCase("y")){		
	
		System.out.println("WELCOME TO THE CIRCLE TESTER");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a radius");
		radius = scan.nextInt();

		Double circ  = circle.getCirc(radius);
		System.out.println("Circumference: " + circ);
	
		double area = circle.getArea(radius);
		System.out.println("Area: "+ area);
		
		System.out.println("Continue? y/n");
		goAgain = scan.next();
		
}	System.out.println("Goodbye");
	}

}
