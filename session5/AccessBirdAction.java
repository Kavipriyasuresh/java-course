package session5;

public class AccessBirdAction extends Bird implements Flyable {

	
	public void fly() {
		System.out.println("bird flys..");	
		}
		public static void main(String[] args) {
			AccessBirdAction aba = new AccessBirdAction();
			aba.eat();
			aba.fly();
		}

	}                                                                                                                                                                                                                                    
