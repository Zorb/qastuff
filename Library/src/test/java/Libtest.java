import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class Libtest {
	@Before
	public void init() {
		Book booktest = new Book("test", 423423, "gergre");

	}

	@Test
	public void testlist() {
		// TO-DO

		fail("Not done");
		assertNotNull("Title is empty", booktest.Title);
	}

	@Test
	public void authortest() {
		// TO-DO
		fail("Not done");
		assertNotNull("Title is empty", booktest.Title);
	}
}
