package programs;

public class variable {
	    int a = 25;
	    static int b = 50;
	    public static int print() {
	    	int mark = 95;
	    	return mark;
	    }
	    
	    void display() {
	    	int d = 60;
	    	System.out.println("method inside variable:"+d);
	    }
        public static void main(String[] args) {
        	int c = 75;
        	
        	variable obj1 = new variable();
        	System.out.println(obj1.a);
        	obj1.display();
        	System.out.println(b);
        	System.out.println(c);
        	System.out.println(print());
        	
        	variable2.show();
        	
        	variable2 v2 = new variable2();
        	v2.students();
			
		}
}
