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
public class Task_13_AreaOfACircle {
    public static void main(String[] args) {
        Scanner inrad=new Scanner(System.in);
        double radius;
        double pi = 3.142 ,area;
        System.out.print("Enter the radius: ");
        radius=inrad.nextDouble();
        area = pi * radius*radius;
        System.out.print("Area is =  " + area);
        
    }
    
}
