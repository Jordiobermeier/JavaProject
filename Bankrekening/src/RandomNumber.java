
public class RandomNumber {

	private int randomNumber;
	
	public RandomNumber() {
		randomNumber = (int) (Math.random() * 10);
	}
	
	public int getRandomNumber() {
		return randomNumber;
	}
	
}
