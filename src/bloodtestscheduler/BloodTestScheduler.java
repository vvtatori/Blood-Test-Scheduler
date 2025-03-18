/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloodtestscheduler;

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
        Patient p1 = new Patient("Alice", "urgent", "Mr. Smith");
        Patient p2 = new Patient("Bob", "medium", "Mr. Lee");

        //they enter the priority queue with additional details
        Patient scheduledP1 = new Patient(p1.getName(), p1.getPriority(), p1.getDetailsGP(), 70, true);
        Patient scheduledP2 = new Patient(p2.getName(), p2.getPriority(), p2.getDetailsGP(), 60, false);

        //Add to Priority Queue
        MyPatientPriorityQ scheduler = new MyPatientPriorityQ();
        scheduler.enqueue(scheduledP1);
        scheduler.enqueue(scheduledP2);

        System.out.println(scheduler.printPQueue());
    }
    
}
