package fr.il.tp6;

public class StudentApp { 
	 
    public static void main(String[] args) { 
        StudentManager m = new StudentManager(); 
 
        m.printStudents(); 
 
        System.out.println("Moyenne de la classe : " + m.classAverage()); 
        System.out.println("Meilleure moyenne : " + m.bestAverage()); 
    } 
}
