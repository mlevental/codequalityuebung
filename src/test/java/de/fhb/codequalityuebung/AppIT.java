package de.fhb.codequalityuebung;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppIT extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppIT(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppIT.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void test1() {
		assertTrue(true);
	}

}
