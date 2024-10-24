package com.coderscampus.assignment7;

public class ArrayListApp {

	public static void main(String[] args) {
		CustomList<String> myCustomList = new CustomArrayList<>();

		for (int i = 1; i <= 100; i++) {
			myCustomList.add(String.valueOf(i));
		}

		System.out.println("Initial list:");
		printArrayList(myCustomList);

		myCustomList.add(1, "Insert");
		System.out.println("\nAfter adding 'Insert' at index 1:");
		printArrayList(myCustomList);

		myCustomList.add(0, "First");
		System.out.println("\nAfter adding 'First' at index 0:");
		printArrayList(myCustomList);

		myCustomList.add(myCustomList.getSize(), "Last");
		System.out.println("\nAfter adding 'Last' at the end:");
		printArrayList(myCustomList);

		try {
			myCustomList.add(myCustomList.getSize() + 1, "Out of Bounds");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("\nException caught: " + e.getMessage());
		}
		
		myCustomList.remove(0);
		System.out.println("\nAfter removing item at index :0");
		printArrayList(myCustomList);
		
		myCustomList.remove(1);
		System.out.println("\nAfter removing item at index :0");
		printArrayList(myCustomList);
		
		myCustomList.remove(myCustomList.getSize() - 1);
		System.out.println("\nAfter removing item at index :0");
		printArrayList(myCustomList);
		
		try {
            myCustomList.remove(myCustomList.getSize());  // Invalid index
        } catch (IndexOutOfBoundsException e) {
            System.out.println("\nException caught: " + e.getMessage());
        }
		
	}

	private static void printArrayList(CustomList<String> myCustomList) {
		for (int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println("Index " + i + ": " + myCustomList.get(i));
		}

	}

}
