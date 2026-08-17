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

    }

    public void findPatient(String id){
        
    }

    public void removePatient(String id){
        
    }

    public Iterator<Patient> getPatients(){
        
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
        
        return false;
    }

    public Iterator<Appointment> getAppointments(){
        return null;
    }

    public boolean checkInPatient(String patientId){
        return false;
    }

    public Patient getNextPatient(){
        return null;
    }

    public Patient attendNextPatient(){
        return null;
    }

    public int getWaitingPatientCount(){
        return 0;
    }

    public boolean isPatientWaiting(String patientId){
        return false;
    }
}
