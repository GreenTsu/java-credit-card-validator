package CardValidators;

public class LuhnValidator implements Validator {
	/**
	 * <h3>
	 * The Luhn algorithm is used for validating credit card numbers.
	 * </h3>
	 * 
	 * <p>
	 * see <a href=https://en.wikipedia.org/wiki/Luhn_algorithm>
	 * https://en.wikipedia.org/wiki/Luhn_algorithm</a>
	 * </p>
	 * <h3>Example</h3> digits = [7,9,9,2,7,3,9,8,7,1,<b>3</b>] check digit = 3
	 * <h3>1.) Double every other digit starting after the check digit.</h3>
	 * digits = [7,18,9,4,7,6,9,16,7,2,3]
	 * <h3>2.) If the digit is greater than 9, then add each digit or subtract 9.</h3>
	 * digits = [7,<b>18</b>,9,4,7,6,9,<b>16</b>,7,2,3]
	 * <br>digits[1] = 1+8 or 18-9 
	 * <br>digits[7] = 1+6 or 16-9
	 * <br>
	 * digits = [7,9,9,4,7,6,9,7,7,2,3]
	 * <h3>3.) Take the sum of all the digits.</h3>
	 * check digit(3) + (2) + 7 + (1+6) + 9 + (6) + 7 + (4) + 9 + (1+8) + 7 = 70
	 * <br>
	 * <h3>4.) if sum % 10 == 0, then it is a valid credit card.</h3>
	 * 70 % 10 = 0
	 * @param digits a credit card number as an array of integers.
	 * @return whether the card passes the Luhn check or not.
	 */
	@Override
	public boolean check(int[] digits) {
		if (digits.length <= 1 || digits == null) {
			return false;
		}
		int total = 0;
		int check = digits[digits.length - 1]; // check digit
		boolean alternate = true;

		for (int i = digits.length - 2; i >= 0; i--) {

			// double the value of every second digit
			if (alternate) {
				digits[i] *= 2;
			}

			if (digits[i] > 9) {
				digits[i] -= 9;
			}

			alternate = !alternate;
			total += digits[i];
		}

		total += check; // add check digit to total

		return total % 10 == 0;
	}

}
