/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appointments;

import java.time.LocalDate;
import java.time.LocalTime;
import patients.Patient;

/**
 *
 * @author jprod
 */
public class Appointment implements Comparable<Appointment> {
    private String code;
    private Patient patient;
    private LocalDate date;
    private LocalTime time;
    private String reason;
    private AppointmentStatus status;

    public String getCode() {
        return code;
    }

    public Patient getPatient() {
        return patient;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public String getReason() {
        return reason;
    }

    public AppointmentStatus getStatus() {
        return status;
    }

    public Appointment(String code, Patient patient, LocalDate date, LocalTime time, String reason) {
        this.code = code;
        this.patient = patient;
        this.date = date;
        this.time = time;
        this.reason = reason;
        this.status = AppointmentStatus.SCHEDULED;
    }
    
    public void reschedule(LocalDate newDate, LocalTime newTime){
        if (newDate == null || newTime == null) {
            throw new IllegalArgumentException("La fecha y la hora son obligatorias");
        }
        this.date = newDate;
        this.time = newTime;
    }

    public void cancel(){
        this.status = AppointmentStatus.CANCELLED;
    }

    public boolean isPending(){
        return status == AppointmentStatus.SCHEDULED || status == AppointmentStatus.CHECKED_IN;
    }

    public boolean isToday(){
        return this.date.equals(LocalDate.now());
    }

    public void setStatus(AppointmentStatus status) {
        if (status == null) {
            throw new IllegalArgumentException("El estado es obligatorio");
        }
        this.status = status;
    }

    @Override
    public int compareTo(Appointment other) {
        int byDate = date.compareTo(other.date);
        if (byDate != 0) return byDate;
        int byTime = time.compareTo(other.time);
        if (byTime != 0) return byTime;
        return code.compareTo(other.code);
    }
    
    //public int compareTo(Appointment other); date → time → code
}
