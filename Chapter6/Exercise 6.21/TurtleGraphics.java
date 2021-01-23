import java.util.Arrays;
import java.util.Scanner;

/*
 * Augusto Loose Bellinaso 
 */
public class TurtleGraphics {
	
	public static char[][] floor = new char[20][20]; //creating the floor
	public static boolean pen = false; //pen starts off the board
	public static int row = 0; //initial row position is 0
	public static int col = 0; //initial column position is 0
	public enum Directions {UP, DOWN, LEFT, RIGHT}; //directions the turtle can move 
	public static Directions direction = Directions.RIGHT; //initial direction
	
	
	//raise pen up
	public static void penUp() {
		pen = false;
	}
	//get pen down
	public static void penDown() {
		pen = true;
	}
	
	
	public static void moveForward(int distance) {
		if (pen) {
			for (int i = 0; i < distance; i++) {
				switch(direction) {
					case UP:
						if (row > 0) {
							floor[row][col] = '1';
							row--;							
						}
						break;
					case DOWN:
						if (row < 19) {
							floor[row][col] = '1';
							row++;
						}
						break;
					case LEFT:
						if (col > 0) {
							floor[row][col] = '1';
							col--;
						}
						break;
					case RIGHT:
						if (col < 19) {
							floor[row][col] = '1';
							col++;
						}
						break;				
				}
			}
			
		} else {
			for (int i = 0; i < distance; i++) {
				switch(direction) {
					case UP:
						if (row > 0) {							
							row--;							
						}
						break;
					case DOWN:
						if (row < 19) {						
							row++;
						}
						break;
					case LEFT:
						if (col > 0) {							
							col--;
						}
						break;
					case RIGHT:
						if (col < 19) {						
							col++;
						}
						break;				
				}
			}
		}

		
	}
	
	public static void turnRight() {
		switch(direction) {
			case UP:
				direction = Directions.RIGHT;
				break;
			case DOWN:
				direction = Directions.LEFT;
				break;
			case LEFT:
				direction = Directions.UP;
				break;
			case RIGHT:
				direction = Directions.DOWN;
				break;
		}

	}
	
	public static void turnLeft() {
		switch(direction) {
		case UP:
			direction = Directions.LEFT;
			break;
		case DOWN:
			direction = Directions.RIGHT;
			break;
		case LEFT:
			direction = Directions.DOWN;
			break;
		case RIGHT:
			direction = Directions.UP;
			break;
	}


	}
	
	public static void printBoard() {
		
		for (int i = 0; i < floor.length; i++) {
			for (int j = 0; j < floor[i].length; j++) {
				if (floor[i][j] == '1') {
					floor[i][j] = '#';
					System.out.print(floor[i][j] + " ");
				} else if (floor[i][j] == '0') {
					floor[i][j] = ' ';
					System.out.print(floor[i][j] + " ");
				}
				
			}
			System.out.println();
		}
	}

	
	
	
	public static void main(String[] args) {		
		//initialize the elements of the array to 0.
		for (char[] row : floor) {
			Arrays.fill(row, '0');
		}	
		
		Scanner input = new Scanner(System.in);
		int command = 0; //to read the command input by user
		int distance; //the distance that the turtle will walk
		
		//displaying options
		System.out.print("Command list:\n"
				+ "1 - Pen up\n"
				+ "2 - Pen down\n"
				+ "3 - Turn right\n"
				+ "4 - Turn left\n"
				+ "5 - Move forward\n"
				+ "6 - Display board\n"
				+ "9 - Exit\n");
		
		//loop of the program
		while (command != 9) {
			System.out.print("Enter command option: ");
			command = input.nextInt();
			
			switch(command) {
				case 1:
					penUp();
					break;
				case 2:
					penDown();
					break;
				case 3:
					turnRight();
					break;
				case 4:
					turnLeft();
					break;
				case 5:
					System.out.print("Enter distance: ");
					distance = input.nextInt();
					moveForward(distance);
					break;
				case 6:
					printBoard();
					break;
			}
		}		
	}
	

}
