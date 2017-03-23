package Class_to_Hold_Objects_59;

public class DogList {
	private Dog[] thelist = new Dog[5];
	private int i = 0;
	
	public void add(Dog d) {
		if(i < thelist.length) {
			thelist[i] = d;
			System.out.println("Dog added at index " + i);
		}
		
		else
			System.out.println("Cannot add dog to list. List is full.");
	}
}
