package lab7;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 4, 7, 8, 6, 4 }, { 6, 7, 3, 9, 2 }, { 3, 8, 1, 2, 4 }, { 7, 1, 7, 3, 7 }, { 2, 9, 8, 9, 3 }, };
		int dp[][] = new int[5][5];
		
		
		for (int i = 0; i < 5; i++) {
			dp[4][i] = a[4][i];
		}
		
		// dp translate equation
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) { 
				if(i ==0 && j ==0) {
					dp[0][0] = a[0][0];
				}
				else if(j == 0&&i!=0) {
					dp[i][j] = dp[i-1][j] + a[i][0];
				}
				else if(i == 0&&j!=0) {
					dp[i][j] = dp[i][j -1] + a[0][j];
				}
				else {
					dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + a[i][j];
				}
			}
		}
		
		System.out.println("the minimum cost path having cost of " + dp[4][4]);
		System.out.print("Path:" + a[4][4]);
		int j = 4;
		int i = 4;
		// print the path
		while(i>=1&&j>=1) {
			if((dp[i][j]-a[i][j]) == dp[i][j-1]) {
				System.out.print("<--"+a[i][j-1]);
				j--;
			}else {
				System.out.print("<--"+a[i-1][j]);
				i--;
			}
		}
		System.out.print("<--"+a[0][0]+" (Read from right to left)");
	}
}
