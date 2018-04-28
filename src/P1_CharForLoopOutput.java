/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 Your expected results after the input is provided:
 
 1.e, f, g
 2.n, o, p, q, r, s
 3. z
 4. q, r
  
 */
public class P1_CharForLoopOutput {

	public static void main(String[] args) {
		// put your call to printRange below here
		printRange('e', 'g');
		printRange('n', 's');
		printRange('z', 'a');
		printRange('q', 'r');
	}
	
	public static void printRange(char startLetter, char endLetter ) {
		for( char letter = startLetter; letter <= endLetter; letter++ ) {
			System.out.print( letter );
			
		}
		
		System.out.println();
	}

}
