
package com.java;

abstract class main {
	public abstract void animalfood();

	public void goat() {
		System.out.println("iam goat");
	}
}

class food extends main {
	@Override
	public void animalfood() {
		System.out.println("i eat only vegiess");
	}
}

class abstracts {
	public static void main(String[] args) {
		food obj = new food();
		obj.goat();
		obj.animalfood();
	}
}
