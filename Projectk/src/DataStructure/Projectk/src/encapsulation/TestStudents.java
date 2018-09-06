package encapsulation;

public class TestStudents {

	public static void main(String[] args) {
Students st1 = new Students();
st1.setStName("Ruby Sager");
st1.setStID(100);
st1.setDob("08-11-1980");
st1.setGrade("B+");	
	
System.out.println(st1.getStName()+"" + st1.getStID()+ ""+ st1.getDob()+ ""+ st1.getGrade());
	
	
Students st2 = new Students();
st2.setStName("jay z");
st2.setStID(101);
st2.setDob("03-09-1978");
st2.grade= "A";
	
System.out.println(st2.getStName()+"" + st2.getStID()+ ""+ st2.getDob()+ ""+ st2.getGrade());
	
	
	}

}
