
public class AddRowThread extends Thread {
	
	private Integer[][] array;
	private int start =0;
	private int end = 9;
	Row row;
	
	/*Constructor
	 * @param Integer[][] a
	 * 		reference to sudoku grid
	 * @param Row r
	 * 		assigns new Row object
	 */
	
	 AddRowThread (Integer[][] a, Row r) {
			array = a; row = r;
		}
	 
	 /*
	  * validate function
	  * 	returns false if there is a duplicate in rows
	  * 	returns true if all rows are correct	
	  */
	boolean validate() {
			for (int i = start; i < end; i++) {		
				if(!row.checkRow(array,i)) {
					//System.out.println("SudokuIncorrect");
					return false;		
				}			
			}
			return true;
			
	}
		
	public void run() {
		
	}
		
	
}
	
	

