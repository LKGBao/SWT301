package com.showroom;

import java.util.Scanner;

public class ShowroomManager {

    private Showroom showroom;

    public ShowroomManager() {
        this.showroom = new Showroom();
        DataInitializer dataInitializer = new DataInitializer(showroom);
        dataInitializer.initializeData(); // Khởi tạo dữ liệu cứng
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("1. Thêm ô tô");
            System.out.println("2. Sửa ô tô");
            System.out.println("3. Xóa ô tô");
            System.out.println("4. Thêm khách hàng");
            System.out.println("5. Sửa khách hàng");
            System.out.println("6. Xóa khách hàng");
            System.out.println("7. Thêm lịch hẹn");
            System.out.println("8. Sửa lịch hẹn");
            System.out.println("9. Xóa lịch hẹn");
            System.out.println("10. Hiện thị thông tin showroom");
            System.out.println("11. Thoát");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Nhập mô hình ô tô: ");
                    String model = scanner.nextLine();
                    System.out.print("Nhập hãng sản xuất: ");
                    String manufacturer = scanner.nextLine();
                    System.out.print("Nhập giá: ");
                    double price = scanner.nextDouble();
                    showroom.addCar(new Car(model, manufacturer, price));
                    break;
                case 2:
                    System.out.print("Nhập chỉ số ô tô cần sửa: ");
                    int carIndexToUpdate = scanner.nextInt();
                    scanner.nextLine(); // consume the newline
                    System.out.print("Nhập mô hình ô tô mới: ");
                    String newModel = scanner.nextLine();
                    System.out.print("Nhập hãng sản xuất mới: ");
                    String newManufacturer = scanner.nextLine();
                    System.out.print("Nhập giá mới: ");
                    double newPrice = scanner.nextDouble();
                    showroom.updateCar(carIndexToUpdate, new Car(newModel, newManufacturer, newPrice));
                    break;
                case 3:
                    System.out.print("Nhập chỉ số ô tô cần xóa: ");
                    int carIndexToDelete = scanner.nextInt();
                    showroom.deleteCar(carIndexToDelete);
                    break;
                case 4:
                    System.out.print("Nhập tên khách hàng: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập số điện thoại: ");
                    String phone = scanner.nextLine();
                    showroom.addCustomer(new Customer(name, phone));
                    break;
                case 5:
                    System.out.print("Nhập chỉ số khách hàng cần sửa: ");
                    int customerIndexToUpdate = scanner.nextInt();
                    scanner.nextLine(); // consume the newline
                    System.out.print("Nhập tên khách hàng mới: ");
                    String newName = scanner.nextLine();
                    System.out.print("Nhập số điện thoại mới: ");
                    String newPhone = scanner.nextLine();
                    showroom.updateCustomer(customerIndexToUpdate, new Customer(newName, newPhone));
                    break;
                case 6:
                    System.out.print("Nhập chỉ số khách hàng cần xóa: ");
                    int customerIndexToDelete = scanner.nextInt();
                    showroom.deleteCustomer(customerIndexToDelete);
                    break;
                case 7:
                    System.out.print("Nhập tên khách hàng: ");
                    String custName = scanner.nextLine();
                    System.out.print("Nhập thời gian hẹn: ");
                    String time = scanner.nextLine();
                    showroom.addAppointment(new Appointment(new Customer(custName, ""), time));
                    break;
                case 8:
                    System.out.print("Nhập chỉ số lịch hẹn cần sửa: ");
                    int appointmentIndexToUpdate = scanner.nextInt();
                    scanner.nextLine(); // consume the newline
                    System.out.print("Nhập tên khách hàng mới: ");
                    String appointmentCustName = scanner.nextLine();
                    System.out.print("Nhập thời gian hẹn mới: ");
                    String newTime = scanner.nextLine();
                    showroom.updateAppointment(appointmentIndexToUpdate, new Appointment(new Customer(appointmentCustName, ""), newTime));
                    break;
                case 9:
                    System.out.print("Nhập chỉ số lịch hẹn cần xóa: ");
                    int appointmentIndexToDelete = scanner.nextInt();
                    showroom.deleteAppointment(appointmentIndexToDelete);
                    break;
                case 10:
                    System.out.println("Thông tin showroom:");
                    System.out.println(showroom);
                    break;

                case 11:
                    running = false;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        }
        scanner.close();
    }
}
