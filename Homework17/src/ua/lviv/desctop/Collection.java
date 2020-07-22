package ua.lviv.desctop;

public class Collection {

	private static Integer[] arr;

	Collection(Integer[] arr) {
		this.arr = arr;
	}

	public class Forward implements Iterator {

		private int count = 0;

		@Override
		public boolean hasNext() {

			return count < arr.length;

		}

		@Override
		public Object next() {

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % 2 == 1) {
					arr[i] = 0;
				}
			}
			return arr[count++];
		}
	}

	public Forward createForward() {
		return new Forward();
	}

	public class Backward implements Iterator {
		private int count = 0;

		@Override
		public boolean hasNext() {

			return count >= 0;
		}

		@Override
		public Object next() {
			for (int i = arr.length - 1; i >= 0; i = i - 2) {
				System.out.println("Value of array with step in one  = " + arr[i]);

			}

			System.out.print("The first element from array is: ");

			return arr[count--];

		}
	}

	public Backward createBackward() {
		return new Backward();
	}

	public Iterator createAnonymous() {

		return new Iterator() {
			private int count = 0;

			@Override
			public boolean hasNext() {

				return count >= 0;
			}

			@Override
			public Object next() {
				for (int i = arr.length - 1; i >= 0; i = i - 3) {
					if (arr[i] % 2 == 1) {
						System.out.println("Every third unpaired element = " + arr[i]);
					}

				}
				System.out.print("The first element from array: ");
				return arr[count--];
			}

		};

	}

	public Iterator createLocal() {
		class Local implements Iterator {
			int count = arr.length - 1;

			@Override
			public boolean hasNext() {

				return count < arr.length;
			}

			@Override
			public Object next() {
				for (int i = 0; i < arr.length; i = i + 5) {
					if (arr[i] % 2 == 0) {
						Integer integer = arr[i] - 100;
						System.out.println("Every fifth element of array -100 : " + integer);
					}
				}
				System.out.print("The last element of array : ");
				return arr[count++];
			}

		}
		return new Local();
	}

	private static class Static implements Iterator {
		int count = arr.length - 1;

		@Override
		public boolean hasNext() {

			return count < arr.length;
		}

		@Override
		public Object next() {
			for (int i = 0; i < arr.length; i = i + 2) {
				if (arr[i] % 2 == 0) {
					arr[i] = 5;

				}
				System.out.println("Every second paired element of array changet to 5: " + arr[i]);
			}
			System.out.print("The last element of array : ");
			return arr[count++];
		}

	}

	public Static createStatic() {
		return new Static();
	}

}
