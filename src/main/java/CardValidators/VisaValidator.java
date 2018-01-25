package CardValidators;

/**
 * Visa
 * IIN ranges: 4
 * Length: 13, 16, 19
 */

public class VisaValidator implements Validator{

	@Override
	public boolean check(int[] digits) {
		// check if card starts with 4
		if (digits[0] != 4) {
			return false;
		}

		// check length
		int l = digits.length;
		return (l == 13 || l == 16 || l == 19);
	}

}
