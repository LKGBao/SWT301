package com.showroom;

import java.util.ArrayList;
import java.util.List;

public class Showroom {

    private List<Car> cars;
    private List<Customer> customers;
    private List<Appointment> appointments;

    public Showroom() {
        this.cars = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.appointments = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void updateCar(int index, Car car) {
        if (index >= 0 && index < cars.size()) {
            cars.set(index, car);
        } else {
            System.out.println("Ô tô không tồn tại.");
        }
    }

    public void deleteCar(int index) {
        if (index >= 0 && index < cars.size()) {
            cars.remove(index);
        } else {
            System.out.println("Ô tô không tồn tại.");
        }
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void updateCustomer(int index, Customer customer) {
        if (index >= 0 && index < customers.size()) {
            customers.set(index, customer);
        } else {
            System.out.println("Khách hàng không tồn tại.");
        }
    }

    public void deleteCustomer(int index) {
        if (index >= 0 && index < customers.size()) {
            customers.remove(index);
        } else {
            System.out.println("Khách hàng không tồn tại.");
        }
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public void updateAppointment(int index, Appointment appointment) {
        if (index >= 0 && index < appointments.size()) {
            appointments.set(index, appointment);
        } else {
            System.out.println("Lịch hẹn không tồn tại.");
        }
    }

    public void deleteAppointment(int index) {
        if (index >= 0 && index < appointments.size()) {
            appointments.remove(index);
        } else {
            System.out.println("Lịch hẹn không tồn tại.");
        }
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Ô tô:\n");
        for (Car car : cars) {
            sb.append(car.toString()).append("\n");
        }

        sb.append("Khách hàng:\n");
        for (Customer customer : customers) {
            sb.append(customer.toString()).append("\n");
        }

        sb.append("Lịch hẹn:\n");
        for (Appointment appointment : appointments) {
            sb.append(appointment.getCustomer().getName()).append(", ")
                    .append(appointment.getAppointmentTime()).append("\n");
        }

        return sb.toString();
    }

}
