package com.techja.java1.Assignment4.exp2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {
        Map<String, Student> studentsHashMap=new HashMap<>();
        Scanner scanner=new Scanner(System.in);
        int select;
        do {
            System.out.println("Lựa chọn chức năng");
            System.out.println("1.Nhập N sinh viên");
            System.out.println("2.In thông tin sinh viên");
            System.out.println("3.Tìm kiếm sinh viên");
            System.out.println("0.Thoát ");
            System.out.println();
            System.out.println("Nhập lựa chọn của bạn ");
            select=scanner.nextInt();

            switch (select){
                case 1: inputStudents(scanner,studentsHashMap);//thêm sinh viên
                    break;
                case 2:
                    printAllStudents(studentsHashMap);//in sinh viên
                    break;
                case 3:
                    seachStudent(scanner,studentsHashMap);//tìm kiếm sinh viên
                    break;
                default:
                    System.out.println("nhập sai lựa chọn");
            }
        }while (select !=0);//bằng không thì sẽ dừng vòng lặp

    }

    //phương thức nhập vào N sinh viên
    private static void inputStudents(Scanner scanner, Map<String, Student> studentsHashMap) {
        int students;
        do {
            System.out.println("Nhập số sinh viên (phải lớn hơn 0)");
            students=scanner.nextInt();
            scanner.nextLine();//tiêu thụ dấu xuống dòng để chuêỷn sang nhập kiểu khác
        }while (students <=0);//nếu nhỏ hơn 0 thì sẽ tiếp tục vòng lặp,còn k sẽ chạy tiếp xuống dưới
        for (int i=1;i<=students;i++){
            System.out.println("sinh viên thứ:" + i);
            System.out.println("nhập Rollno");
            String rollno=scanner.nextLine();

            System.out.println("nhập name");
            String name=scanner.nextLine();

            System.out.println("nhập sex");
            String sex=scanner.nextLine();

            System.out.println("nhập age");
            int age=scanner.nextInt();
            scanner.nextLine();

            System.out.println("nhập email");
            String email=scanner.nextLine();

            System.out.println("nhập address");
            String address=scanner.nextLine();

            //tạo đối tượng student
            Student student=new Student(rollno,name,sex,age,email,address);
            studentsHashMap.put(rollno,student);//thêm key/value
        }

    }
    private static void printAllStudents(Map<String, Student> studentsHashMap) {
        for (Student student: studentsHashMap.values()  ){
            System.out.println("Học sinh thứ "+ student.getRoolNo()+ ":" + student.toString());
        }
    }
    //tìm kiếm sinh viên
    private static void seachStudent(Scanner scanner, Map<String, Student> studentsHashMap) {
        System.out.println("Nhập rollno sinh viên cần tìm");
        scanner.nextLine();//tiêu thụ dấu xuống dòng ở đầu vào
        String inputRollno=scanner.nextLine();

        Student studentCheck=studentsHashMap.get(inputRollno);
        if (studentCheck !=null){
            System.out.println("Thông tin sinh viên ");
            System.out.println("Sinh viên "+ inputRollno+ "là: " +studentCheck.toString());
        }else {
            System.out.println("Không tìm thấy sinh viên" + inputRollno);
        }
    }


}
