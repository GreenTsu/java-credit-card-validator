package CardValidators;

/**
 * Discover
 * IIN ranges: 64,65,6011
 * Length: 16-19
 */
public class DiscoverValidator implements Validator {

	@Override
	public boolean check(int[] digits) {
		int l = digits.length;

		// check length first
		if (l >= 16 && l <= 19) {
			int firstTwoDigits = Integer.valueOf((digits[0] + "" + digits[1]));
			
			// check 64,65 case
			if ((firstTwoDigits == 64 || firstTwoDigits == 65)) {
				return true;
			}

			// check 6011 case
			int firstFourDigits = Integer.valueOf(firstTwoDigits + "" + digits[2] + "" + digits[3]);
			if (firstFourDigits == 6011) {
				return true;
			}
		}
		return false;
	}
}
