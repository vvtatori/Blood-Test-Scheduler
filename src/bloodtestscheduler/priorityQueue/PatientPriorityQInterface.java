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
    public void enqueue(Patient patient);
    public int size();
    public boolean isEmpty();
    public Patient dequeue();
    
    public String printPQueue();
}
