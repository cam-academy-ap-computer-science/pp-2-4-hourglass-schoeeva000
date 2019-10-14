// Evan Schoening

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
										// Only goes up by 2, on the even numbers.
										// it does this because if it went up on odd, the hourglass would not look like it 
										// was intended to, and also would require an if statement
	
										// Don't worry, it still works!! :)
	public static void main(String[] args) {
		line();
		topMeat();
		bottomMeat();
		line();			//simple enough...
	}
	
	public static void line() { //prints the line that goes at the top and bottom of the hourglass
		int oddNumber = LINES % 2; //if LINES is odd, it makes oddNumber = 1 (see next comment)
		
		System.out.print("|");
		for(int i = LINES - 1; i >= oddNumber; i--) { //basically makes the number of "s odd all the time, to fit with the rest of the hourglass
			System.out.print("\"");
		}
		System.out.println("|");
	}
	
	public static void topMeat() {
		int linesForHalf = (LINES / 2) - 1;
		//int extraColin = linesForHalf % 2;
		
		for(int i = 1; i <= linesForHalf; i++) { //this is for the whole top half
			for(int j = 1; j <= i; j++) { //start with 1 space, and than move up based on what i is
				System.out.print(" ");
			}
			System.out.print("\\"); //print a forward slash to begin the side of the hourglass
			for(int k = (2*(linesForHalf-i + 1))*2; k >= 1; k-=2) { //I don't have the brain big enough to track what's going on here, but it works!!
																//I did a lot of trial and error work with this
				System.out.print(":");
			}
			System.out.println("/"); // end each line with the / side of the hourglass
			
		}
		for (int i = 1; i <= linesForHalf + 1; i++) { // this for loop prints spaces for the middle section after printing the meat
			System.out.print(" ");
		}
		System.out.println("||"); // prints the middle section
	}
	
	public static void bottomMeat() { // 
		int linesForHalf = (LINES / 2) - 1;
	//	int extraColin = linesForHalf % 2;
		
		for(int i = 1; i <= linesForHalf; i++) {
			for(int j = linesForHalf - i; j >= 0; j--) {
				System.out.print(" ");
			}
			System.out.print("/");
			for(int k = 0; k <= ((i * 2) - 1) * 2; k+=2) { //again, I don't have the grey matter nessesary to know what's going on here
														   //it works, so please don't mark me down!
				System.out.print(":");
			}
			System.out.println("\\"); //finish off each line with a \
		}
	}
}

/*
 

   _____                            _         _       _   _                 _ 
  / ____|                          | |       | |     | | (_)               | |
 | |     ___  _ __   __ _ _ __ __ _| |_ _   _| | __ _| |_ _  ___  _ __  ___| |
 | |    / _ \| '_ \ / _` | '__/ _` | __| | | | |/ _` | __| |/ _ \| '_ \/ __| |
 | |___| (_) | | | | (_| | | | (_| | |_| |_| | | (_| | |_| | (_) | | | \__ \_|
  \_____\___/|_| |_|\__, |_|  \__,_|\__|\__,_|_|\__,_|\__|_|\___/|_| |_|___(_)
                     __/ |                                                    
                    |___/                                                     

				You made it to the end of my spiderweb of a pragram!
				
			    			Try setting LINES to 1000000!
			    	I can hear my laptop fan run louder when I do it!
*/
