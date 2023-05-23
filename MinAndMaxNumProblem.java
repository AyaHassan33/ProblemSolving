/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignments_1.basics_ifcondtask;

import java.util.Scanner;

public class Task_9_MinAndMaxNum {
    public static void main(String[] args) {
        float num1,num2,num3,min,max;
        int intMax, intMin;
        Scanner inNum =new Scanner(System.in);
        System.out.println("Enter three number :  ");
        num1=inNum.nextFloat();
        num2=inNum.nextFloat();
        num3=inNum.nextFloat();
        if(num1>num2&&num1>num3){
            if(num2>num3){
                max=num1;
                min=num3;
            }else{
                max=num1;
                
                min=num2;
            }
            
        }else if(num2>num1&&num2>num3){
            if(num1>num3){
                max=num2;
                
                min=num3;
            }else{
                max=num2;
                
                min=num1;
            }
        }else{
            if(num1>num2){
                max=num3;
                
                min=num2;
            }else{
                max=num3;
                
                min=num1;
            }
        }
        if(max%1==0&& min%1==0 ){
            intMax=(int) max;
            intMin=(int)min;
            System.out.println("Max : " + intMax + "\n"+ "Min: " + intMin);
        }else if(max%1!=0 && min%1==0 ){
            intMin=(int)min;
            System.out.println("Max : " + max + "\n"+ "Min: " + intMin);
        }else if(max%1==0 && min%1!=0 ){
            intMax=(int) max;
            System.out.println("Max : " + intMax + "\n"+ "Min: " + min);
        }else{
            System.out.println("Max : " + max + "\n"+ "Min: " + min);
        }
       
    }
}
