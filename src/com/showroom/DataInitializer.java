package com.showroom;

public class DataInitializer {
    private Showroom showroom;

    public DataInitializer(Showroom showroom) {
        this.showroom = showroom;
    }

    public void initializeData() {
        // Thêm ô tô
        showroom.addCar(new Car("Model S", "Tesla", 79999));
        showroom.addCar(new Car("Mustang", "Ford", 55999));
        showroom.addCar(new Car("Civic", "Honda", 22999));
        showroom.addCar(new Car("Camry", "Toyota", 24999));
        showroom.addCar(new Car("X5", "BMW", 84999));

        // Thêm khách hàng
        showroom.addCustomer(new Customer("Nguyễn Văn A", "0123456789"));
        showroom.addCustomer(new Customer("Trần Thị B", "0987654321"));
        showroom.addCustomer(new Customer("Lê Văn C", "0912345678"));
        showroom.addCustomer(new Customer("Phạm Thị D", "0934567890"));

        // Thêm lịch hẹn
        showroom.addAppointment(new Appointment(new Customer("Nguyễn Văn A", "0123456789"), "2024-10-01 10:00"));
        showroom.addAppointment(new Appointment(new Customer("Trần Thị B", "0987654321"), "2024-10-02 14:00"));
        showroom.addAppointment(new Appointment(new Customer("Lê Văn C", "0912345678"), "2024-10-03 11:00"));
        showroom.addAppointment(new Appointment(new Customer("Phạm Thị D", "0934567890"), "2024-10-04 09:00"));
    }
}
