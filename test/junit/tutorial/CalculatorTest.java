package junit.tutorial;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class CalculatorTest {
	@Test
	public void multiply‚Å3‚Æ4‚ÌæZŒvZ‚ª‚Å‚«‚é() {
		Calculator calc = new Calculator();
		int expected = 12;
		int actual = calc.multiply(3,4);
		assertThat(actual,is(expected));
	}
	@Test
	public void multiply‚Å5‚Æ7‚ÌæZŒ‹‰Ê‚ªæ“¾() {
		Calculator calc = new Calculator();
		int expected = 35;
		int actual = calc.multiply(5,7);
		assertThat(actual, is(expected));
	}
	@Test
	public void divide‚Å3‚Æ2‚ÌœZŒ‹‰Êæ“¾(){
		Calculator calc = new Calculator();
		float expected = 1.5f;
		float actual = calc.divide(3, 2);
		assertThat(actual, is(expected));
	}
	@Test(expected = IllegalArgumentException.class)
	public void divide‚Å5‚Æ0‚Ì‚Æ‚«(){
		Calculator calc = new Calculator();
		calc.divide(5,0);	
	}
	
}
