package lab6;

import java.util.Arrays;

public class Problem_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] =  { 1, 2, 3, 8, 4, 5, 6, 0, 0, 10, 0, 7, 9, 10, 1, 0, 0, 0, 0, 1, 2, 0, 0, 0, 5, 2 };
		int path [] = new int [26]; // the final path
		int max = 0; //the maximum of the path
		double height = Math.floor(Math.log(A.length)); // find the height of the tree
		
		// start from the last line
		int start = (int)(Math.pow(2, height+1)-1);
		for(int i = start; i < 26 ;i++) {
			int tempPath [] = new int [26];
			int sum = 1;
			if(A[i]!=0) {
				int temp = i;
				tempPath[0] = A[0];
				
				// find the sum from bottom to the root
				while(temp>0) {
					sum += A[temp];
					tempPath[temp] = A[temp];
					temp = (temp -1)/2;
				}
			}
			if(max < sum) {
				max = sum;
				path = tempPath;
			}
		}
		
		System.out.print("the maximum sum is "+max+" an the maximum sum path is [");
		for(int i = 0; i < path.length; i++) {
			if(path[i]!= 0) {
				System.out.print(path[i]+" ");
			}
		}
		System.out.print("]");
	}
}
