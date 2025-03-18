/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler.doubleLinkedList;

import bloodtestscheduler.Patient;
import java.util.LinkedList;

/**
 *
 * @author vvtat
 */
public class MyPatientDLList implements PatientDLLInterface{
    private Node head;
    private Node last;
    private Node current;
    private int size;
    
    public MyPatientDLList() {
       
    }
    
    @Override
    public boolean isEmpty(){
        return (size == 0);
    }
    
    @Override
    public int size() {
        return size;
    }
    
    @Override
    public void addPatient(Patient patient){
        //create a new node for the new patient
        Node newNode = new Node(patient);
        if (head == null) { //if the list is empty
            head = last = newNode;  //new node is the head and also the last
        } else {
            last.setNext(newNode);   //adds the newNode
            newNode.setPrev(last);
            last = newNode;  //makes the new node the last
        }
        size++;
    }
    
    @Override
    public void removePatient(String name){
        if (head == null) { // Checking if list is empty
            System.out.println("List is empty. No patients to remove.");
            return; // Exiting if the list is empty
        }
        
        current = head;
        boolean patientFound = false;  //For tracking the deletion of a user
        
        while (current != null) {
            if (current.patient.getName().equalsIgnoreCase(name)) {  //checks if the name matches any name in the list
                //If there is only one itm in the list
                if(current == head && current == last){
                    head = null;
                    last = null;
                }
                //Removing the first item (head)
                else if (current == head) {
                    head = head.getNext();
                    head.setPrev(null);
                    //if (head != null) head.prev = null;
                } else if (current == last) {  //removing the last item (tail)
                    last = last.getPrev(); 
                    last.setNext(null);
                } else {  //removing an item within the list
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                size--;  //reduces the size of the list by 1 after removing the patients
                patientFound = true;  //patient found and removed
                return;
            }
            current = current.next;
        }   
        //Adding a message to indicate when the user was not found
        if(patientFound == false){
            System.out.println("Patient not found");
        }
    }
            
    @Override
    public Patient getPatient(String name){
        current = head; //starting from the first item in the list
        while (current != null) {
            if (current.patient.getName().equalsIgnoreCase(name)) {  //checks if the name matches any name in the list
                return current.patient;  //Return the found patient
            }
            current = current.next;
        }
        return null;
    }
   
    @Override
    public String printList(){
        StringBuilder str = new StringBuilder();
        current = head; //starting from the first item in the list:
        while (current != null) {
            str.append(current.getPatient().toString());
            str.append("\n"); // Append patient details
            current = current.next;
        }
        
        return str.toString();
    }
}
