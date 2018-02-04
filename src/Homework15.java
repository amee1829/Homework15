// Amee Stevenson
// Homework 1.5
// OOP

import java.util.Vector;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Collections;


public class Homework15 {
    static int counter = 0;

    public static void main(String[] args) {

        Vector<Integer> A_array = new Vector<Integer>();
        Vector<Integer> B_array = new Vector<Integer>();
        Vector<Integer> C_array = new Vector<Integer>();
        Vector<Integer> D_array = new Vector<Integer>();
        Vector<Integer> F_array = new Vector<Integer>();

        for (int x = 0; x < 25; x++) {
            // Random generator with range from 50 - 100
            int randomGr = ThreadLocalRandom.current().nextInt(50, 101);

            // Determining what letter grade the "randomGr" will go and assigning to its vector
            if ((randomGr >= 90) && (randomGr <= 100)) {
                counter++;
                A_array.addElement(randomGr);
            } else if ((randomGr >= 80) && (randomGr <= 89)) {
                counter++;
                B_array.addElement(randomGr);
            } else if ((randomGr >= 70) && (randomGr <= 79)) {
                counter++;
                C_array.addElement(randomGr);
            } else if ((randomGr >= 60) && (randomGr <= 69)) {
                counter++;
                D_array.addElement(randomGr);
            } else {
                counter++;
                F_array.addElement(randomGr);
            }
        }

        // Using Java class to do sorting using "java.util.Collections" class
        System.out.println("All scores assigned to A");
        sortGrades(A_array);

        System.out.println("All scores assigned to B");
        sortGrades(B_array);

        System.out.println("All scores assigned to C");
        sortGrades(C_array);

        System.out.println("All scores assigned to D");
        sortGrades(D_array);

        System.out.println("All scores assigned to F");
        sortGrades(F_array);

        System.out.println("The total number of grades is:  " + counter);
    }

    // Java has its own class to perform sorting functions called "Collections"
    public static void sortGrades(Vector<Integer> grade){
        Collections.sort(grade);
        for (int s = 0; s < grade.size(); s++) {
            System.out.println(grade.get(s));
        }
        System.out.println();
    }
}
