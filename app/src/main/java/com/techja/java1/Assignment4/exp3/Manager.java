package com.techja.java1.Assignment4.exp3;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Manager {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<String,Staff> managerHashmap=new HashMap<>();

        //thực hiện các lựa chon
        while (true){
            System.out.println("Gồm có các lua chọn: ");
            System.out.println("add");
            System.out.println("display");
            System.out.println("update");
            System.out.println("find");
            System.out.println("exit");

            System.out.println("Nhập các lựa chọn");
            String select=scanner.nextLine().toLowerCase();
            switch (select){

                case "add": addStaff(scanner,managerHashmap);//thêm nhân viên
                    break;
                case "display":displayStaff(scanner,managerHashmap);//hiển thị thông tin nhân viên
                    break;
                case "update": updataStaff(scanner,managerHashmap);//cập nhật thông tin nhân viên
                    break;
                case "find":findStaff(scanner,managerHashmap);//tìm kiếm nhân viên
                    break;
                case "exit":
                    System.out.println("Thoát ứng dụng");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhap sai lựa chọn xin mời nhập lại lựa chọn: ");
            }
        }
    }

    private static void findStaff(Scanner scanner, Map<String, Staff> managerHashmap) {
        System.out.println("Nhập id hoặc tên nhân viên cần tìm kiếm");
        String findStaff=scanner.nextLine();

        if (managerHashmap.containsKey(findStaff)) {
            // Nếu findStaff là id, hiển thị thông tin nhân viên tương ứng
            System.out.println("Nhân viên tìm theo id là:");
            staffDisplay(Objects.requireNonNull(managerHashmap.get(findStaff)));
        } else {
            // Nếu không phải id, kiểm tra xem có nhân viên nào trùng tên không
            boolean foundByName = false;
            for (Staff staffFind : managerHashmap.values()) {
                if (staffFind.getName().equals(findStaff)) {
                    System.out.println("Nhân viên tìm theo tên là:");
                    staffDisplay(staffFind);
                    foundByName = true;
                }
            }

            // Nếu không tìm thấy
            if (!foundByName) {
                System.out.println("Không tìm thấy nhân viên với thông tin: " + findStaff);
            }
        }
    }

    private static void updataStaff(Scanner scanner, Map<String, Staff> managerHashmap) {
        System.out.println("Nhập id nhân viên cần update");
        String inputId=scanner.nextLine();
        if (managerHashmap.containsKey(inputId)){
           //cập nhật lại nhân viên
            Staff staffUpdate=managerHashmap.get(inputId);

            System.out.println("Tên cập nhật");
            String nameUpdate=scanner.nextLine().toLowerCase();
            staffUpdate.setName(nameUpdate);
            System.out.println("giới tính cập nhật");
            String sexUpdate=scanner.nextLine().toLowerCase();
            while (!sexUpdate.equals("nam") && !sexUpdate.equals("nữ")){
                System.out.println("nhập giới tính không hợp lệ");
                //không hợp lệ thì nhập lại sex,bao giờ đúng thì mới thoát vòng while
                sexUpdate=scanner.nextLine().toLowerCase();
            }
            staffUpdate.setSex(sexUpdate);

            System.out.println("Cập nhat ngày tháng năm sinh");
            String dateOfBirdUpdate=scanner.nextLine();
            while (dateOfBirdUpdate.length() !=10){
                System.out.println("nhập sai ngày thắng năm sinh");
                dateOfBirdUpdate=scanner.nextLine();
            }
            staffUpdate.setDateOfBird(dateOfBirdUpdate);

            System.out.println("Cập nhật số điện thoại");
            String phoneUpdate=scanner.nextLine();
            staffUpdate.setPhone(phoneUpdate);

            System.out.println("Cập nhật trình độ");
            String leverUpdate=scanner.nextLine().toLowerCase();
            while (!leverUpdate.equals("trung cấp") && !leverUpdate.equals("cao đẳng") && !leverUpdate.equals("đại học")){
                System.out.println("Nhập sai trình độ");
                leverUpdate=scanner.nextLine().toLowerCase();
            }
            staffUpdate.setLever(leverUpdate);

        }else {
            System.out.println("Không tìm thấy id nhân viên cần update");
        }
    }

    private static void displayStaff(Scanner scanner, Map<String, Staff> managerHashmap) {
        if (managerHashmap.isEmpty()){
            //nếu nhân viên chưa được add
            System.out.println("“Not found information”");
        }else {
            for (Staff staff: managerHashmap.values()){
                staffDisplay(staff);
            }
        }
    }

    private static void staffDisplay(Staff staff) {
        System.out.println("ID: " + staff.getId());
        System.out.println("Tên: " + staff.getName());
        System.out.println("Giới tính: " + staff.getSex());
        System.out.println("Ngày tháng năm sinh: " + staff.getDateOfBird());
        System.out.println("Số điện thoại: " + staff.getPhone());
        System.out.println("Trình độ: " + staff.getLever());
    }

    private static void addStaff(Scanner scanner, Map<String, Staff> managerHashmap) {
        System.out.println("Nhập thông tin nhân viên");
        System.out.println("Nhập tên nhân viên");
        String name=scanner.nextLine();

        System.out.println("nhập giới tính");
        String sex=scanner.nextLine().toLowerCase();
        while (!sex.equals("nam") && !sex.equals("nữ")){
            System.out.println("nhập giới tính không hợp lệ");
            //không hợp lệ thì nhập lại sex,bao giờ đúng thì mới thoát vòng while
            sex=scanner.nextLine().toLowerCase();
        }

        System.out.println("Nhập ngày tháng năm sinh");
        String dateOfBird=scanner.nextLine();
        while (dateOfBird.length() !=10){
            System.out.println("nhập sai ngày thắng năm sinh");
            dateOfBird=scanner.nextLine();
        }

        System.out.println("Nhập số điện thoại");
        String phone=scanner.nextLine();

        System.out.println("Nhập trình độ");
        String lever=scanner.nextLine().toLowerCase();
        while (!lever.equals("trung cấp") && !lever.equals("cao đẳng") && !lever.equals("đại học")){
            System.out.println("Nhập sai trình độ hãy nhập lại: ");
            lever=scanner.nextLine().toLowerCase();
        }
        //tạo đối tượng nhân viên vừa dược nhập
        Staff staff=new Staff(name,sex,dateOfBird,phone,lever);
        //thêm key là id của nhân viên và value là nhân viên vừa tạo
        managerHashmap.put(staff.getId(),staff);
    }
}
