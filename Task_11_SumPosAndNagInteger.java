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
public class Task_11_SumPosAndNagInteger {
    public static void main(String[] args) {
        int n1 , n2 ,n3, n4, n5, n6,positiveNum = 0,negativeNum = 0;
        System.out.println("Enter 6 integer Numbers (positive and Negative): ");
        Scanner input = new Scanner(System.in);
        n1=input.nextInt();
        n2=input.nextInt();
        n3=input.nextInt();
        n4=input.nextInt();
        n5=input.nextInt();
        n6=input.nextInt();
        if(n1<0){
            negativeNum += n1;
        }else{
            positiveNum += n1;
        }
        if(n2<0){
            negativeNum += n2;
        }else{
            positiveNum += n2;
        }
        if(n3<0){
            negativeNum += n3;
        }else{
            positiveNum += n3;
        }
        if(n4<0){
            negativeNum += n4;
        }else{
            positiveNum += n4;
        }
        if(n5<0){
            negativeNum += n5;
        }else{
            positiveNum += n5;
        }
        if(n6<0){
            negativeNum += n6;
        }else{
            positiveNum += n6;
        }
        
        System.out.println("The Sum of Positive Integer = " + positiveNum +"\n" +"The Sum of Negative Integer =  " +negativeNum);
    }
}
