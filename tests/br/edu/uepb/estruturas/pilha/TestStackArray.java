package br.edu.uepb.estruturas.pilha;

import java.util.Random;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestStackArray {
	private StackArray<Integer> arrayPilha;

	@Before
	public void init() {
		arrayPilha = new StackArray<Integer>();
	}

	@Test
	public void testPush() throws StackOverflowException {
		Random r = new Random();
		arrayPilha.push(r.nextInt());
		arrayPilha.push(r.nextInt());
		arrayPilha.push(r.nextInt());
		arrayPilha.push(r.nextInt());
		arrayPilha.push(r.nextInt());
		Assert.assertTrue(arrayPilha.size() == 5);
		
		// Imprime os valores
		// System.out.println(arrayPilha);
	}

	@Test
	public void testPop() throws StackUnderflowException, StackOverflowException {
		arrayPilha.push(12);
		Assert.assertEquals(arrayPilha.pop(), new Integer(12));
		Assert.assertTrue(arrayPilha.size() == 0);

		arrayPilha.push(156);
		arrayPilha.push(15);
		arrayPilha.push(597);
		Assert.assertEquals(arrayPilha.pop(), new Integer(597));
		Assert.assertEquals(arrayPilha.pop(), new Integer(15));
		Assert.assertTrue(arrayPilha.size() == 1);
		Assert.assertEquals(arrayPilha.top(), new Integer(156));
	}

	@Test
	public void testTop() throws StackOverflowException, StackUnderflowException {
		arrayPilha.push(156);
		arrayPilha.push(15);
		arrayPilha.push(597);
		Assert.assertEquals(arrayPilha.top(), new Integer(597));

		arrayPilha.pop();
		Assert.assertEquals(arrayPilha.top(), new Integer(15));
	}

	@Test
	public void testSize() throws StackOverflowException {
		Assert.assertTrue(arrayPilha.size() == 0);

		arrayPilha.push(12);
		arrayPilha.push(10);
		arrayPilha.push(16);
		Assert.assertFalse(arrayPilha.size() == 0);
		Assert.assertTrue(arrayPilha.size() == 3);
	}

	@Test
	public void testIsEmpty() {
		Assert.assertTrue(arrayPilha.isEmpty());
	}
	
	@Test
	public void testIsFull() throws StackOverflowException {
		Assert.assertFalse(arrayPilha.isFull());
		
		/**
		 * Insere normalmente até o limite da pilha
		 */
		for (int i = 0; i < StackArray.capacidadeMax; i++) {
			arrayPilha.push(new Random().nextInt());
		}
		
		Assert.assertTrue(arrayPilha.isFull());
	}

	@Test(expected = StackOverflowException.class)
	public void testStackOverflowException() throws StackOverflowException {
		/**
		 * Insere normalmente até o limite da pilha
		 */
		for (int i = 0; i < StackArray.capacidadeMax; i++) {
			arrayPilha.push(new Random().nextInt());
		}

		/**
		 * Deve causar StackOverflowException. Pois excede o limite da pilha
		 */
		arrayPilha.push(159);
	}

	@Test(expected = StackUnderflowException.class)
	public void testStackUnderflowException() throws StackUnderflowException {
		arrayPilha.pop();
	}
}
