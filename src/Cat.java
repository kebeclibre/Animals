
public class Cat extends Animal{
	
	public Cat(int... args) {
		super(args);
	}
	
	public boolean isTooHeavy() {
		return weight > size;
	}
}
