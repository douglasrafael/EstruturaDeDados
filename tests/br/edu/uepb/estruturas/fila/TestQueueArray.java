package br.edu.uepb.estruturas.fila;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestQueueArray {
	private QueueArray<String> queue; 

	@Before
	public void init() {
		queue = new QueueArray<String>();
	}

	@Test
	public void testEnqueue() throws QueueOverflowException {
		queue.enqueue("A");
		queue.enqueue("B");
		queue.enqueue("C");
		Assert.assertTrue(queue.size() == 3);
	}
	
	@Test
	public void testDequeue() throws QueueUndeflowException, QueueOverflowException {
		queue.enqueue("A");
		queue.dequeue();
		Assert.assertTrue(queue.isEmpty());
		queue.enqueue("B");
		queue.enqueue("C");
		queue.enqueue("D");
		Assert.assertEquals(queue.dequeue(), new String("B"));
		Assert.assertEquals(queue.dequeue(), new String("C"));
		queue.dequeue();
		Assert.assertTrue(queue.isEmpty());
	}
	
	@Test
	public void testHead() throws QueueOverflowException {
		Assert.assertEquals(queue.head(), null);
		
		queue.enqueue("Eu sou a Cabeça!");
		queue.enqueue("B");
		queue.enqueue("C");
		queue.enqueue("D");
		queue.enqueue("E");
		Assert.assertEquals(queue.head(), new String("Eu sou a Cabeça!"));
	}
	
	@Test
	public void testSize() throws QueueOverflowException {
		Assert.assertTrue(queue.size() == 0);
		
		for(int i = 1; i <= QueueArray.capacidadeMax; i++) {
			queue.enqueue(new String("" + i));
		}
		//	System.out.println(queue);
		
		Assert.assertTrue(queue.size() == QueueArray.capacidadeMax);
	}
	
	@Test
	public void testIsEmpty() {
		Assert.assertTrue(queue.isEmpty());
	}
	
	@Test
	public void testIsFull() throws QueueOverflowException {
		Assert.assertFalse(queue.isFull());
		
		for(int i = 0; i < QueueArray.capacidadeMax; i++) {
			queue.enqueue(new String("" + i));
		}
		Assert.assertTrue(queue.isFull());
	}
}
