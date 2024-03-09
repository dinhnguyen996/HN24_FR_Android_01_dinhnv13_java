package com.techja.java1.Assignment4.exp1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {

        String[] color =new String[4];
        String[] colors =new String[3];
        color[0]="xanh";
        color[1]="vàng";
        color[2]="đỏ";
        color[3]="nâu";

        colors[0]="đỏ";
        colors[1]="tím";
        colors[2]="nâu";
//        colors[3]="hồng";
//        colors[4]="trắng";

        //tạo 2 list với các phần tử trong array
        List<String> list=new ArrayList<>();
        List<String> list2=new ArrayList<>();
        Collections.addAll(list,color);
        Collections.addAll(list2,colors);
        //thêm các phần tử có trong list 2 vào trong list
        list.addAll(list2);
        list2.clear();
        System.out.println("list"+ list);

        //chuyển các phần tử trong list thành in hoa
        for (int i=0;i<list.size();i++){
            list.set(i,list.get(i).toUpperCase());
        }
        System.out.println("List sau khi chuyển các phần tử thành in hoa:" + list);
        List<String> coppyList=new ArrayList<>(list);
        list.subList(3,6).clear();
//        list.remove(3);
//        list.remove(4);
//        list.remove(5);
        System.out.println("List sau khi xoá từ phần tử thứ 4 tới phần tử thứ 6: " + list);

        //đảo ngược list và hiển thị lại
        Collections.reverse(list);
    }
}
