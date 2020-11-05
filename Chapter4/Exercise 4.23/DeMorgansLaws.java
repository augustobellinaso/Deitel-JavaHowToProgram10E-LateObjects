/*In this chapter, we discussed the logical operators && , & , || , | , ^ and ! .
De Morgan’s laws can sometimes make it more convenient for us to express a logical expression.
These laws state that the expression !( condition1 && condition2 ) is logically equivalent to the expres-
sion (! condition1 || ! condition2 ) . Also, the expression !( condition1 || condition2 ) is logically
equivalent to the expression (! condition1 && ! condition2 ) . Use De Morgan’s laws to write equivalent
expressions for each of the following, then write an application to show that both the original ex-
pression and the new expression in each case produce the same value:
a) !(x < 5) && !(y >= 7)
b) !(a == b) || !(g != 5)
c) !((x <= 8) && (y > 4))
d) !((i > 4) || (j <= 6))*/

/*
 * Augusto Loose Bellinaso
 */

public class DeMorgansLaws {
	
	
	public static void main(String[] args) {
		
		//initializing all variables to have the same value
		int x = 4;
		int y = 4;
		int a = 4;
		int b = 4;
		int g = 4;
		int i = 4;
		int j = 4;
		
		//displaying header for exercise A
		System.out.println("Exercise A");
		System.out.printf("%s\t%s%n", "Original Expression", "DeMorgan's law");
		System.out.printf("%s\t%s%n", "!(x < 5) && !(y >= 7)", "!((x < 5) || (y >= 7))");
		System.out.printf("%b\t\t\t%b%n", !(x < 5) && !(y >= 7), !((x < 5) || (y >= 7)) );
		System.out.println();
		
		//displaying header for exercise B
		System.out.println("Exercise B");
		System.out.printf("%s\t%s%n", "Original Expression", "DeMorgan's law");
		System.out.printf("%s\t%s%n", "!(a == b) || !(g != 5)", "!(!(a == b) && !(g != 5))");
		System.out.printf("%b\t\t\t%b%n", !(a == b) || !(g != 5), !((a == b) && (g != 5)) );
		System.out.println();
		
		//displaying for exercise C
		System.out.println("Exercise C");
		System.out.printf("%s\t%s%n", "Original Expression", "DeMorgan's law");
		System.out.printf("%s\t%s%n", "!((x <= 8) && (y > 4))", "!(x <= 8) || !(y > 4)");
		System.out.printf("%b\t\t\t%b%n", !((x <= 8) && (y > 4)), !(x <= 8) || !(y > 4));
		System.out.println();
		
		//displaying for exercise D
		System.out.println("Exercise D");
		System.out.printf("%s\t%s%n", "Original Expression", "DeMorgan's law");
		System.out.printf("%s\t%s%n", "!((i > 4) || (j <= 6))", "!(i > 4) && !(j <= 6)");
		System.out.printf("%b\t\t\t%b%n", !((i > 4) || (j <= 6)), !(i > 4) && !(j <= 6));
		System.out.println();
		
		
		
	}

}
