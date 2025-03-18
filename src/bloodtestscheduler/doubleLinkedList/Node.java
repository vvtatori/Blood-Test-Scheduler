/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler.doubleLinkedList;

import bloodtestscheduler.Patient;

/**
 *
 * @author vvtat
 */
public class Node {
    Patient patient;
    Node next;
    Node prev;
    Node current;

    public Node(Patient patient) {
        this.patient = patient;
        this.next = null;
        this.prev = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getCurrent() {
        return current;
    }

    public void setCurrent(Node current) {
        this.current = current;
    }

    
    public Patient getPatient() {
        return patient;
    }
}
