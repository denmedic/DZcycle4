package com.company;

import java.time.Year;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // ������� 1
        int numbers = 0;
        while (numbers <= 9) {
            numbers++;
            System.out.print(numbers + "");

        }
        System.out.println();

        for (int num = 10; num >= 1; num = num - 1) {
            System.out.print(num + "");

        }
        System.out.println();
        // ������� 2
        for (int friday = 1; friday <= 31; friday = friday + 7) {
            System.out.println("������� ������� " + friday + " �����. ���������� ����������� �����.");
        }

        // ������� 3
        for (int a = 0; a <=2022; a=a + 79){
            System.out.println("������ ��������� � " + a);
        }
        for (int i = 1896;i <= 2122; i = i + 79){
            System.out.println("������������ ��� ��� ������� ������ " + i);
        }
        }


    }














