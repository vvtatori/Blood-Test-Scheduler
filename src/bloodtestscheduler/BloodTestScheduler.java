/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloodtestscheduler;

import bloodtestscheduler.doubleLinkedList.MyPatientDLList;
import bloodtestscheduler.priorityQueue.MyPatientPriorityQ;
import bloodtestscheduler.queue.NoShowPatientsQueue;

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
        //Patient Requests a Test, creating patient objects
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
        //Creating the list
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
       
       //Testing the Queue to store the patient No shows
       //creating the queue
       NoShowPatientsQueue noShowQueue = new NoShowPatientsQueue();
       
       // adding 5 no-shows to the queue
        noShowQueue.enqueue(new Patient("Patient 1", "Urgent", "Dr. Smith"));
        noShowQueue.enqueue(new Patient("Patient 2", "Medium", "Dr. Josh"));
        noShowQueue.enqueue(new Patient("Patient 3", "Low", "Dr. Sam"));
        noShowQueue.enqueue(new Patient("Patient 4", "Urgent", "Dr. John"));
        noShowQueue.enqueue(new Patient("Patient 5", "Medium", "Dr. Lee"));

        //displaying the 5
        System.out.println("After 5 no-shows:");
        System.out.println(noShowQueue.displayQueue());
        
        // Adding a new 6th no-show to check if it correctly tracks only the last 5
        noShowQueue.enqueue(new Patient("Patient 6", "Low", "Dr. Sam")); // This should remove "Patient 1"
        
        System.out.println("After adding 6th no-show:");
        System.out.println(noShowQueue.displayQueue());
        
        
    }
    
}
