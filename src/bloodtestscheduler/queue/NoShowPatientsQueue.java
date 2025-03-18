/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler.queue;

import bloodtestscheduler.Patient;
import java.util.ArrayList;

/**
 *
 * @author vvtat
 */
public class NoShowPatientsQueue implements NoShowPatientsInterface{
    private ArrayList<Patient> theQueue;  // Declare ArrayList to store no-show patients
    private final int MAX_SIZE = 5;  // Maximum size of the queue

    // Constructor to initialize the queue
    public NoShowPatientsQueue() {
        theQueue = new ArrayList<>();
    }

    // Returns the size of the queue
    @Override
    public int size() {
        return theQueue.size();
    }

    // Checks if the queue is empty
    @Override
    public boolean isEmpty() {
        return theQueue.isEmpty();
    }

    // Adds a new no-show patient (enqueue operation)
    @Override
    public void enqueue(Patient patient) {
        if (theQueue.size() == MAX_SIZE) {
            theQueue.remove(0); // Remove the oldest no-show patient (shift elements left)
        }
        theQueue.add(patient);  // Add the new patient at the end
    }

    // Removes the first patient in the queue (dequeue operation)
    @Override
    public Patient dequeue() {
        if (!theQueue.isEmpty()) {
            return theQueue.remove(0);
        } else {
            return null;
        }
    }

    // Returns the front (oldest) patient in the queue without removing it
    @Override
    public Patient frontElement() {
        if (!theQueue.isEmpty()) {
            return theQueue.get(0);
        } else {
            return null;
        }
    }

    // Clears all elements from the queue
    public void clearAll() {
        if (!theQueue.isEmpty()) {
            theQueue.clear();
            System.out.println("Emptied out the queue.");
        } else {
            System.out.println("No one in the queue to empty.");
        }
    }

    // Displays the queue contents as a formatted string
    @Override
    public String displayQueue() {
        StringBuilder str = new StringBuilder();
        if (theQueue.isEmpty()) {
            str.append("Nothing in Queue");
        } else {
            for (int i = 0; i < theQueue.size(); i++) {
                str.append(theQueue.get(i));
                str.append(" \n ");
            }
        }
        return str.toString();
    }
}
