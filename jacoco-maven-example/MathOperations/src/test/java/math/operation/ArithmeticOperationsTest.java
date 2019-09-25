package math.operation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArithmeticOperationsTest {
	ArithmeticOperations operations = new ArithmeticOperations();
	Integer expected = 8;
	@Test
	public void testAdd()
	{		
		Integer actual = operations.add(2, 6);
		assertEquals(expected, actual);

	}
	@Test
	public void notEqual()
	{		
		Integer actual = operations.add(4, 4);
		assertEquals(expected, actual);

	}
	@Test
	public void testSub()
	{		
		Integer actual = operations.sub(8, 4);
		assertEquals(expected, actual);

	}
}
