package CardValidatorsTests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import CardValidators.DiscoverValidator;

/**
 * Test inputs generated from 
 * <a href=http://www.getcreditcardnumbers.com/>http://www.getcreditcardnumbers.com</a>
 */
public class DiscoverValidatorTest {
	
	
	@Test
	public void ValidDiscoverCards() {
		int[][] discCards = { 
				{6,0,1,1,1,1,0,4,6,0,4,4,7,4,4,5},
				{6,0,1,1,4,3,4,7,4,5,4,8,9,2,8,1},
				{6,0,1,1,9,6,7,8,4,2,6,4,5,1,5,6},
				{6,0,1,1,9,0,6,6,1,8,2,3,2,1,6,1},
				{6,0,1,1,7,2,1,8,1,1,1,0,9,5,2,4}
				};

		for (int[] card : discCards) {
			assertTrue(new DiscoverValidator().check(card));
		}

	}


@Test
public void InValidDiscoverCards() {

	int[][] inDiscCards = { 
			{6,9,1,1,1,1,0,4,6,0,4,4,7,4,4,5},
			{6,2,0,1,4,3,4,7,4,5,4,8,9,2,8,1},
			{6,6,1,3,9,6,7,8,4,2,6,4,5,1,5,6},
			{1,0,1,1,9,0,6,6,1,8,2,3,2,1,6,1},
			{7,0,1,1,7,2,1,8,1,1,1,0,9,5,2,4}
			};

	for (int[] card : inDiscCards) {
		assertFalse(new DiscoverValidator().check(card));
	}

}
}
