package fr.il.tp6;

public class StudentManager { 
	 
    public Student[] students; 
 
    public StudentManager() { 
        students = new Student[3]; 
        students[0] = new Student("Alice", new int[]{12, 15, 9}); 
        students[1] = new Student("Bob", new int[]{8, 10}); 
        students[2] = new Student("Charlie", new int[]{14, 14, 13}); 
    } 
 
    public double classAverage() { 
        int sum = 0; 
        for (int i = 0; i < students.length; i++) { 
            int s = 0; 
            for (int j = 0; j < students[i].notes.length; j++) { 
                s = s + students[i].notes[j]; 
            } 
            sum = sum + s; 
        } 
        // moyenne de la classe 
        return sum / students.length; // bug : division par le nombre d'étudiants 
    } 
 
    public int bestAverage() { 
        double best = 0; 
        for (int i = 0; i < students.length; i++) { 
            int s = 0; 
            for (int j = 0; j < students[i].notes.length; j++) { 
                s = s + students[i].notes[j]; 
            } 
            double avg = s / students[i].notes.length; // bug : division entière 
            if (avg > best) { 
                best = avg; 
            } 
        } 
        return (int) best; 
    } 
 
    public void printStudents() { 
        System.out.println("Liste des étudiants :"); 
        for (int i = 0; i < students.length; i++) { 
            System.out.println("- " + students[i].n); 
            System.out.println("Notes :"); 
            for (int j = 0; j < students[i].notes.length; j++) { 
                System.out.println(students[i].notes[j]); 
            } 
            System.out.println("Moyenne : " + average(students[i].notes)); 
            System.out.println("----------------"); 
        } 
    } 
 
    public double average(int[] t) { 
        int sum = 0; 
        for (int i = 0; i < t.length; i++) { 
            sum = sum + t[i]; 
        } 
        return sum / t.length; //  division entière 
    } 
}
