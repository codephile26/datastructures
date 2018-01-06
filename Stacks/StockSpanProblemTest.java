package edu.ds.stacks;

import static org.junit.Assert.*;

import org.junit.Test;

public class StockSpanProblemTest {

	@Test
	public void testStockSpanAverageCase() {
		int [] stockPrice = {100,80,60,70,60,75,85};
		int [] stockSpan = StockSpanProblem.findStockSpan(stockPrice);
		int [] stockSpanExpected = {1,1,1,2,1,4,6};
		assertArrayEquals(stockSpanExpected,stockSpan);
	}
	
	@Test
	public void testStockSpanWorstCase(){
		int [] stockPrice = {100,90,80,70,60,50,40};
		int [] stockSpan = StockSpanProblem.findStockSpan(stockPrice);
		int [] stockSpanExpected = {1,1,1,1,1,1,1};
		assertArrayEquals(stockSpanExpected,stockSpan);
	}

}
