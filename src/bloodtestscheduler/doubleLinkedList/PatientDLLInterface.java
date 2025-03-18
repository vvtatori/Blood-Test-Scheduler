/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestscheduler.doubleLinkedList;

import bloodtestscheduler.Patient;

/**
 *
 * @author vvtat
 */
public interface PatientDLLInterface {
    public boolean isEmpty();  //checks if the list is empty
    public int size();  //gives size of the liust
    public Patient getPatient(String name); //gets a specific patient from the list
    public void removePatient(String name); //removes a patient from the list
    public void addPatient(Patient patient); //adds a patient to the list
   
    public String printList();
}
