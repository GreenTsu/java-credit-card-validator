package CardValidatorsTests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import CardValidators.AmericanExpressValidator;

/**
 * Test inputs generated from 
 * <a href=http://www.getcreditcardnumbers.com/>http://www.getcreditcardnumbers.com</a>
 */
public class AmericanExpressValidatorTest {

	@Test
	public void ValidAmericanExpressCards() {
		int[][] axCards = { 
				{3,4,9,5,2,6,8,8,4,0,8,3,4,4,9},
				{3,4,2,1,7,9,5,1,9,1,5,4,4,6,1},
				{3,7,3,5,6,6,7,2,2,5,2,6,0,4,2},
				{3,7,5,5,0,4,4,0,3,1,3,3,6,6,1},
				{3,4,5,7,9,6,9,1,5,0,7,5,2,4,3},
				{3,7,6,6,5,0,2,2,0,3,2,4,3,1,1},};

		for (int[] card : axCards) {
			assertTrue(new AmericanExpressValidator().check(card));
		}
	}

	@Test
	public void InValidAmericanExpressCards() {

		int[][] InvalidAxCards = { 
				{4,5,3,2,7,0,4,6,8,6,7,3,2,3,5,1},
				{5,5,3,1,1,2,0,7,9,6,1,7,2,5,3,7},
				{3,3,9,6,2,5,3,6,5,4,2,3,4,6,5,3},
				{4,9,2,2,1,7,6,4,8,6,1,0,6,0,5,2},
				{4,4,8,5,5,0,6,3,9,2,3,8,0,9,8,8},
				{2,5,3,9,2,9,1,8,8,8,6,7,1,5,1,5},};

		for (int[] card : InvalidAxCards) {
			assertFalse(new AmericanExpressValidator().check(card));
		}
	}

}
