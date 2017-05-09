import static org.junit.Assert.*;

import org.junit.Test;

public class TestCar {

	@Test
	public void testForfail() {
		Car c = new Car();
		c.setRate(50);
		assertEquals(50,c.getengineCapacity());
	}

	@Test
	public void testforsuccess() {
		Car c = new Car();
		c.setRate(150);
		assertEquals(150,c.getengineCapacity());
	}
}
