/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinic;

import appointments.appointmentsList;
import appointments.Appointment;
import appointments.WaitingRoomList;
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
        this.Patient = new PatientList();
        this.appointments = new appointmentsList(new TreeSet<>());
        this.waitingRoom = new WaitingRoomList(new LinkedList<>());

    public Clinic(PatientList Patient, appointmentsList appointments, WaitingRoomList waitingRoom) {
        this.Patients = Patient;
        this.appointments = appointments;
        this.waitingRoom = waitingRoom;
    }
    
public boolean addPatient(patients patient) {
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
        return appointments.get(code)
    }

    public boolean rescheduleAppointment(String code, LocalDate newDate, LocalTime newTime) {
        

    }

    public boolean cancelAppointment(String code) {
        

    }

    public Iterator<Appointment> getAppointments() {
        

    }

    public boolean checkInPatient(String patientId) {
            
    }

    public Patient getNextPatient() {
        waitingRoom.get();
    }

    public Patient attendNextPatient() {

    }

    public int getWaitingPatientCount() {
        return waitingRoom.size();
    }

    public boolean isPatientWaiting(String patientId) {

    }
    }
}
