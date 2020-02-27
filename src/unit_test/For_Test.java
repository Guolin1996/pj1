package unit_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import unit_test.Int_test;

class For_Test {

	@Test
	void test() {
		Int_test t = new Int_test(1, 10);
		assertEquals(t.test_output(), 10);
		
		Int_test t2 = new Int_test(100, 10);
		assertEquals(t2.test_output(), -1);
	}

}
