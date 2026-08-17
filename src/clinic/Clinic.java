/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinic;

import appointments.appointmentsList;
import appointments.Appointment;
import appointments.WaitingRoomList;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;
import patients.Patient;
import patients.PatientList;
/**
 *
 * @author Dario R
 */
public class Clinic {
    
    private PatientList patients;
    private appointmentsList appointments;
    private WaitingRoomList waitingRoom;
    
    public Clinic() {
        this.patients = new PatientList();
        this.appointments = new appointmentsList(new TreeSet<>());
        this.waitingRoom = new WaitingRoomList(new LinkedList<>());
    }
    public Clinic(PatientList Patient, appointmentsList appointments, WaitingRoomList waitingRoom) {
        this.patients = Patient;
        this.appointments = appointments;
        this.waitingRoom = waitingRoom;
    }
    
public boolean addPatient(Patient patient) {
    return patients.add(patient);    }

    public Patient findPatient(String id) {
         return patients.get(id);
    }

    public boolean removePatient(String id) {
         return patients.remove(id);
    }

    public Iterator<Patient> getPatients() {
        return patients.getALL();
    }

    public boolean scheduleAppointment(Appointment appointment) {
        return appointments.add(appointment);
    }

    public Appointment findAppointment(String code) {
        return appointments.get(code);
    }

    public boolean rescheduleAppointment(String code, LocalDate newDate, LocalTime newTime) {
        Appointment appointment = appointments.get(code);
        if (appointment == null) return false;
        appointment.reschedule(newDate, newTime);
        return true;
    }
    
    public boolean cancelAppointment(String code) {
        Appointment appointment = appointments.get(code);
        if (appointment == null) return false;
        appointment.cancel();
        return true;
    }
 
    public Iterator<Appointment> getAppointments() {
        
        return appointments.getALL();
    }

    public boolean checkInPatient(String patientId) {
             Patient patient = patients.get(patientId);
        if (patient == null) return false;
        return waitingRoom.add(patient);
    }
    
    public Patient getNextPatient() {
        return waitingRoom.get();
    }
    
    public Patient attendNextPatient() {
         Patient next = waitingRoom.get();
        if (next == null) return null;
        waitingRoom.remove();
        return next;
    }
    
    public int getWaitingPatientCount() {
        return waitingRoom.size();
    }

    public boolean isPatientWaiting(String patientId) {
         Iterator<Patient> it = waitingRoom.getALL();
        if (it == null) return false;
        while (it.hasNext()) {
            if (it.next().getId().equals(patientId)) return true;
        }
        return false;
    }
}