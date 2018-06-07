package owe5a_vink3.pkg1;

/**
 *
 * @author karin
 */
public class Owe5a_vink31 {
    public static void main(String[] args) {
        Student student1 = new Student( "Jan", 756);
	Student student2 = new Student( "Kees", 236);
	Student student3 = new Student(767);
	Student student4 = new Student(113);
		
	System.out.println("Student 1 heet " + student1.getNaam() + ", en heeft studentnummer: " + student1.getStudentnr());
	System.out.println("Student 2 heet " + student2.getNaam() + ", en heeft studentnummer: " + student2.getStudentnr());
	System.out.println("Student 3 heeft studentnummer: " + student3.getStudentnr());
	System.out.println("Student 4 heeft studentnummer: " + student4.getStudentnr());
		
	student3.setStudentnr(909);

	System.out.println("\nStudent 3 heeft nu studentnummer: " + student3.getStudentnr());

	
	}

}

