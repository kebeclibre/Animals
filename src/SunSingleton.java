
public class SunSingleton {
	
	private static SunSingleton instance;
	
	private SunSingleton() {}
	
	public static SunSingleton getInstance() {
		if (instance == null) {
			return instance = new SunSingleton();}
		else{ 
			return instance; }
		}
}

