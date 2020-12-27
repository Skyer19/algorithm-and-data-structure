package lab6;

import java.util.Scanner;

public class Problem_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int lc = sc.nextInt();
		int rc = sc.nextInt();
		int A[] = { 1, 2, 3, 0, 4, 5, 6, 0, 0, 0, 0, 7, 8 };
		
		int temp[][] = new int [13][2];
		
		System.out.print("LAC("+lc+","+rc+") = ");
		
		//find the index of two nodes
		for(int i = 0; i < 13;i++) {
			if(A[i] == lc) lc = i;
			if(A[i] == rc) rc = i;
		}
		
		temp[0][0] = 1;
		temp[0][1] = 1;
		
		// mark the parent nodes of the child node
		while(lc > 0) {
			temp[lc][0] = 1;	
			lc = (lc -1)/2;
		}
		
		while(rc > 0) {
			temp[rc][1] = 1;
			rc = (rc -1)/2;
		}
		// find the same parent nodes of two node
		int max = -1;
		for(int i = 0; i < 13;i++) {
		if(temp[i][0]==temp[i][1]&&temp[i][0]!=0) {
			max = Math.max(A[i], max);
		}
	}
		System.out.print(max);
	}

}
