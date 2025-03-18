/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler.priorityQueue;

import bloodtestscheduler.Patient;
import java.util.ArrayList;

/**
 *
 * @author vvtat
 */
public class MyPatientPriorityQ implements PatientPriorityQInterface{
    public ArrayList<Patient> list;  // ArrayList to store patients in priority order
    private final PatientComparator comparator;  // Comparator to compare the patients based on priority, age, and hospital ward status
    
    public MyPatientPriorityQ() {
        this.list = new ArrayList<>();
        this.comparator = new PatientComparator();  // Initialize the comparator
    }

    @Override
    public void enqueue(Patient patient) {
        // Find the position where the patient should be inserted
        int insertPosition = findInsertPosition(patient);
        list.add(insertPosition, patient);  // Insert the patient at the correct position based on their priority
    }

    @Override
    public Patient dequeue() {
        if (!list.isEmpty()) {
            return list.remove(0);  // Remove the patient at the front (highest priority)
        }
        return null;  // Return null if the queue is empty
    }

    @Override
    public Patient peek() {
        if (!list.isEmpty()) {
            return list.get(0);  // Return the first patient (highest priority) without removing
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();  // Check if the list is empty
    }

    @Override
    public int size() {
        return list.size();  // Return the size of the list
    }

    @Override
    public String printPQueue() {
        StringBuilder myPQ = new StringBuilder();
        if (list.isEmpty()) {
            myPQ.append("No patients in the queue.");
        } else {
            System.out.println("The priority queue list is: " + "\n");
            for (Patient p : list) {
                myPQ.append(p.toString()).append("\n");
            }
        }
        return myPQ.toString();
    }

    // Finds the insert position in the ArrayList based on the comparator
    public int findInsertPosition(Patient patient) {
        // Loop through the list to find the correct insert position
        for (int i = 0; i < list.size(); i++) {
            // Compare the patient with the one at position i
            if (comparator.compare(patient, list.get(i)) < 0) {
                return i;  // If the patient's priority is higher, return the current position
            }
        }
        // If the patient has the lowest priority, add them at the end of the list
        return list.size();
    }

}
