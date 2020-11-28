
public class Driver {

	public static void main(String[] args) {
		
		// Creates students and assigns them to a course
		Student john = new Student("John", 20, "12/8/2000", 12343211, "Electronic & Computer Engineering");
		Student sean = new Student("Sean", 21, "10/10/1999", 35462714, "Computer Science");
		Student aoife = new Student("Aoife", 21, "9/7/1999", 48937268, "Computer Science");
		Student niamh = new Student ("Niamh", 20, "1/2/2000", 12389546, "Electronic & Computer Engineering");
		
		// Creates modules
		Module softwareEngineering = new Module("Software Engineering", "CT1234");
		Module programmingII = new Module("Programming II", "CT1848");
		
		Module digitalSystems = new Module("Digital Systems", "DS8278");
		Module electronicCircuitsAndSystems = new Module("Electronic Circuits and Systems", "EC5312");
		
		//Creates courses
		Course ece = new Course("Electronic & Computer Engineering", "28/09/2020", "04/06/2020");
		Course cs = new Course("Computer Science", "28/09/2020", "04/06/2020");
		
		// Adds the students to their respective course
		ece.addToStudentList(john.getName());
		ece.addToStudentList(niamh.getName());
		cs.addToStudentList(sean.getName());
		cs.addToStudentList(aoife.getName());
		

		
		
		// Adds modules for John and adds John to list of students for each module
		john.addModule(digitalSystems.getModuleName());
		john.addModule(electronicCircuitsAndSystems.getModuleName());
		digitalSystems.addStudent(john.getName());
		electronicCircuitsAndSystems.addStudent(john.getName());
		
		// Adds modules for Niamh and adds Niamh to list of students for each module
		niamh.addModule(digitalSystems.getModuleName());
		niamh.addModule(electronicCircuitsAndSystems.getModuleName());
		digitalSystems.addStudent(niamh.getName());
		electronicCircuitsAndSystems.addStudent(niamh.getName());
		
		// Adds modules for Sean and adds Sean to list of students for each module
		sean.addModule(programmingII.getModuleName());
		sean.addModule(softwareEngineering.getModuleName());
		digitalSystems.addStudent(sean.getName());
		electronicCircuitsAndSystems.addStudent(sean.getName());
		
		// Adds modules for Aoife and adds Aoife to list of students for each module
		aoife.addModule(programmingII.getModuleName());
		aoife.addModule(softwareEngineering.getModuleName());
		digitalSystems.addStudent(aoife.getName());
		electronicCircuitsAndSystems.addStudent(aoife.getName());
		
		
		
		
		// Adds courses to Module's linkedCourses ArrayList and adds modules to Course's listOfModules ArrayList
		digitalSystems.addLinkedCourses(ece.getCourseName());
		electronicCircuitsAndSystems.addLinkedCourses(ece.getCourseName());
		ece.addToModuleList(digitalSystems.getModuleName());
		ece.addToModuleList(electronicCircuitsAndSystems.getModuleName());
		
		programmingII.addLinkedCourses(cs.getCourseName());
		softwareEngineering.addLinkedCourses(ece.getCourseName());
		cs.addToModuleList(programmingII.getModuleName());
		cs.addToModuleList(softwareEngineering.getModuleName());
		
		// Assignment output
		System.out.println("Course: " + ece.getCourseName());
		System.out.println("    List of Modules: \n" + "        " + ece.getModuleList());
		System.out.println("    List of Students and Corresponding Info: " + john.toString());
		System.out.println(niamh.toString());
		System.out.println();
		System.out.println("Course: " + cs.getCourseName());
		System.out.println("    List of Modules: \n" + "        " + cs.getModuleList());
		System.out.println("    List of Students and Corresponding Info: " + aoife.toString());
		System.out.println(sean.toString());


		
		
	}
}