package CardValidatorsTests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import CardValidators.LuhnValidator;

/**
 * Test inputs generated from 
 * <a href=http://www.getcreditcardnumbers.com/>http://www.getcreditcardnumbers.com</a>
 */
public class LuhnValidatorTest {

	@Test
	public void ValidCards() {

		int[][] ValidCards = { 
				{4,5,3,2,7,0,4,6,8,6,7,3,2,3,5,1},
				{4,9,2,9,4,8,4,2,7,0,6,8,1,2,1,2},
				{4,5,3,9,6,2,2,7,3,9,6,9,5,6,7,7},
				{4,5,3,9,4,4,8,9,7,7,0,1,0,3,9,9},
				{4,9,2,9,6,1,4,7,4,2,6,4,7,0,3,3},
				{4,7,1,6,8,1,8,3,5,7,6,5,4,1,3,8},
				{5,5,6,0,0,4,6,8,2,6,9,9,0,8,3,4},
				{5,4,5,7,5,5,6,5,7,6,8,6,2,5,0,0},
				{5,1,4,9,5,1,0,7,6,5,8,1,1,8,5,5},
				{5,4,4,4,2,4,4,6,9,9,8,3,7,7,7,6},
				{5,5,8,8,1,2,7,3,4,1,8,4,4,5,7,9},
				{6,0,1,1,2,8,2,3,4,0,8,5,9,3,9,4},
				{6,0,1,1,2,3,9,0,6,2,4,3,5,4,3,1},
				{6,0,1,1,5,2,2,0,4,5,2,5,1,7,4,8},
				{6,0,1,1,9,4,3,4,4,7,4,8,6,2,3,9},
				{6,0,1,1,4,0,1,2,8,6,5,4,8,8,9,0},
				{3,7,3,0,5,7,2,9,7,6,5,7,7,7,6},
				{3,7,1,6,5,2,6,9,3,2,7,6,9,9,9},
				{3,4,0,8,0,3,7,3,7,6,4,5,8,1,8},
				{3,4,7,6,3,0,9,4,1,9,1,5,1,1,4},
				{3,4,9,5,5,8,1,5,7,4,3,8,5,0,5},

		};

		for (int[] card : ValidCards) {
			assertTrue(new LuhnValidator().check(card));
		}

	}

	@Test
	public void InvalidCards() {
		int[][] InvalidCards = { 
				{},
				{0},
				{1},
				{-1},
				{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
				{4,5,5,6,6,6,9,4,0,1,8,2,2,2,0,6},
				{3,4,9,5,5,8},
				{4,0,2,4,0,0,7,1,3,0,5,2,0,7,3,7},
				{4,6,8,1,4,7,9,6,2,6,4,9,7,4,1,1},
				{4,9,2,8,9,9,4,3,1,0,6,7,2,3,7,9},
				{4,7,1,6,0,5,4,5,1,5,5,5,6,9,5,5}};

		for (int[] card : InvalidCards) {
			assertFalse(new LuhnValidator().check(card));
		}

	}

}
