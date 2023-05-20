class ArrayBackwards {
	public static void main(String[] args ) {
		
		String[] names = {"Ed", "Edd", "Eddy"};

		for(int i = (names.length - 1); i >= 0; i--) {
			System.out.println(names[i]);
		}

	}

}