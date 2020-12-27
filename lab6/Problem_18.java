package lab6;

public class Problem_18 {
	static int N = 8;
	static int[] saveArray = new int[N];

	public static void main(String[] args) {
		int[] S = { 1, 3, 5, 7 };
		System.out.println("We can find " + change(N, S) + " ways to change");
	}

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i]; j++) {
				System.out.print("(" + i + ") ");
			}
		}
	}

	public static int change(int amount, int[] coins) {
		return dfs(0, coins, amount);
	}

	public static int dfs(int deep, int[] coins, int amount) {
		int res = 0;
		if (amount == 0) {
			res++;
			printArray(saveArray);
			System.out.println();
			return res;
		}
		if (amount < 0 || deep == coins.length) {
			return res;
		}
		for (int i = deep; i < coins.length; i++) {
			if ((amount - coins[i]) >= 0) {
				if ((amount - coins[i]) == 0 && i != 0) {
					if (saveArray[coins[i - 1]] >= 0) {
						saveArray[coins[i - 1]]--;
					}
				}
				if ((amount - coins[i]) == 0 && i != coins.length - 1) {
					if (saveArray[coins[coins.length - 1]] > 0) {
						saveArray[coins[coins.length - 1]]--;
					}
				}
				saveArray[coins[i]]++;
			} else {
				if (saveArray[coins[i - 1]] >= 0) {
					saveArray[coins[i - 1]]--;
				}
				break;
			}
			res += dfs(i, coins, amount - coins[i]);
		}
		return res;
	}
}
