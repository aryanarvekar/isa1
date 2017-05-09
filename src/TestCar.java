import static org.junit.Assert.*;

import org.junit.Test;

public class TestCar {

	@Test
	public void test() {
		Car c = new Car();
		c.setRate(50);
		assertEquals(50,c.getengineCapacity());
	}

}
