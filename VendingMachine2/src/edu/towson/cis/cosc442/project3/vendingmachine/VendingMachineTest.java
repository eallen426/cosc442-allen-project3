package edu.towson.cis.cosc442.project3.vendingmachine;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>VendingMachineTest</code> contains tests for the class <code>{@link VendingMachine}</code>.
 *
 * @generatedBy CodePro at 2/27/18 2:50 PM
 * @author user
 * @version $Revision: 1.0 $
 */
public class VendingMachineTest {
	/**
	 * Run the VendingMachine() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/27/18 2:50 PM
	 */
	@Test
	public void testVendingMachine_1()
		throws Exception {

		VendingMachine result = new VendingMachine();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.returnChange(), 1.0);
		assertEquals(0.0, result.getBalance(), 1.0);
	}

	/**
	 * Run the VendingMachine() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/27/18 2:50 PM
	 */
	@Test
	public void testVendingMachine_2()
		throws Exception {

		VendingMachine result = new VendingMachine();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.returnChange(), 1.0);
		assertEquals(0.0, result.getBalance(), 1.0);
	}

	/**
	 * Run the void addItem(VendingMachineItem,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/27/18 2:50 PM
	 */
	@Test
	public void testAddItem_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		VendingMachineItem item = new VendingMachineItem("", 1.0);
		String code = "A";

		fixture.addItem(item, code);

		// add additional test code here
	}

	/**
	 * Run the void addItem(VendingMachineItem,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/27/18 2:50 PM
	 */
	@Test
	public void testAddItem_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		VendingMachineItem item = new VendingMachineItem("", 1.0);
		String code = "A";

		fixture.addItem(item, code);

		// add additional test code here
	}

	/**
	 * Run the void addItem(VendingMachineItem,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/27/18 2:50 PM
	 */
	@Test(expected = edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineException.class)
	public void testAddItem_3()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		VendingMachineItem item = new VendingMachineItem("", 1.0);
		String code = "";

		fixture.addItem(item, code);

		// add additional test code here
	}

	/**
	 * Run the double getBalance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/27/18 2:50 PM
	 */
	@Test
	public void testGetBalance_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;

		double result = fixture.getBalance();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the VendingMachineItem getItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/27/18 2:50 PM
	 */
	@Test
	public void testGetItem_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		VendingMachineItem result = fixture.getItem(code);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the VendingMachineItem getItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/27/18 2:50 PM
	 */
	@Test(expected = edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineException.class)
	public void testGetItem_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "";

		VendingMachineItem result = fixture.getItem(code);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void insertMoney(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/27/18 2:50 PM
	 */
	@Test
	public void testInsertMoney_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		double amount = 1.0;

		fixture.insertMoney(amount);

		// add additional test code here
	}

	/**
	 * Run the void insertMoney(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/27/18 2:50 PM
	 */
	@Test(expected = edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineException.class)
	public void testInsertMoney_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		double amount = -4.9E-324;

		fixture.insertMoney(amount);

		// add additional test code here
	}

	/**
	 * Run the boolean makePurchase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/27/18 2:50 PM
	 */
	/**
	 * Test to verify item is removed when purchased successfully
	 */
	@Test
	public void testMakePurchase() {
		VendingMachine vendMachine = new VendingMachine();
		vendMachine.insertMoney(5.00);
		vendMachine.addItem(new VendingMachineItem("pringles", .3),  "A");
		assertEquals(true, vendMachine.makePurchase("A"));
	}
	
	/**
	 * Test for exception thrown when entered slot is empty
	 */
	@Test
	public void testMakePurchase_EmptySlotException() {
		VendingMachine vendMachine = new VendingMachine();
		try {
	        vendMachine.makePurchase("A");
	        fail();
	    } 
	    catch (Exception e) {
	        final String expected = "Slot A is empty -- cannot remove item";
	        assertEquals( expected, e.getMessage());
	    } 
	}
	
	/**
	 * Test for Insufficient Funds Exception error
	 */
	@Test
	public void testMakePurchase_InsufficientFundsException() {
		VendingMachine vendMachine = new VendingMachine();
		vendMachine.insertMoney(.2);
		vendMachine.addItem(new VendingMachineItem("pringles", .3),  "A");
		try {
	        vendMachine.makePurchase("A");
	        fail();
	    } 
	    catch (Exception e) {
	        final String expected = "Insufficient funds.";
	        assertEquals( expected, e.getMessage());
	    } 
	}
	
	/**
	 * Tests to make sure the balance is updated correctly after a 
	 * transaction is completed
	 * 
	 */
	@Test
	public void testMakePurchaseNewBalance() {
		VendingMachine vendMachine = new VendingMachine();
		vendMachine.insertMoney(5.00);
		vendMachine.addItem(new VendingMachineItem("pringles", .3),  "A");
		vendMachine.makePurchase("A");
		assertEquals(4.7, vendMachine.getBalance(), .0001);
		
	}

	/**
	 * Run the VendingMachineItem removeItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/27/18 2:50 PM
	 */
	@Test(expected = edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineException.class)
	public void testRemoveItem_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "";

		VendingMachineItem result = fixture.removeItem(code);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the VendingMachineItem removeItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/27/18 2:50 PM
	 */
	@Test(expected = edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineException.class)
	public void testRemoveItem_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		VendingMachineItem result = fixture.removeItem(code);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the VendingMachineItem removeItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/27/18 2:50 PM
	 */
	@Test(expected = edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineException.class)
	public void testRemoveItem_3()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		VendingMachineItem result = fixture.removeItem(code);

		// add additional test code here
		assertNotNull(result);
	}
	
	@Test
	public void addItemException() {
		VendingMachine vendMachine = new VendingMachine();
		VendingMachineItem item3 = new VendingMachineItem("chips ahoy", .5);
		try {
			vendMachine.addItem(item3, "C");
			vendMachine.addItem(item3, "C");
	        fail();
	    } 
	    catch (Exception e) {
	        final String expected = "Slot C already occupied";
	        assertEquals( expected, e.getMessage());
	    } 
	}

	@Test
	public void testAddAndRemoveItem() {
		VendingMachine vendMachine = new VendingMachine();
		VendingMachineItem item1 = new VendingMachineItem("pringles", .3);
		VendingMachineItem item2 = new VendingMachineItem("doritos", .25);
		VendingMachineItem item3 = new VendingMachineItem("chips ahoy", .5);
		VendingMachineItem item4 = new VendingMachineItem("pop tarts", .4);
		vendMachine.addItem(item1, "A");
		vendMachine.addItem(item2, "B");
		vendMachine.addItem(item3, "C");
		vendMachine.addItem(item4, "D");
		assertEquals(item1, vendMachine.removeItem("A"));
		assertEquals(item2, vendMachine.removeItem("B"));
		assertEquals(item3, vendMachine.removeItem("C"));
		assertEquals(item4, vendMachine.removeItem("D"));
	}

	/**
	 * Run the double returnChange() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/27/18 2:50 PM
	 */
	@Test
	public void testReturnChange_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;

		double result = fixture.returnChange();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 2/27/18 2:50 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 2/27/18 2:50 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 2/27/18 2:50 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(VendingMachineTest.class);
	}
}