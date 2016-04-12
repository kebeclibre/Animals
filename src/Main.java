
public class Main {

	public static void main(String[] args) {
		Cat cat = new Cat(15,30);
		Fish fish = new Fish(15,30);
		Rabbit rabbit = new Rabbit(2,6);
		System.err.println(cat.equals(fish));
		System.out.println(cat);
		System.out.println(fish);
		System.out.println(rabbit);
		
		for (int i = 0; i< 15; i++) {
			SunSingleton sun = SunSingleton.getInstance();
			SunSingleton tatooine = SunSingleton.getInstance();
			
			if (sun==tatooine) {
				System.out.println("meme memoire");}
			else{System.out.println("echec");
			}
		
		}
		
		
	
	}

}
