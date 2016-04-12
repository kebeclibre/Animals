
public class Animal {
	protected int weight;
	protected int size;
	
	public Animal(int... args) {
		this.weight = args [0];
		this.size = args[1];
	}
	
	public boolean isTooHeavy() {
		return weight > size-10;
	}
	
	public String toString() {
		String weightStat = (this.isTooHeavy())?"I need to go and see the Weightwatchers":"I’m not Fat !";
		
		return "I'm a "+this.getClass().getSimpleName()+" and "+weightStat;
	}
	
	private int bMI() {
		return (int) weight / (size * size);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Animal))
			return false;
		Animal other = (Animal) obj;
		return this.bMI() == other.bMI();
	}
}

