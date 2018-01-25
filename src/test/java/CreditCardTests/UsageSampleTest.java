package CreditCardTests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import CreditCard.CardType;
import CreditCard.CreditCard;

public class UsageSampleTest {


	@Test
	public void test() {

			CreditCard card = new CreditCard("4024007138518286");
			assertTrue(card.isValid()); // returns true

			CreditCard card2 = new CreditCard("241103781415443");
			assertFalse(card2.isValid()); // returns false

			CreditCard card3 = new CreditCard("402-400-713-851-8286");
			assertTrue(card3.isValid()); // returns true

			CreditCard card4 = new CreditCard("");
			assertEquals("[{Card Number: []} {Invalid Card} {Type: INVALID}]",card4.toString());
			// returns 
			// [{Card Number: []} {Invalid Card} {Type: INVALID}]

			CreditCard card5 = new CreditCard("341103781415443");
			assertTrue(card5.getCardType() == CardType.AMERICAN_EXPRESS); 
			// returns CardType.AMERICAN_EXPRESS

			CreditCard card6 = new CreditCard("4556426121468059");
			assertEquals("[{Card Number: [4, 5, 5, 6, 4, 2, 6, 1, 2, 1, 4, 6, 8, 0, 5, 9]} {Valid Card} {Type: VISA}]"
					   ,card6.toString());
			// returns 
			// [{Card Number: [4, 5, 5, 6, 4, 2, 6, 1, 2, 1, 4, 6, 8, 0, 5, 9]} {Valid Card} {Type: VISA}]
		}
	}


