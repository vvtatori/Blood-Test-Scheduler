/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestscheduler.queue;

import bloodtestscheduler.Patient;

/**
 *
 * @author vvtat
 */
public interface NoShowPatientsInterface {
    public int size();
    public boolean isEmpty();
    public void enqueue(Patient patient);
    public Patient dequeue();
    public Patient frontElement();
}
