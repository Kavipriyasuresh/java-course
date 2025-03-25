package session6;

public class ExceptionEx {
	
			String str1 = "hello";

			public void name() {

				try {

					int i = Integer.parseInt(str1);

					System.out.println("the value of converted string:"+str1);

				}catch(Exception e) {
					System.out.println(e.getMessage());

					e.printStackTrace();

				}

			}
			public static void main(String[] args) {

				ExceptionEx ee = new ExceptionEx();

				ee.name();

			}

		}

