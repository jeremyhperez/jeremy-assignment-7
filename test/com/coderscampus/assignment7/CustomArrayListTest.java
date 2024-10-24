package com.coderscampus.assignment7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	@Test
	void should_add_one_item_to_list() {
		CustomList<Integer> sut = new CustomArrayList<>();
		sut.add(10);
		Integer expectedResult = sut.get(0);
		Integer expectedSize = sut.getSize();
		assertEquals(10, expectedResult);
		assertEquals(1, expectedSize);
	}

	@Test
	void should_add_21_items_to_list() {
		CustomList<Integer> sut = new CustomArrayList<>();
		for (int i = 1; i < 22; i++) {
			sut.add(i);
		}
		for (int i = 0; i < 21; i++) {
			assertEquals(i + 1, sut.get(i));
		}
		assertEquals(21, sut.getSize());
	}

	@Test
	void should_add_element_at_specific_index() {
		CustomList<Integer> sut = new CustomArrayList<>();
		sut.add(0, 1);
		sut.add(1, 2);
		assertTrue(sut.add(1, 99));
		assertEquals(1, sut.get(0));
		assertEquals(99, sut.get(1));
		assertEquals(2, sut.get(2));
	}
	
	@Test
	void should_remove_element_at_specific_index() {
		CustomList<Integer> sut = new CustomArrayList<>();
		sut.add(0, 1);
		sut.add(1, 2);
		sut.add(2, 3);
		sut.remove(1);
		assertEquals(3, sut.get(1));
	}

}
