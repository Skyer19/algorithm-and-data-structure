package lab3;

/*
 * Given an array of distinct integers, shuffle it according to the given order of elements.
 */
import java.util.Arrays;

public class Problem_08 {

	public static void main(String[] args) {

		   int arr[] = {1, 2, 3, 4, 5 };
		   int pos[] = { 3, 2, 4, 1, 0 };
		   int newarr[] = new int [5];
		   
		   //we set arr[pos[i]] as arr[i]
		   for(int i = 0; i < 5; i++) {
			   newarr[i] = arr[pos[i]];
		   }
		   
		   System.out.println("arr = "+Arrays.toString(newarr));
		   
	}

}
