package CardValidators;

/**
 * <p>
 * The first six digits of a card number are known as the issuer identification
 * number (IIN). These identify the card issuing institution that issued the
 * card to the card holder.
 * </p>
 * <p>
 * see <a
 * href=https://en.wikipedia.org/wiki/Payment_card_number#Issuer_identification_number_(IIN)>
 * https://en.wikipedia.org/wiki/Payment_card_number#Issuer_identification_number_(IIN)</a>
 * </p>
 */

public interface Validator {

	public boolean check(int[] digits);

}
