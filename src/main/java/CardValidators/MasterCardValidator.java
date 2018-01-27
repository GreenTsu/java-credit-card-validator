package CardValidators;

/**
 * Mastercard
 * IIN ranges: 51–55, 2221–2720
 * Length: 16 
 */
public class MasterCardValidator implements Validator {

	@Override
	public boolean check(int[] digits) {
		
		// check length first
		if (digits.length != 16) {
			return false;
		}

		// 51-55 cases
		int firstTwoDigits = Integer.parseInt((digits[0] + "" + digits[1]));
		if (firstTwoDigits >= 51 && firstTwoDigits <= 55) {
			return true;
		}

		// 2221–2720 cases
		int firstFourDigits = Integer.parseInt((firstTwoDigits + "" + digits[2] + "" + digits[3]));
		if (firstFourDigits >= 2221 && firstFourDigits <= 2720) {
			return true;
		}

		return false;
	}

}
