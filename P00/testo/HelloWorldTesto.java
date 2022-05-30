import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloWorldTesto {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		System.out.println("I wanna cry rn");
		String st1 = "I wanna cry rn";
		String st2 = "I wanna cry rn";
		String st3 = "I dont wanna cry rn";
		assertEquals(st1, st2, st3);
	}

}
