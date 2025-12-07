package fr.il.tp6;

public class StudentManager {

	public Student[] students;
	
	private double computeAverage(int[] grades)
	{
		if (grades.length == 0) return 0; // éviter division par zéro
		double Studentsum = 0;
		for (int gradesindex = 0;gradesindex < grades.length; gradesindex++) {
			Studentsum = Studentsum + grades[gradesindex];
		}
		return Studentsum / grades.length;
		
	}

	public StudentManager() {
		students = new Student[3];
		students[0] = new Student("Alice", new int[] { 12, 15, 9 });
		students[1] = new Student("Bob", new int[] { 8, 10 });
		students[2] = new Student("Charlie", new int[] { 14, 14, 13 });
	}

	public double classAverage() {

		double sumTotal = 0;
		int Totalnote=0;
		for (int student = 0; student < students.length; student++) {
			
			for (int note = 0; note < students[student].notes.length; note++) {
				sumTotal = sumTotal  + students[student].notes[note];
				Totalnote++;
			}
		}
		// moyenne de la classe
		if (Totalnote == 0) return 0; // éviter division par zéro
		return sumTotal / Totalnote; // bug : division par le nombre d'étudiants
	}

	public double bestAverage() {
		double bestAverage = 0;
		for (int i = 0; i < students.length; i++) {
			double avg=computeAverage( students[i].notes);
			if (avg > bestAverage) {
				bestAverage = avg;
			}
		}
		return  bestAverage;
	}

	public void printStudents() {
		System.out.println("Liste des étudiants :");
		for (int student = 0; student < students.length; student++) {
			System.out.println("- " + students[student].name);
			System.out.println("Notes :");
			for (int note = 0; note < students[student].notes.length; note++) {
				System.out.println(students[student].notes[note]);
			}
			System.out.println("Moyenne : " + computeAverage(students[student].notes));
			System.out.println("----------------");
		}
	}

	
}
