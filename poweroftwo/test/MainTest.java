import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * $Id$
 *
 * @author Gian Carlo Pace <giancarlo.pace@gmail.com>
 */
public class MainTest {
	@Test
	public void it_should_return_false_if_number_is_not_an_integer() {
	    assertThat(Main.isInteger(1.5d), is(false));
	}

//	@Test
//	public void it_should_return_if_its_a_power_of_two() {
//		assertThat(Main.powerOfTwo(0d), is(false));
//	}

	@Test
	public void it_should_return_true_for_2() {
	    assertThat(Main.powerOfTwo(2d), is(true));
	}

	@Test
	public void it_should_return_true_for_1() {
	    assertThat(Main.powerOfTwo(1d), is(true));
	}

	@Test
	public void it_should_return_false_for_3() {
	    assertThat(Main.powerOfTwo(3d), is(false));
	}

	@Test
	public void it_should_return_true_for_4() {
	    assertThat(Main.powerOfTwo(256d), is(true));
	}
}
