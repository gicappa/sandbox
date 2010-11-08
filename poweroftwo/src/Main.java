/**
 * $Id$
 *
 * @author Gian Carlo Pace <giancarlo.pace@gmail.com>
 */
public class Main {

	public static boolean powerOfTwo(Double number) {
		return number == 1 || isInteger(number / 2) && powerOfTwo(number / 2);
	}

	public static boolean isInteger(Double number) {
		return number == number.intValue();
	}
}
