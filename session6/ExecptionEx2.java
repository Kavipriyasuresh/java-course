package session6;

public class ExecptionEx2 {
	public static void main(String[] args) {
		try {
			System.out.println("trying to divide by 0..");
			int res = 10/10;
			System.out.println("result:"+res);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
	}

}
