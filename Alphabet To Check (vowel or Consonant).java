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
public class Task_3_SmallcaseAndUppercase {
    public static void main(String[] args) {
        System.out.print("Enter the letter Alphabet To Check (vowel or Consonant): ");
        Scanner inAlph =new Scanner(System.in);
        char letAlph =inAlph.next().toUpperCase().charAt(0);
       
        switch (letAlph) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("The Input Character is Vowel");
                break;
            default:
                System.out.println("The Input Character is Consonant");
        }
    }
    
}
