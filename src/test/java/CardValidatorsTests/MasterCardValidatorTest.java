package CardValidatorsTests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import CardValidators.MasterCardValidator;

/**
 * Test inputs generated from 
 * <a href=http://www.getcreditcardnumbers.com/>http://www.getcreditcardnumbers.com</a>
 */
public class MasterCardValidatorTest {
	@Test
	public void ValidMasterCards() {
		int[][] masterCards = { 
				{5,3,7,3,9,9,0,8,2,4,0,1,9,8,7,1},
				{5,4,8,2,6,6,6,9,1,6,7,7,5,8,8,9},
				{5,3,7,7,8,9,6,5,2,9,4,2,8,2,6,5},
				{5,1,0,2,8,4,7,5,8,7,0,4,9,2,4,8},
				{5,1,4,7,0,6,3,0,5,5,5,9,6,6,4,8},
				};

		for (int[] card : masterCards) {
			assertTrue(new MasterCardValidator().check(card));
		}
	}
	@Test
	public void InValidMasterCards() {

		int[][] inDiscCards = { 
				{6,9,1,1,1,1,0,4,6,0,4,4,7,4,4,5},
				{6,2,0,1,4,3,4,7,4,5,4,8,9,2,8,1},
				{6,6,1,3,9,6,7,8,4,2,6,4,5,1,5,6},
				{1,0,1,1,9,0,6,6,1,8,2,3,2,1,6,1},
				{7,0,1,1,7,2,1,8,1,1,1,0,9,5,2,4}
				};

		for (int[] card : inDiscCards) {
			assertFalse(new MasterCardValidator().check(card));
		}

	}
}
