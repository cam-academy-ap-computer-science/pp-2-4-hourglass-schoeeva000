/*
*	**PSUDOCODE FOR HOURGLASS**
*
*constant should be changing the number of lines in the hourglass, LINES
*
*	IN MAIN:
*print a line for the top
*print the top half
*	print middle along with it
*print the bottom half
*print a line for the bottom (same function as top)
*
*	IN LINE FOR TOP/BOTTOM:
*print a | symbol
*subtract 2 from LINES
*use a for loop to print quotes LINE - 2 times
*
*	IN PRINT TOP HALF:
*linesForHalf = (LINES / 2) - 1 to get the number of lines for the top half
*for loop(i = linesForHalf, i >= 0, i--)
*	print spaces for loop(j = 1, j <= linesForHalf, j++)
*		print a space
*	print a \
*	print "meat" for loop(k = linesForHalf - 2, k >= 0, k-=2)
*		print :
*	print a /
*
*IN PRINT BOTTOM HALF
*	print spaces for loop(j = linesForHalf, j >= 0, j--)
*		print a space
*	print a /
*	print "meat" for loop(k = 2, k >= linesForHalf - 2, k+=2)
*		print :
*	print a \
*
*print a bottom line
*
*
*
*
*/

public class Hourglass {
	
	public static final int LINES = 100; // Change this constant to change the height of the hourglass.
	
	public static void main(String[] args) {
		line();
		topMeat();
	}
	
	public static void line() { //prints the line that goes at the top and bottom of the hourglass
		System.out.print("|");
		for(int i = LINES - 2; i >= 1; i--) {
			System.out.print("\"");
		}
		System.out.println("|");
	}
	
	public static void topMeat() {
		int linesForHalf = (LINES / 2) - 1;
		for(int i = 1; i <= linesForHalf; i++) { //this is for the whole top half
			for(int j = 1; j <= i; j++) { //start with 1 space, and than move up based on what i is
				System.out.print(" ");
			}
			System.out.print("\\"); //print a forward slash to begin the side of the hourglass
			for(int k = (2 * (linesForHalf - i) - 1) * 2; k >= 0; k-=2) {
				System.out.print(":");
			}
			System.out.println("/");
			
		}
	}
}
