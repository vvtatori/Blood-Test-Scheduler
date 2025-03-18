/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestscheduler.queue;

import bloodtestscheduler.Patient;

/**
 *
 * @author vvtat
 */
public interface NoShowPatientsInterface {
    public int size();  //shows size of the queue
    public boolean isEmpty();  //checks if queue is empty
    public void enqueue(Patient patient);  //to add a patient object into the queue
    public Patient dequeue();  //to remove a patient object from the queue
    public Patient frontElement();  //to peek the first/oldest patient from the queue, does not remove the patient
    
    public String displayQueue();
}
