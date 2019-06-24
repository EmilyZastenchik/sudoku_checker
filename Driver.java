import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;


/*Emily Zastenchik
 *MultiThread Sudoku Solution Validator
 *
 */

public class Driver {

	static final int SIZE = 9;
	static final int NUMTHREADS = 9;
	
	public static void main(String[] args) throws FileNotFoundException  {
		//array of sudoku data
		Integer [][] grid = new Integer [SIZE][SIZE];
		System.out.println("Please enter sudoku file name: ");
		
	
		Scanner scanName = new Scanner(System.in);
		//read in text file name from console
		String input = scanName.nextLine();
		Scanner scan = new Scanner(new File(input));
		//read sudoku grid from text file
		while(scan.hasNext()) {
		
			for(int i = 0; i < 9; i++) {
				for(int j = 0; j < 9; j++) {
					grid[i][j] = scan.nextInt();
				}
			}					
		}
		//printGrid(grid);
		scanName.close();
		scan.close();
	
		//hold thread answer
		Row subX = new Row();	
		Column subY = new Column();		
		SubMatrix subZ = new SubMatrix();
		
		//create threads
		AddRowThread rowThread =new AddRowThread(grid, subX);
		Thread r = new Thread(rowThread);
		r.start();
		
		AddColThread colThread = new AddColThread(grid, subY);
		Thread c = new Thread(colThread);
		c.start();
		
		AddSubThread subThread = new AddSubThread(grid, subZ);
		Thread s = new Thread(subThread);
		s.start();
		
		try {			
			r.join();
			c.join();
			s.join();
		} catch (InterruptedException ie) { }
		
		//checks the final boolean result from the AddThread classes
		//and prints final result
		if(rowThread.validate()&&colThread.validate()&&subThread.validate())
		System.out.println("Sudoku solution correct :) ");
		else
			System.out.println("Sudoku solution incorrect :( ");
	}
	
	static void printGrid(Integer [][] array) {
		//displays sudoku puzzle as 9x9 grid
		//for debugging purposes
		for (int i = 0; i < array.length; i++) {
			System.out.println();
			for (int j = 0; j < array.length; j++) {
		System.out.print(array[i][j] + " ");
			}
		}
	}	
}
	
	
	
	
	
