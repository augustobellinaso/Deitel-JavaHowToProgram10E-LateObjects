/*A right triangle can have sides whose lengths are all integers. The set
of three integer values for the lengths of the sides of a right triangle is called a Pythagorean triple.
The lengths of the three sides must satisfy the relationship that the sum of the squares of two of the
sides is equal to the square of the hypotenuse. Write an application that displays a table of the
Pythagorean triples for side1 , side2 and the hypotenuse , all no larger than 500. Use a triple-nested
for loop that tries all possibilities. This method is an example of “brute-force” computing. You’ll
learn in more advanced computer science courses that for many interesting problems there’s no
known algorithmic approach other than using sheer brute force.*/

/*
 * Augusto Loose Bellinaso
 */

public class PythagoreanTriples {
	
	public static void main(String[] args) {
		
		//variables
		int side1; //first side of the triangle
		int side2; //second side of the triangle
		int hypotenuse; //hypotenuse of the triangle
		int largestValue = 500; //the largest value that we will have for sides
		
		//displaying header
		System.out.println("Pythagorean Triples");
		System.out.printf("%s\t%s\t%s%n", "Side1", "Side2", "Hypotenuse");
		
		for (side1 = 1; side1 <= largestValue; side1++) {
			
			for (side2 = 1; side2 <= largestValue; side2++) {
				
				for (hypotenuse = 1; hypotenuse <= largestValue; hypotenuse++) {
					
					if ((side1 * side1 + side2 * side2 == hypotenuse * hypotenuse) && (side1 < side2)) {
						System.out.printf("%d\t%d\t%d%n", side1, side2, hypotenuse);
					}
					
				}
			}
		}
	}

}
