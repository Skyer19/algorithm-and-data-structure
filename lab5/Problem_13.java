package lab5;

import java.util.Arrays;

public class Problem_13 {

	public static void main(String[] args) {

		   int X[] = { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
		   int Y[] = { 1, 8, 9, 10, 15 };
		   // merge two arrays
		   int point = 0;
		   for(int i = 0; i < X.length; i++) {
			   if(X[i] == 0) {
				   X[i] = Y[point++];
			   }
		   }
		   
		   // sort the array
			for(int i=1;i<=X.length-1;i++){
				for(int j=1;j<=X.length-i -1;j++){
					if(X[j]>X[j+1]) {
						int temp = X[j];
						X[j] = X[j+1];
						X[j+1] = temp;
					}		
				}
			 }
			
		   System.out.println(Arrays.toString(X));
	}

}
