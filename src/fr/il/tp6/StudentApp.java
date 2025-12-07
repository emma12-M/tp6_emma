package fr.il.tp6;

/**
 * affiche la moyenne d'une classe classe 
 * et la meilleure moyenne d'un élève de cette classe
 */
public class StudentApp {

	public static void main(String[] args) {
		StudentManager classe = new StudentManager();

		classe.printStudents();

		System.out.println("Moyenne de la classe : " + classe.classAverage());
		System.out.println("Meilleure moyenne : " + classe.bestAverage());
	}
}
