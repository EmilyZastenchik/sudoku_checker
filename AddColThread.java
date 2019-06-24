
public class AddColThread extends Thread{
	private Integer[][] array;
	private int start =0;
	private int end = 9;
	Column col;
	
	/*Constructor
	 * @param Integer[][] a
	 * 		reference to sudoku grid
	 * @param Col c
	 * 		assigns new Column object
	 */
	AddColThread (Integer[][] a, Column c) {
		array = a; col = c;
	}
	 /*
	  * validate function
	  * 	returns false if there is a duplicate in columns
	  * 	returns true if all columns are correct	
	  */
	boolean validate() {
		for (int i = start; i < end; i++) {		
			if(!col.checkCol(array,i)) {
				//System.out.println("SudokuIncorrect");
				return false;		
			}			
		}
		return true;
		
	}
	
	public void run() {
		
								
		}
	
	
}
