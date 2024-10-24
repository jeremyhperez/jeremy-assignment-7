package com.coderscampus.assignment7;

public class CustomArrayList<T> implements CustomList<T> {
	private static final Object item = null;
	Object[] items = new Object[10];
	int size = 0;
	int index;

	@Override
	public boolean add(T item) {
		if (items.length == size) {
			expandBackingObjectArray();
		}
		items[size++] = item;
		return true;
	}

	private void expandBackingObjectArray() {
		Object[] oldArray = items;
		items = new Object[size * 2];
		for (int i = 0; i < oldArray.length; i++) {
			items[i] = oldArray[i];
		}
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public T get(int index) {
		return (T) items[index];
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		if (index < 0 || index > size()) {
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
		}
		if (getSize() == items.length) {
			expandBackingObjectArray();
		}
		for (int i = getSize(); i > index; i--) {
			items[i] = items[i - 1];
		}
		items[index] = item;
		size++;
		return true;
	}

	private int size() {
		return size;
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {

		if (index < 0 || index >= getSize()) {
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds.");
		}
		T removedItem = (T) items[index];
		for (int i = index; i < getSize() - 1; i++) {
			items[i] = items[i + 1];
		}
		items[getSize() - 1] = null;
		size--;
		return removedItem;
	}

}