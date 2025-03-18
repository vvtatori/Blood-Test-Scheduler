/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

import bloodtestscheduler.priorityQueue.PatientComparator;

/**
 *
 * @author vvtat
 */
public class Patient implements Comparable<Patient> {
    private String name;
    private String priority; //Can either be "urgent", "medium", "low"
    private String detailsGP;
    private int age;
    private boolean fromHospitalWard;

    //Constructor to store the basic list of patients requesting for a test
    public Patient(String name, String priority, String detailsGP) {
        this.name = name;
        this.priority = priority;
        this.detailsGP = detailsGP;
    }

    //Constructor with all the fields required for the priority queue
    public Patient(String name, String priority, String detailsGP, int age, boolean fromHospitalWard) {
        this.name = name;
        this.priority = priority;
        this.detailsGP = detailsGP;
        this.age = age;
        this.fromHospitalWard = fromHospitalWard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getDetailsGP() {
        return detailsGP;
    }

    public void setDetailsGP(String detailsGP) {
        this.detailsGP = detailsGP;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isFromHospitalWard() {
        return fromHospitalWard;
    }

    public void setFromHospitalWard(boolean fromHospitalWard) {
        this.fromHospitalWard = fromHospitalWard;
    }

    //Comparing patients based on their priority, age, and isFromHospitalWard
    @Override
    public int compareTo(Patient other) {
        return new PatientComparator().compare(this, other);
    }
    
    @Override
    public String toString() {
        return "Patient{" + "name=" + name + ", priority=" + priority + ", detailsGP=" + detailsGP + ", age=" + age + ", fromHospitalWard=" + fromHospitalWard + '}';
    }
    
}
