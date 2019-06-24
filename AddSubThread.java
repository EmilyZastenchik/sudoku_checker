
public class AddSubThread extends Thread {

	private Integer[][] array;
	private int start =0;
	private int end = 9;
	SubMatrix sub;
	
	/*Constructor
	 * @param Integer[][] a
	 * 		reference to sudoku grid
	 * @param SubMatrix sm
	 * 		assigns new SubMatrix object
	 */
	AddSubThread (Integer[][] a, SubMatrix sm) {
	array = a; sub = sm;
	}
	
	/*
	  * validate function
	  * 	returns false if there is a duplicate in sub grids
	  * 	returns true if all sub grids are correct	
	  */
	boolean validate() {
		for (int i = start; i < end; i+=3) {		
			for (int j = start; j < end; j+=3) {	
				if(!sub.checkNum(array,i,j)) {
					//System.out.println("SudokuIncorrect");
					return false;		
				}
			}
		}
		return true;
		
	}
	
	public void run() {
	
		
	}
}
