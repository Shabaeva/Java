package ru.hiddenpool.reverse;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseTest {

	@Test
	public void test() {
		assertEquals("dlrow", Reverse.reverse("world"));
		assertEquals("63841", Reverse.reverse("14836"));
	}

}
