package CardValidators;

/**
 * American Express
 * IIN ranges: 34,37
 * Length: 15
 *
 */
public class AmericanExpressValidator implements Validator {

	@Override
	public boolean check(int[] digits) {
		// check length first
		if (digits.length != 15) {
			return false;
		}

		// card starts with 34 or 37
		int firstTwoDigits = Integer.valueOf((digits[0] + "" + digits[1]));
		if (firstTwoDigits == 34 || firstTwoDigits == 37) {
			return true;
		}

		return false;
	}

}
