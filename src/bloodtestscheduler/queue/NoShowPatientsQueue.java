/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler.queue;

import java.util.ArrayList;

/**
 *
 * @author vvtat
 */
public class NoShowPatientsQueue {
    private ArrayList<String> theQueue;  // Declare ArrayList to store no-show patients
    private final int MAX_SIZE = 5;  // Maximum size of the queue

    // Constructor to initialize the queue
    public NoShowPatientsQueue() {
        theQueue = new ArrayList<>();
    }

    // Returns the size of the queue
    public int size() {
        return theQueue.size();
    }

    // Checks if the queue is empty
    public boolean isEmpty() {
        return theQueue.isEmpty();
    }

    // Adds a new no-show patient (enqueue operation)
    public void enqueue(String patientName) {
        if (theQueue.size() == MAX_SIZE) {
            theQueue.remove(0); // Remove the oldest no-show patient (shift elements left)
        }
        theQueue.add(patientName);  // Add the new patient at the end
    }

    // Removes the first patient in the queue (dequeue operation)
    public String dequeue() {
        if (!theQueue.isEmpty()) {
            return theQueue.remove(0);
        } else {
            return "Queue is empty.";
        }
    }

    // Returns the front (oldest) patient in the queue without removing it
    public String frontElement() {
        if (!theQueue.isEmpty()) {
            return theQueue.get(0);
        } else {
            return "Queue is empty.";
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
    public String displayQueue() {
        StringBuilder str = new StringBuilder();
        if (theQueue.isEmpty()) {
            str.append("Nothing in Queue");
        } else {
            for (int i = 0; i < theQueue.size(); i++) {
                str.append(theQueue.get(i));
                str.append(" ; ");
            }
        }
        return str.toString();
    }
}
