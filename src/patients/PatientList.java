/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patients;

import clinic.KeyDynamicsLists;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author EMMAXZZ
 */
public class PatientList implements KeyDynamicsLists<Patient,String>{
    private HashMap<String,Patient> Patient;

    public PatientList() {
        this.Patient = new HashMap();
    }

    
    
    @Override
    public Patient get(String id) {
        if(!Patient.containsKey(id)) return null;
        return Patient.get(id);
    }

    @Override
    public boolean remove(String id) {
        return Patient.remove(id)!=null;
    }

    @Override
    public Iterator getALL() {
       if(Patient.isEmpty())return null;
        return Patient.values().iterator();
    }

    @Override
    public boolean add(Patient item) {
      if(Patient.containsKey(item.getId())) return false;
      return Patient.put(item.getId(),item)== null;
      
    }

    @Override
    public int size() {
       return Patient.size();
    }

    @Override
    public boolean isEmpty() {
        return Patient.isEmpty();
    }


}
