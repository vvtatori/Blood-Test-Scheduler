/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler.priorityQueue;

import bloodtestscheduler.Patient;
import java.util.PriorityQueue;

/**
 *
 * @author vvtat
 */
public class MyPatientPriorityQ implements PatientPriorityQInterface{
    private PriorityQueue<Patient> queue;  //declaring the priority queue of Patients

    public MyPatientPriorityQ() {
        this.queue = new PriorityQueue<>(new PatientComparator()); //initializes the queue
    }

    @Override
    public void enqueue(Patient patient) {
        queue.add(patient);  // Uses add() to add a patient to the Pqueue
    }

    @Override
    public Patient dequeue() {
        return queue.poll();  // Uses poll() to remove a patient from the Pqueue
    }

    public Patient peek() {
        return queue.peek();  //returns the patient at the front of the queue without removing them
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();  //checks if queue is empty
    }

    @Override
    public int size() {
        return queue.size();  //returns size of the queue
    }
    
    @Override
    public String printPQueue(){
        StringBuilder myPQ = new StringBuilder();
        System.out.println("The priority queue list is: " + "\n");
        if (queue.isEmpty()) {
            myPQ.append("No patients in the queue.");
        } else {
            for (Patient p : queue) {  //checks for every patient in the queue and appends it to the stringBuildert
                myPQ.append(p.toString()).append("\n");
            }
        }
        return myPQ.toString(); 
    }
}
