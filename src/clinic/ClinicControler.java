/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinic;

import appointments.Appointment;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Iterator;
import patients.Patient;

/**
 *
 * @author Usuario
 */
public class ClinicControler {
    private Clinic clinic;
    private Views view;
    private static ClinicControler controller;
    
    public static ClinicControler getInstance(Views view){
        if(controller==null)
            controller=new ClinicControler(view);
        return controller;
    }

    public void setView(Views view) {
        this.view = view;
    }

    public ClinicControler( Views view) {
        this.clinic = new Clinic();
        this.view = view;
    }
    
    public void addPatient(Patient patient){
        boolean status = clinic.addPatient(patient);
        if (status){
            view.showMessage("El paciente se agrego correctamente");
        }else{
            view.showMessage("no sen pudo agregar el paciente");
        }
    }

    public Patient findPatient(String id){
        Patient patient = clinic.findPatient(id);
        if(patient == null){
            view.showError("No encontramos un paciente con su id");
            view.clear();
            return null;
        }
        view.showData(patient);
        return patient;
    }

    public void removePatient(String id){
        boolean status =clinic.removePatient(id);
        if (status){
            view.showMessage("El paciente ha sido eliminado");
        }else{
            view.showError("El paciente no se pudo eliminar");
        }
    }

    public Iterator<Patient> getPatients(){
        return clinic.getPatients();
    }

    public boolean scheduleAppointment(Appointment appointment){
        boolean status=clinic.scheduleAppointment(appointment);
        if(status){
            view.showMessage("cita agendada correctamente");
        }else{
            view.showError("no se pudo agendar la cita");
        }
        return status;
    }

    public Appointment findAppointment(String code){
        Appointment appo = clinic.findAppointment(code);
        if (appo==null){
            view.showError("No se encuentra una cita con el codigo agregado");
        view.clear();
        }
        view.showData(appo);
        return appo;
    }

    public boolean rescheduleAppointment(String code, LocalDate newDate, LocalTime newTime){
        boolean status=clinic.rescheduleAppointment(code, newDate, newTime);
        if (clinic.rescheduleAppointment(code, newDate, newTime)){
         view.showMessage("La cita se ha reagendado correctamente");
        }else{
            view.showError("No se pudo reagendar la cita");
        }
        return false;
    }

    public boolean cancelAppointment(String code){
        boolean status = clinic.cancelAppointment(code);
        if (status){
            view.showMessage("La cita se cancelado");
        }else{
            view.showError("No se puede cancelar la cita");
        }
        return status;
    }

    public Iterator<Appointment> getAppointments(){
        return clinic.getAppointments();
    }

    public boolean checkInPatient(String patientId){
        boolean status = clinic.checkInPatient(patientId);
        if (status){
            view.showData("Paciente ingresado a la sala de espera");
        }else{
            view.showError("No se pudo ingresar el paciente a la sala de espera");
        }
        return status;
    }

    public Patient getNextPatient(){
        Patient patient = clinic.getNextPatient();
        if (patient == null){
            view.showError("No hay paciente en sla de espera");
        }
        return patient;
    }

    public Patient attendNextPatient(){
        Patient patient = clinic.attendNextPatient();
        if (patient == null ){
            view.showError("No hay paciente en la sala de espera" + patient.getFullName());
        }
        return patient;
    }

    public int getWaitingPatientCount(){
        return clinic.getWaitingPatientCount();
    }

    public boolean isPatientWaiting(String patientId){
        return clinic.isPatientWaiting(patientId);
    }
}
