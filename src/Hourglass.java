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
*
*
*
*
*
*/

public class Hourglass {

}
