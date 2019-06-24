import java.util.HashSet;
import java.util.Set;

public class Column{
	/*@param Integer board[][]
	 * 		reference to sudoku grid
	 * @param int colCount
	 * 		specific column to check in sudoku grid
	 * 
	 * returns true for no duplicates in specific column
	 * returns false is duplicates exist in column
	 */
	public boolean checkCol(Integer board[][], int colCount) {
		Set<Integer> s = new HashSet<Integer>();
		//create a Set with the values from the sudoku grid column
		for (int i = 0; i < board.length; ++i) {
			s.add(board[colCount][i]);
		}
		//check the number of elements in the Set and Array
		//if the row has duplicate values, the set will have fewer items than the array 
		//since a set cannot have duplicate elements
		if(s.size() != board.length)
			return false;
		return true;
		
	}
}