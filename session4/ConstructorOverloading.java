package session4;

public class ConstructorOverloading {
       
		    private String empname;
		    private int empid;
		    private String location;    
		    	
		    public ConstructorOverloading(String empname, int empid, String location) {
		       this.empname = empname;
		       this.empid = empid;
		       this.location = location;
		    }
		     public ConstructorOverloading(String empname, String location) {
		    	 this(empname,0,location);
		     }
		     public ConstructorOverloading(String empname,int empid) {
		    	 this(empname,empid,null);
		     }
		     
		     public void displayInfo() {
		    	 System.out.println("empname: "+this.empname);
		    	 System.out.println("empid: "+this.empid);
		    	 System.out.println("location: "+this.location);
		     }
		       
		       public static void main(String[] args) {
		    	   ConstructorOverloading co = new ConstructorOverloading("Santa",938439,"MTP");
		    	   
		    	   ConstructorOverloading co1 = new ConstructorOverloading("Sumi",0,"CBE");
		    	   
		    	   ConstructorOverloading co2= new ConstructorOverloading("Kani",938439);
		    	   
		           co.displayInfo();
		           co1.displayInfo();
		           co2.displayInfo();
	}
}
