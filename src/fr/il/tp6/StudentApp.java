package fr.il.tp6;

public class StudentApp {

	public static void main(String[] args) {
		StudentManager classe = new StudentManager();

		classe.printStudents();

		System.out.println("Moyenne de la classe : " + classe.classAverage());
		System.out.println("Meilleure moyenne : " + classe.bestAverage());
	}
}
