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
public class Task_12_TheGreatestNumber {
    public static void main(String[] args) {
        float num1,num2,num3,greatestNum;
        int greatestNumInteger;
        Scanner input =new Scanner(System.in);
        System.out.print("Input the 1st number: ");
        num1=input.nextFloat();
        System.out.print("Input the 2nd number: ");
        num2=input.nextFloat();
        System.out.print("Input the 3rd number: ");
        num3=input.nextFloat();
        greatestNum= num1>num2&&num1>num3?num1:num2>num1&&num2>num3?num2:num3;
        if(greatestNum%1==0){
            greatestNumInteger=(int)greatestNum;
            System.out.println("The GreatestNumber = "+ greatestNumInteger);
        }else{
             System.out.println("The GreatestNumber = " + greatestNum);
        }
       
        
    }
}
/*
if(num1>num2&&num1>num3){greatestNum=num1}
else if(num2>num1&&num2>num3){greatestNum=num2}
else{greatestNum=num3}



*/
