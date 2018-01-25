package CreditCardTests;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import CreditCard.CardType;
import CreditCard.CreditCard;

/**
 * Test inputs generated from 
 * <a href=http://www.getcreditcardnumbers.com/>http://www.getcreditcardnumbers.com</a>
 */

public class CreditCardTest {

	
	@Test
	public void ValidVisaInputs() {
		String[] visas = {
			"4024007138518286",
			"4556987472213618",
			"4024007171707457",
			"4556426121468059",
			"4197437457230612",
	};
	
	for(String card : visas) {
		CreditCard c = new CreditCard(card);
		assertTrue(c.isValid() && c.getCardType() == CardType.VISA);
	}
}
	@Test
	public void ValidVisaInputs2() {
	String [] visas = {
			"40-2400-71385-18286",
			"455-698-747-221-3618",
			"402-400-717-170/74-57",
			"4-5564-2612-146-8-059",
			"419.7.43.745.7.2.3.0.6.1.2",
	};
	
	for(String card : visas) {
		CreditCard c = new CreditCard(card);
		assertTrue(c.isValid() && c.getCardType() == CardType.VISA);
	}
}
	@Test
	public void ValidMasterCardInputs() {
	String [] mastercards = {
			"5448302406859297",
			"5470144104329863",
			"5135093361439492",
			"5578806803964429",
			"5156506642735473",
	};
	
	for(String card : mastercards) {
		CreditCard c = new CreditCard(card);
		assertTrue(c.isValid() && c.getCardType() == CardType.MASTERCARD);
	}
}
	
	@Test
	public void ValidDiscoverCardInputs() {
	String [] disc = {
			"6011860163924054",
			"6011510892753262",
			"6011879270656292",
			"6011611649838255",
			"6011953497813430",
	};
	
	for(String card : disc) {
		CreditCard c = new CreditCard(card);
		assertTrue(c.isValid() && c.getCardType() == CardType.DISCOVER);
	}
}
	
	@Test
	public void ValidAmericanExpressCardInputs() {
	String [] ax = {
			"379821355015993",
			"341103781415443",
			"371167345231565",
			"346158304454084",
			"377963570661813",
	};
	
	for(String card : ax) {
		CreditCard c = new CreditCard(card);
		assertTrue(c.isValid() && c.getCardType() == CardType.AMERICAN_EXPRESS);
	}
}
	
	@Test
	public void OtherValidCardInputs() {
	String [] other = {
			"869952038177244",    // Voyager
			"3112242763222772",  // JCB
			"30232884662910",   // Diners Club
	};
	
	for(String card : other) {
		CreditCard c = new CreditCard(card);
		assertTrue(c.isValid() && c.getCardType() == CardType.OTHER);
	}
}
	@Test
	public void InvalidCardInputs() {
	String [] invalid = {
			"0",
			"-1",
			"9999999999999999999999999999999999999999999999",
			"",
			"1234567890",
			"abcdefifjfoiwjefoiwejfoi",
			"a1b2be21ebo124jb",
			"179821355015997",
			"241103781415443",
			"571167345231561",
			"746158304454086",
			"877963570661814",
			};
	
	for(String card : invalid) {
		CreditCard c = new CreditCard(card);
		assertFalse(c.isValid());
	}
}
}