package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in); //     Khai báo đối tượng Scanner
        System.out.println("Nhập chiều dài: ");
        width = scanner.nextFloat();
        System.out.println("Nhập chiều rộng: ");
        height = scanner.nextFloat();
        float area = width * height;
        System.out.println("Diện tích là: "+area);
    }
}
