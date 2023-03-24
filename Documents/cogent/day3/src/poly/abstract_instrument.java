package poly;

public abstract class abstract_instrument {
	
	abstract void play();
}

class Piano extends abstract_instrument{
	@Override
	void play() {
		System.out.println("Piano is playing tan tan tan tan");
	}
}

class Flute extends abstract_instrument{
	@Override
	void play() {
		System.out.println("Flute is playing toot toot toot toot");
	}
}

class Guitar extends abstract_instrument{
	@Override
	void play() {
		System.out.println("Guitar is playing tin tin tin");
	}
}