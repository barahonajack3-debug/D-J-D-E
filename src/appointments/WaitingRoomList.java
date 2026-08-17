/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appointments;

import clinic.SequentialDynamicsList;
import java.util.LinkedList;
import java.util.Queue;
import patients.Patient;

/**
 *
 * @author Dario R
 */
public class WaitingRoomList implements SequentialDynamicsList<Patient> {
   Queue<Patient> waitingList;

    public WaitingRoomList(Queue<Patient> waitingList) {
        this.waitingList = new LinkedList();
    }

    @Override
    public Patient get() {
        return waitingList.peek();
    }

    @Override
    public boolean remove() {
       return waitingList.poll()!= null;
    }
    
    @Override
    public boolean add(Patient item) {
      try 
        return waitingList.add(item);
    } catch (IllegalStateException e){
        
    }return false;

    @Override
    public int size() {
        return waitingList.size();
    }

    @Override
    public boolean isEmpty() {
        return waitingList.isEmpty();
    }
   
   
}
