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
    public boolean isEmpty();
    public int size();
    public Patient getPatient(String name);
    public void removePatient(String name);
    public void addPatient(Patient patient);
   
    public void printList();
}
