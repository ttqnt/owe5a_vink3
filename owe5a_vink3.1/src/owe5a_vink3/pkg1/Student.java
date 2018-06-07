package owe5a_vink3.pkg1;

/**
 *
 * @author karin
 */
public class Student {
    private String naam;
    private int studentnr;
	
    //constructor
    public Student(int studentnr){
        this.studentnr = studentnr;
    }
    //constructor (overload)
    public Student(String naam, int studentnr){
	this.naam = naam;
	this.studentnr = studentnr;
    }
	
    public String getNaam(){
	return naam;
    }
	
    public void setNaam(String naam){
	this.naam = naam;
    }
	
    public int getStudentnr(){
        return studentnr;
    }
	
    public void setStudentnr(int studentnr){
	this.studentnr = studentnr;
    }
    
}
