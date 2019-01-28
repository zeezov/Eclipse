package tests;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Test;

import draw.DrawFlag;
import grid.Grid;

public class PublicTests {

	@Test
	public void testError() {
		
		Grid grid = new Grid(4);
		DrawFlag.drawFlag(grid, 11);
		
		for(int col = 0; col < 8; col++) {
			assertEquals(grid.getColor(0, col), Color.RED);
		}			
		
		for(int row = 0; row < 4; row++) {
			assertEquals(grid.getColor(row, 0), Color.RED);
		}
		
		for(int col = 0; col < 8; col++) {
			assertEquals(grid.getColor(4-1, col), Color.RED);
		}			
		
		for(int row = 0; row < 4; row++) {
			assertEquals(grid.getColor(row, 8-1), Color.RED);
		}
	}
	
	

}
