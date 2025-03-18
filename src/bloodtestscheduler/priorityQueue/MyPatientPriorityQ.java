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
    private PriorityQueue<Patient> queue;

    public MyPatientPriorityQ() {
        this.queue = new PriorityQueue<>(new PatientComparator());
    }

    @Override
    public void enqueue(Patient patient) {
        queue.add(patient);  // Uses add() 
    }

    @Override
    public Patient dequeue() {
        return queue.poll();  // Uses poll() 
    }

    public Patient peek() {
        return queue.peek();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public int size() {
        return queue.size();
    }
    
    @Override
    public String printPQueue(){
        StringBuilder myPQ = new StringBuilder("The priority queue list is: " + "\n");
        
        if (queue.isEmpty()) {
            myPQ.append("No patients in the queue.");
        } else {
            for (Patient p : queue) {
                myPQ.append(p.toString()).append("\n");
            }
        }
        return myPQ.toString(); //Add content
    }
}
