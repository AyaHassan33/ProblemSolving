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
public class Task_4_SimpleCalculator {
    public static void main(String[] args) {
        
        double num1, num2 , result;
        char operat;
        int res;
        Scanner cal=new Scanner(System.in);
        System.out.print("Enter num1 : ");
        num1 = cal.nextDouble();
        System.out.print("Enter num2 : ");
        num2 = cal.nextDouble();
        System.out.print("Enter the operation ( + , - , * , / ) : ");
        operat = cal.next().charAt(0);
        switch (operat) {
            case '+':
                result = num1 + num2;
                if(result%1==0){
                    res = (int)result; //(cast) convert from double to int
                    System.out.println("The result is : " + res);
                }else{
                    System.out.println("The result is : " + result);
                }
                
                break;
            case '-':
                result =num1 - num2;
                if(result%1==0){
                    res = (int)result; //(cast) convert from double to int
                    System.out.println("The result is : " + res);
                }else{
                    System.out.println("The result is : " + result);
                }
                break;
            case '*':
                result =num1 * num2;
               if(result%1==0){
                    res = (int)result; //(cast) convert from double to int
                    System.out.println("The result is : " + res);
                }else{
                    System.out.println("The result is : " + result);
                }
                break;
            case '/':
                if(num2 == 0){
                    System.out.println("error try again without use 0 in num2");
                }else{
                    result =num1 / num2;
                    if(result%1==0){
                    res = (int)result; //(cast) convert from double to int
                    System.out.println("The result is : " + res);
                }else{
                    System.out.println("The result is : " + result);
                }
                }   break;
            default:
                break;
        }
    }
}
