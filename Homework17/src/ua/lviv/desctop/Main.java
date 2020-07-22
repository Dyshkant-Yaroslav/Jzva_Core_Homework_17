package ua.lviv.desctop;

public class Main {

	public static void main(String[] args) {

		Integer[] arr = { 25, 66, 97, 236, 74, 1, 15 };
		Collection col = new Collection(arr);
		Iterator it = col.createForward();
		while (it.hasNext()) {
			System.out.println("Every unpaired element of array changed to 0 :" + it.next());
		}
		System.out.println();

		Integer[] arr1 = { 25, 66, 97, 236, 74, 1, 15 };
		Collection col1 = new Collection(arr1);
		Iterator it1 = col1.createBackward();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
		System.out.println();

		Integer[] arr2 = { 15, 45, 96, 33, 14, 18, 76, 154, 11, 239, 47 };
		Collection col2 = new Collection(arr2);
		Iterator annonymous = col2.createAnonymous();
		while (annonymous.hasNext()) {
			System.out.println(annonymous.next());
		}
		System.out.println();

		Integer[] arr3 = { 258, 784, 253, 147, 489, 56, 20121, 44777, 33, 15, 7896, 5456454, 51354 };
		Collection col3 = new Collection(arr3);
		Iterator local = col3.createLocal();
		while (local.hasNext()) {
			System.out.println(local.next());
		}
		System.out.println();

		Integer[] arr4 = { 45, 45654, 875, 873, 2454, 789, 11, 58, 46 };
		Collection col4 = new Collection(arr4);
		Iterator stat = col4.createStatic();
		while (stat.hasNext()) {
			System.out.println(stat.next());
		}

	}

}
