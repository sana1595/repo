/* this program is to find sum of multidimentional array(jagged array) */

/*importing packages*/
import java.util.Scanner;				

class FindSumofArrayElement {

	//main funcion	
	public static void main( String str[] ) {

		int sum = 0;
		operation_on_array obj = new operation_on_array();

		obj.in_array();
		obj.display_array();			

		System.out.println("Sum : " + obj.sum_of_array_elements());
	}

}

class operation_on_array {

		/* Declaring jagged array with 5 rows */
		int array[][]  = new int[5][];
		int index_i, index_j;							//loop variable

		operation_on_array() {
			index_i = 0;
			index_j = 0;
		}
		
		/* methods */
		/* method to taking array elements*/
		void in_array() {
		
			Scanner input = new Scanner(System.in);		//for taking input

			/* taking number of rows in array from user */
			System.out.println("Enter number of rows in array");
			array = new int[input.nextInt()][];

			/* taking number of elements per row */
			for(index_i = 0; index_i < array.length; index_i++) {

				System.out.println("Enter number of elements in " + index_i + " row");
				array[index_i] = new int[input.nextInt()];				
		
			}//end of for()

			/* taking value of element from user */
			 for(index_i = 0; index_i < array.length; index_i++) {                                                                                                        
        		System.out.println("Enter "+array[index_i].length+" elements for "
										+ index_i + " row");    

				for(index_j = 0; index_j < array[index_i].length; index_j++) 
               	array[index_i][index_j]= input.nextInt();                                     

        	}//end of for()    
		}

	/* display array */
	void display_array() {

		for(index_i = 0; index_i < array.length; index_i++)	{
			for(index_j = 0; index_j < array[index_i].length; index_j++)
				System.out.print(array[index_i][index_j] + "  ");
	
			System.out.println();
		}
	}

	/* function to calculate sum of array elements */
	int sum_of_array_elements() {

		int sum = 0;							//to hold sum

		/* calculating sum */
		for(index_i = 0; index_i < array.length; index_i++) 
			for(index_j = 0; index_j < array[index_i].length; index_j++)
					sum = sum + array[index_i][index_j];
				
		return sum;								//returning sum
	}//end of sum_of_array_elements()
	
} 
