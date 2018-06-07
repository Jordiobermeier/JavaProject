
public class Main {
	
	private int randomgetal;
	
	RandomNumber randomnumber = new RandomNumber();
	
	public Main() {
		this.randomgetal = randomnumber.getRandomNumber();
		System.out.println(randomgetal);
	}
	
}
