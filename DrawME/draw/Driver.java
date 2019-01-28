package draw;

import java.util.Scanner;

import grid.Grid;


//// DO NOT MODIFY ! JUST RUN IT TO TEST YOUR RESULT!

public class Driver {	
	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		
		/* Get input from user about what flag to draw */
		System.out.println("Type the number corresponding to the name:  ");
		System.out.println("1 France");
		System.out.println("2 Argentina");
		System.out.println("3 Austria");
		System.out.println("4 Ukraine");
		System.out.println("5 Russia");
		System.out.println("6 Uyguria");
	    System.out.println("7 Uzbekistan");
		System.out.print("Your choice here: ");
		int choice = scanner.nextInt();
		int size = 1;
		if(choice >=1 && choice <= 10) {
			System.out.print("Choose a size (between 10 and 30): ");
			size = scanner.nextInt();
		}
		
		if (choice < 1 || choice > 10 || size < 4 || size >10){
			size = 8;
			choice = 99;
		}
		
		/* Create drawing grid */
		Grid grid = new Grid(size);

		/* Draw the flag */
		DrawFlag.drawFlag(grid, choice);
	}
	
}

