import java.util.Arrays;

public class INtArray {

	public static void main(String[] args) {
		int[] numArray = { 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0 };
		int i = 0;

		// create a new array length of existing array 
		int [] newNumArray=new int[numArray.length]; 

		// use for loop and copy all elements which are Non-Zero in new array
		for(int j = 0;j<numArray.length-1;j++){
		if (numArray[j] != 0){
		newNumArray[i] = numArray[j]; 
		i++;
		}
		} 

		// print new array
		System.out.println(Arrays.toString(newNumArray));
		}
		

		

	

}
