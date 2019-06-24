import java.util.HashSet;
import java.util.Set;

public class SubMatrix {
	/*@param Integer board[][]
	 * 		reference to sudoku grid
	 * @param int rowCount
	 * 		specific row to check in sudoku grid
	 * @param int colCount
	 * 		specific column to check in sudoku grid
	 * 
	 * returns true for no duplicates in specific subGrid
	 * returns false is duplicates exist in subGrid
	 */

	public boolean checkNum(Integer board[][], int rowCount, int colCount) {
		Set<Integer> s = new HashSet<Integer>();
		//create a Set with the values from the sudoku subGrid
		for(int rowBegin = rowCount; rowBegin < (rowCount + 3); rowBegin++) {
			for(int colBegin = colCount; colBegin < (colCount + 3); colBegin++){
				
				s.add(board[rowBegin][colBegin]);
			}
		}
		//System.out.println("\n"+s.toString());
		//check the number of elements in the Set and Array
		//if the row has duplicate values, the set will have fewer items than the array 
		//since a set cannot have duplicate elements
		if(s.size() != board.length)
			return false;
		return true;
		
	}
}
