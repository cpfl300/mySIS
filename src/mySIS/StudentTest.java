package mySIS;

public class StudentTest extends junit.framework.TestCase{
	public void testCreate(){
		final String firseStudentName = "Jane Doe";
		final String secondStudentName = "Joe Blow";
		
		Student student = new Student(firseStudentName);
		assertEquals(firseStudentName, student.getName());
		
		Student secondStudent = new Student(secondStudentName);
		assertEquals(secondStudentName, secondStudent.getName());
		
		assertEquals(firseStudentName, student.getName());
	}

}
