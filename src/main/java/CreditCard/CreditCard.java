package CreditCard;

import java.util.Arrays;

import CardValidators.AmericanExpressValidator;
import CardValidators.DiscoverValidator;
import CardValidators.LuhnValidator;
import CardValidators.MasterCardValidator;
import CardValidators.VisaValidator;

/**
 * This class represents a credit card.
 *
 */
public class CreditCard {
	private String ccNumber;
	private int[] digits;
	private CardType type;

	/**
	 * @param ccNumber A credit card number as a string.
	 */
	public CreditCard(String ccNumber) {
		this.ccNumber = ccNumber;
		this.digits = parseDigits(ccNumber);
		this.type = getCardType();

	}

	/**
	 * @param ccNumber A credit card number as a string.
	 * @return An integer array containing the credit card digits.
	 */
	private int[] parseDigits(String ccNumber) {
		return ccNumber.chars().filter(i -> (i >= '0' && i <= '9'))
				               .map(i -> i - '0').toArray();
	}

	/**
	 * @return Whether or not the credit card is valid
	 */
	public boolean isValid() {
		return new LuhnValidator().check(parseDigits(ccNumber));
	}

	/**
	 * @return Credit Card Network Type
	 */
	public CardType getCardType() {
		if (digits.length <= 1 || digits == null) {
			return CardType.INVALID;
		}
		if (new VisaValidator().check(digits)) {
			return CardType.VISA;
		}

		if (new MasterCardValidator().check(digits)) {
			return CardType.MASTERCARD;
		}

		if (new AmericanExpressValidator().check(digits)) {
			return CardType.AMERICAN_EXPRESS;
		}

		if (new DiscoverValidator().check(digits)) {
			return CardType.DISCOVER;
		} else
			return CardType.OTHER;
	}

	/**
	 * @return [{Card Number: []} {Invalid/Valid Card} {Type: CardType}]
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		sb.append("{Card Number: " + Arrays.toString(digits) + "} ");
		if (isValid()) {
			sb.append("{Valid Card} ");
		} else {
			sb.append("{Invalid Card} ");
		}
		sb.append("{Type: " + type + "}");
		sb.append("]");
		return sb.toString();
	}

}
