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
    }
    
    @Override
    public void removePatient(String name){
        current = head;
        while (current != null) {
            if (current.patient.getName().equalsIgnoreCase(name)) {  //checks if the name matches any name in the list
                //Removing the first item (head)
                if (current == head) {
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
                return;
            }
            current = current.next;
            size--;  //reduces the size of the list by 1 after removing the patients
        }    
    }
            
    @Override
    public Patient getPatient(String name){
        current = head; //starting from the first item in the list
        while (current != null) {
            if (current.patient.getName().equalsIgnoreCase(name)) {  //checks if the name matches any name in the list
                return current.patient;
            }
            current = current.next;
        }
        return null;
    }
   
    @Override
    public void printList(){
        current = head; //starting from the first item in the list:
        while (current != null) {
            System.out.println(current.getPatient());
            current = current.next;
        }
    }
}
