/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler.priorityQueue;

import bloodtestscheduler.Patient;
import java.util.Comparator;

/**
 *
 * @author vvtat
 */
public class PatientComparator implements Comparator<Patient>{
    @Override
    public int compare(Patient p1, Patient p2) {
        // Comparing by the Priority Level from the priorityLevel() method - for priority, urgent is first, then medium
        int priorityComparison = getPriorityLevel(p2.getPriority()) - getPriorityLevel(p1.getPriority());
        if (priorityComparison != 0) {  //If the difference is not 0, meaning it's not equal
            return priorityComparison;  // Higher priority is first
        }

        // Comparing by Age (Older patients first)
        int ageComparison = Integer.compare(p2.getAge(), p1.getAge());  //compares the age of two patients
        if (ageComparison != 0) {
            return ageComparison;  //the older age is first priority, if the age is not equal
        }

        // Comparing by Hospital Ward Status (Patients from the hospitalWard are first)
        if (p1.isFromHospitalWard() && !p2.isFromHospitalWard()) {
            return -1; // p1 has higher priority 
        } else if (!p1.isFromHospitalWard() && p2.isFromHospitalWard()) {
            return 1;  // p2 has higher priority
        }

        return 0; // If all conditions are the same
    }

    private int getPriorityLevel(String priority) {
        switch (priority.toLowerCase()) {
            case "urgent": return 3;
            case "medium": return 2;
            case "low": return 1;
            default: return 0;
        }
    }
}
