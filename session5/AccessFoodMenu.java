package session5;

public class AccessFoodMenu implements VegItem, NonVegItem{

	@Override
	public void fry() {
		System.out.println("fish fry,chicken fry");
		
	}

	@Override
	public void gravy() {
		System.out.println("chicken gravy,mutton gravy");
		
	}

	@Override
	public void breakfast() {
		System.out.println("dosa,idly,pongal");
		
	}

	@Override
	public void lunch() {
		System.out.println("rice,sambar,rasam");
			
	}
	public static void main(String[] args) {
		AccessFoodMenu afn = new AccessFoodMenu();
		afn.breakfast();
		afn.fry();
		afn.gravy();
		afn.lunch();
	}

}
