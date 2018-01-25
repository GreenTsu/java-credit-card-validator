package CardValidatorsTests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import CardValidators.VisaValidator;

/**
 * Test inputs generated from 
 * <a href=http://www.getcreditcardnumbers.com/>http://www.getcreditcardnumbers.com</a>
 */
public class VisaValidatorTest {

	@Test
	public void ValidVisaCards() {

		int[][] visaCards = {
				{4,5,3,9,8,9,9,2,3,0,6,2,9,6,2,5},
				{4,7,1,6,3,0,1,7,0,2,3,1,7,5,1,1},
				{4,7,9,0,9,8,4,7,1,2,4,9,9,0,3,8},
				{4,7,1,6,5,8,2,6,1,0,0,4,2,8,2,6},
				{4,9,2,9,1,9,6,0,4,0,7,0,6,3,3,1},
		};

		for (int[] card : visaCards) {
			assertTrue(new VisaValidator().check(card));
		}
	}
	@Test
	public void InValidVisaCards() {

		int[][] invisaCards = { 
				{5,3,7,3,9,9,0,8,2,4,0,1,9,8,7,1},
				{5,4,8,2,6,6,6,9,1,6,7,7,5,8,8,9},
				{5,3,7,7,8,9,6,5,2,9,4,2,8,2,6,5},
				{5,1,0,2,8,4,7,5,8,7,0,4,9,2,4,8},
				{5,1,4,7,0,6,3,0,5,5,5,9,6,6,4,8},
				};

		for (int[] card : invisaCards) {
			assertFalse(new VisaValidator().check(card));
		}

	}




}