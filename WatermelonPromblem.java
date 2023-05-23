/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignments_1.basics_ifcondtask;

import java.util.Scanner;

public class Task_7_WatermelonPromblem {
    public static void main(String[] args) {
        String yes ="YES , you can divide it into two parts";
        String no ="NO, can't divide it";
        int WeightWatMalNum;
        System.out.print("Entre the Weight WaterMalon Number : ");
        Scanner inweight = new Scanner(System.in);
        WeightWatMalNum = inweight.nextInt();
        if(WeightWatMalNum%2==0 && WeightWatMalNum>2)
            System.out.println(yes);
        else
            System.out.println(no);
    }
}
