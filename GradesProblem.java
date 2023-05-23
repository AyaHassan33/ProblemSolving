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
public class Task_6_Grades {
    public static void main(String[] args) {
        char grade;
        Scanner inGrade = new Scanner(System.in);
        System.out.print("Enter the grade (A , B ,C ,F) : ");
        grade = inGrade.next().toUpperCase().charAt(0);
        switch (grade) {
            case 'A':
                System.out.println("marks >= 80");
                break;
            case 'B':
                System.out.println("marks >= 60 and < 80");
                break;
            case 'C':
                System.out.println("marks >= 40 and < 60");
                break;
            case 'F':
                System.out.println("marks < 40");
                break;
            
            default:
                
                System.out.println("Invalid Grade");
               // throw new AssertionError();
                        break;
        }
        
        
    }
}
