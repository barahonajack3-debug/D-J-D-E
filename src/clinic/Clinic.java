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
import patients.PatientList;
/**
 *
 * @author Dario R
 */
public class Clinic {
    
    private PatientList Patient;
    private appointmentsList appointments;
    private WaitingRoomList waitingRoom;

    public Clinic(PatientList Patient, appointmentsList appointments, WaitingRoomList waitingRoom) {
        this.Patient = Patient;
        this.appointments = appointments;
        this.waitingRoom = waitingRoom;
    }
    
public boolean addPatient(Patient patient) {
        
    }

    public Patient findPatient(String id) {
    }

    public boolean removePatient(String id) {
    }

    public Iterator<Patient> getPatients() {
    }

    public boolean scheduleAppointment(Appointment appointment) {
    }

    public Appointment findAppointment(String code) {
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

    }

    public Patient attendNextPatient() {

    }

    public int getWaitingPatientCount() {

    }

    public boolean isPatientWaiting(String patientId) {

    }
    }
}
