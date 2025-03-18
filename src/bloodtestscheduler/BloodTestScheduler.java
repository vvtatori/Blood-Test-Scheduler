/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloodtestscheduler;

import bloodtestscheduler.doubleLinkedList.MyPatientDLList;
import bloodtestscheduler.priorityQueue.MyPatientPriorityQ;

/**
 *
 * @author vvtat
 */
public class BloodTestScheduler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Testing PriorityQ
        //Patient Requests a Test
        Patient p1 = new Patient("Alice", "urgent", "Dr. Smith");
        Patient p2 = new Patient("Bob", "medium", "Dr. Lee");

        //they enter the priority queue with additional details
        Patient scheduledP1 = new Patient(p1.getName(), p1.getPriority(), p1.getDetailsGP(), 70, true);
        Patient scheduledP2 = new Patient(p2.getName(), p2.getPriority(), p2.getDetailsGP(), 60, false);

        //Add to Priority Queue
        MyPatientPriorityQ scheduler = new MyPatientPriorityQ();
        scheduler.enqueue(scheduledP1);
        scheduler.enqueue(scheduledP2);

        System.out.println(scheduler.printPQueue());
        
        //Testing DDL for patients added 
        MyPatientDLList patientList = new MyPatientDLList();
        // Adding patients
        patientList.addPatient(new Patient("Alice", "urgent", "Dr. Smith"));
        patientList.addPatient(new Patient("Bob", "medium", "Dr. Lee"));
        patientList.addPatient(new Patient("Charlie", "low", "Dr. Green"));
        
        // Display all patients
        System.out.println("Patients requesting a test:");
        patientList.printList();
        
        // Remove a patient
        patientList.removePatient("Bob");
        
        // Display after removal
        System.out.println("\nAfter removing Bob:");
        patientList.printList();
        
        //Getting a patient from the list
        System.out.println("\n" + patientList.getPatient("Alice"));
       // patientList.getPatient("Alice");
    }
    
}
