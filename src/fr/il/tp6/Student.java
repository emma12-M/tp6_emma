package fr.il.tp6;

/**
 * Représente un étudiant avec un nom et un tableau de notes.
 */
public class Student {

	public String name; // nom de l'étudiant
	public int[] notes; // tableau de notes

	public Student(String name, int[] notes) {
		this.name = name;
		this.notes = notes;
	}
}
