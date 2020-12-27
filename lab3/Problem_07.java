package lab3;
/*
 * Input an  integer number n.
 * Output 2^n.
 * And you need to output your Big O.
 */
public class Problem_07 {

	public static void main(String[] args) {
		// input an integer number n
		int n = 3;

		System.out.println(binaryPow(2, n)); // calculate 2^n
		System.out.println("Big O is " + "log(" + n + ")");

	}

	// using Fast Power to calculate binary power
	public static int binaryPow(int a, int b) {
		if (b == 0)  return 1;
		if (b % 2 == 1) {
			return a * binaryPow(a, b - 1);
		}else {
			int mul = binaryPow(a, b / 2);
			return mul * mul;
		}
	}

}
