package encapsulation;

public class TestStudents {

	public static void main(String[] args) {
Students st1 = new Students();
st1.setStName("Stephen Hawking");
st1.setStID(100);
st1.setDob("01-08-1942");
st1.setGrade("A+");	
	
System.out.println(st1.getStName()+"" + st1.getStID()+ ""+ st1.getDob()+ ""+ st1.getGrade());
	
	
Students st2 = new Students();
st2.setStName("Albert Camus");
st2.setStID(101);
st2.setDob("09-07-1913");
st2.grade= "C";
	
System.out.println(st2.getStName()+"" + st2.getStID()+ ""+ st2.getDob()+ ""+ st2.getGrade());
	
	
	}

}
