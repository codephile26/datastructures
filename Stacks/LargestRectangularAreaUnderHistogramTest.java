package edu.ds.stacks;

import static org.junit.Assert.*;

import org.junit.Test;

public class LargestRectangularAreaUnderHistogramTest {

	@Test
	public void testLargestRectangularAreaUnderHistogramTest() {
		int [] histogram = {6,2,5,4,5,1,6};
		int max_area = LargestRectangularAreaUnderHistogram.findLargestRectangularAreaUnderHistogram(histogram);
		assertEquals(12, max_area);
	}

}
