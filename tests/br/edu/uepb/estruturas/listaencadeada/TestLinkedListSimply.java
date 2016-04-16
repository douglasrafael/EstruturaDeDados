package br.edu.uepb.estruturas.listaencadeada;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestLinkedListSimply {
	private LinkedListSimply<String> listaEncadeada;  
	
	@Before
	public void init() {
		listaEncadeada = new LinkedListSimply<String>();
	}

	@Test
	public void testIsEmpty() {
		Assert.assertTrue(listaEncadeada.isEmprty());
		
		listaEncadeada.insert("A");
		Assert.assertFalse(listaEncadeada.isEmprty());
	}
	
	@Test
	public void testSize() {
		Assert.assertTrue(listaEncadeada.size() == 0);
		
		insertElements();
		Assert.assertTrue(listaEncadeada.size() != 0);
		Assert.assertTrue(listaEncadeada.size() == 4);
	}
	
	@Test
	public void testinsert() {
		insertElements();
		
		System.out.println("Insert: " + listaEncadeada);
		Assert.assertTrue(listaEncadeada.size() == 4);
	}
	
	@Test
	public void testSearch() {
		insertElements();
		
		Assert.assertEquals(listaEncadeada.search(new String("B")), new String("B"));
		Assert.assertEquals(listaEncadeada.search(new String("NAO EXISTO")), null);
		Assert.assertTrue(listaEncadeada.search(new String("A")) != new String("C"));
	}
	
	@Test
	public void testRemove() {
		insertElements();
		listaEncadeada.remove(new String("B"));
		System.out.println("Remove: B > " + listaEncadeada);
		
		listaEncadeada.remove(new String("A"));
		listaEncadeada.remove(new String("C"));
		listaEncadeada.remove(new String("D"));
		System.out.println("Remove: A, C, D > " + listaEncadeada);
		
		Assert.assertTrue(listaEncadeada.size() == 0);
		
		insertElements();
		listaEncadeada.remove(new String("C"));
		listaEncadeada.remove(new String("D"));
		Assert.assertTrue(listaEncadeada.size() == 2);
		System.out.println("Remove: C, D > " + listaEncadeada);
	}
	
	@Test
	public void testToArray() {
		listaEncadeada.insert(new String("fui inserido 1°"));
		listaEncadeada.insert(new String("fui inserido 2°"));
		
		Object[] o = new Object[listaEncadeada.size()];
		o = listaEncadeada.toArray();
//		System.out.println("TAMANHO: " + o.length);
		
		Assert.assertTrue(o.length == 2);
		
		System.out.println("toArray: " + listaEncadeada);
	}
	
	/**
	 * Insere 4 elementos na lista
	 */
	private void insertElements() {
		listaEncadeada.insert(new String("A"));
		listaEncadeada.insert(new String("B"));
		listaEncadeada.insert(new String("C"));
		listaEncadeada.insert(new String("D"));
	}
}
