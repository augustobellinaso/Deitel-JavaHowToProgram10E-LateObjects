/*Write an application that tests whether the examples of the Math class method calls shown
in Fig. 5.2 actually produce the indicated results.*/

/*
 * Augusto Loose Bellinaso
 */
public class MathTest {
	
	public static void main(String[] args) {
		
		//Math.abs()
		System.out.printf("Math.abs(23.7) = %f%n", Math.abs(23.7));
		System.out.printf("Math.abs(0.0) = %f%n", Math.abs(0.0));
		System.out.printf("Math.abs(-23.7) = %f%n", Math.abs(-23.7));
		//Math.ceil()
		System.out.printf("Math.ceil(9.2) = %f%n", Math.ceil(9.2));
		System.out.printf("Math.ceil(-9.8) = %f%n", Math.ceil(-9.8));
		//Math.cos()
		System.out.printf("Math.cos(0.0) = %f%n", Math.cos(0.0));
		//Math.exp()
		System.out.printf("Math.exp(1.0) = %f%n", Math.exp(1.0));
		System.out.printf("Math.exp(2.0) = %f%n", Math.exp(2.0));
		//Math.floor()
		System.out.printf("Math.floor(9.2) = %f%n", Math.floor(9.2));
		System.out.printf("Math.floor(-9.8) = %f%n", Math.floor(-9.8));
		//math.log()
		System.out.printf("Math.log(Math.E) = %f%n", Math.log(Math.E));
		System.out.printf("Math.log(Math.E * Math.E) = %f%n", Math.log(Math.E * Math.E));
		//Math.max(x,y)
		System.out.printf("Math.max(2.3, 12.7) = %f%n", Math.max(2.3, 12.7));
		System.out.printf("Math.max(-2.3, -12.7) = %f%n", Math.max(-2.3, -12.7));
		//Math.min(x,y)
		System.out.printf("Math.min(2.3, 12.7) = %f%n", Math.min(2.3, 12.7));
		System.out.printf("Math.min(-2.3, -12.7) = %f%n", Math.min(-2.3, -12.7));
		//Math.pow(x,y)
		System.out.printf("Math.pow(2.0, 7.0) = %f%n", Math.pow(2.0, 7.0));
		System.out.printf("Math.pow(9.0, 0.5) = %f%n", Math.pow(9.0, 0.5));
		//Math.sin()
		System.out.printf("Math.sin(0.0) = %f%n", Math.sin(0.0));
		//Math.sqrt()
		System.out.printf("Math.sqrt(900.0) = %f%n", Math.sqrt(900.0));
		//Math.tan()
		System.out.printf("Math.tan(0.0) = %f%n", Math.tan(0.0));
		
	}

}
