/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestscheduler.priorityQueue;

import bloodtestscheduler.Patient;

/**
 *
 * @author vvtat
 */
public interface PatientPriorityQInterface {
    public void enqueue(Patient patient);  //to add a patient
    public int size();  //gives the size of the PQ
    public boolean isEmpty(); //Cchecks if the queue is empty
    public Patient dequeue();  //removes a patient object from the queue
    public Patient peek();
    
    public String printPQueue();
}
