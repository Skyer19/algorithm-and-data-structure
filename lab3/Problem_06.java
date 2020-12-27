package lab3;
/*
 * Input two  integer numbers m and n.
 * Output m^n.
 * And you need to output your Big O.
 */
public class Problem_06 {
	public static void main(String[] args) {
		int m = 3;
		int n = 4;
		
		int mul = 1; //mul is the variable of m^n
		
		//calculate m^n
		for(int i = 1; i <= n; i++) {
			mul *= m;
		}
		
		System.out.println(mul);
		System.out.println("Big O is "+"O("+n+")");
	}
}
