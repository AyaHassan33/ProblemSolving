/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignments_1.basics_ifcondtask;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Task_5_PositiveAndNegative {
    public static void main(String[] args) {
        double num;
        System.out.print("Enter The Number for know Type it(positive or negative) : ");
        Scanner inNum = new Scanner(System.in);
        num = inNum.nextDouble();
        if(num >= 0)
            System.out.println("The Number is positive");
        else
            System.out.println("The Number is negative");
        
    }
    
}
