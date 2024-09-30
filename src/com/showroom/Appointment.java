package com.showroom;

public class Appointment {
    private Customer customer;
    private String appointmentTime;

    public Appointment(Customer customer, String appointmentTime) {
        this.customer = customer;
        this.appointmentTime = appointmentTime;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "customer=" + customer +
                ", appointmentTime='" + appointmentTime + '\'' +
                '}';
    }
}
