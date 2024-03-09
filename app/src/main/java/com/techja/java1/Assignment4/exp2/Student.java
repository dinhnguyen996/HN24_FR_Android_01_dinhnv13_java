package com.techja.java1.Assignment4.exp2;

public class Student {
   private String roolNo;
   private String name;
   private String sex;
   private int age;
   private String email;
   private String address;

   public Student(String roolNo, String name, String sex, int age, String email, String address) {
      this.roolNo = roolNo;
      this.name = name;
      this.sex = sex;
      this.age = age;
      this.email = email;
      this.address = address;
   }
   //phương thức lấy rollno của học sinh


   public String getRoolNo() {
      return roolNo;
   }

   @Override
   public String toString() {
      return "Student{" +
              "roolNo='" + roolNo + '\'' +
              ", name='" + name + '\'' +
              ", sex='" + sex + '\'' +
              ", age=" + age +
              ", email='" + email + '\'' +
              ", address='" + address + '\'' +
              '}';
   }
}
