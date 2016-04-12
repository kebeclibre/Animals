
public class Rabbit extends Animal{
	
	public Rabbit(int... args) {
		super(args);
	}
	
	public boolean isTooHeavy(){
		return this.weight > 1;
	}
	
}
