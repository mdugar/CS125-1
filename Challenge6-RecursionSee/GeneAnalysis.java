//UIUC CS125 FALL 2013 MP. File: GeneAnalysis.java, CS125 Project: Challenge6-RecursionSee, Version: 2013-11-05T16:10:13-0600.047294320
/**
 * @author bfu3
 *
 */
public class GeneAnalysis
{
	/** Wrapper method. Returns the length of the longest 
	 * common subsequence
	 */

	public static int score(String gene1, String gene2)
	{
		char[] charArray1 = gene1.toCharArray();
		char[] charArray2 = gene2.toCharArray();
		int i = charArray1.length-1;
		int j = charArray2.length-1;

		return score(charArray1, charArray2, i, j);
				// Hint: Use toCharArray() to convert each string to a char array.
		 // call your recursive implementation here with
		// the genes as char arrays, starting at the end of each gene.
	}

	public static int score(char[] gene1, char[] gene2, int i, int j)
	{
		if (i>=0 && j>=0) {
			int a = score(gene1, gene2, i-1, j-1);
			if (gene1[i] == gene2[j]) {
				a = a +1;
			}
			return max(score(gene1, gene2, i-1, j),
			       score(gene1, gene2, i  , j-1),
			       score(gene1, gene2, i-1, j-1),
			       a);
		}
		else return 0;
	}

	public static int max(int a, int b, int c, int d)
	{
		int one = Math.max(a,b);
		int two = Math.max(c,d);
		return Math.max(one, two);
	}


	/** Implements longest common subsequence recursive search
The recursive case is defined as
					S(i-1, j)
S(i,j) = max {		S(i,j-1)
					S(i-1,j-1)
					S(i-1,j-1) +1 if gene1[i] = gene2[j]

NB  0<=i < gene1.length
    0<=j < gene2.length

You need to figure out the base case.
	 * */
//	define a private recursive Class method 'score' that 
//	returns an integer the score.
//	The method should take four parameters- 
//	two char arrays and two integers (gene1,gene2,i,j)
//	i and j are the indices into gene1 and gene2 respectively.

}
// Use local variables to store a recursive result so that you  do not need to calculate it again.

// Do not use a loops.
