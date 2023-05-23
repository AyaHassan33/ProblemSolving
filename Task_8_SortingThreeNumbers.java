/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignments_1.basics_ifcondtask;

import java.util.Scanner;

public class Task_8_SortingThreeNumbers {
    public static void main(String[] args) {
        String sortNums ="Sorting The Numbers = ";
        float num1,num2,num3,min,max,mid;
        int intMax, intMin,intMid;
        Scanner inNum =new Scanner(System.in);
        System.out.println("Enter three number :  ");
        num1=inNum.nextFloat();
        num2=inNum.nextFloat();
        num3=inNum.nextFloat();
        if(num1>num2&&num1>num3){
            if(num2>num3){
                max=num1;
                mid=num2;
                min=num3;
            }else{
                max=num1;
                mid=num3;
                min=num2;
            }
            
        }else if(num2>num1&&num2>num3){
            if(num1>num3){
                max=num2;
                mid=num1;
                min=num3;
            }else{
                max=num2;
                mid=num3;
                min=num1;
            }
        }else{
            if(num1>num2){
                max=num3;
                mid=num1;
                min=num2;
            }else{
                max=num3;
                mid=num2;
                min=num1;
            }
        }
        if(max%1==0&& min%1==0 && mid%1==0){
            intMax=(int) max;
            intMid=(int)mid;
            intMin=(int)min;
            System.out.println(sortNums+"\n"+ intMin +"\n" +intMid+"\n"+intMax);
        }else if(max%1!=0 && min%1==0 && mid%1==0){
            intMid=(int)mid;
            intMin=(int)min;
            System.out.println(sortNums+"\n"+ intMin +"\n" +intMid+"\n"+max);
        }else if(max%1==0 && min%1!=0 && mid%1==0){
            intMax=(int) max;
            intMid=(int)mid;
           
            System.out.println(sortNums+"\n"+ min +"\n" +intMid+"\n"+intMax);
        }else if(max%1==0 && min%1==0 && mid%1!=0){
            intMax=(int) max;
            intMin=(int)min;
            System.out.println(sortNums+"\n"+ intMin +"\n" +mid+"\n"+intMax);
        }else if(max%1!=0 && min%1==0 && mid%1!=0){
            intMin=(int)min;
            System.out.println(sortNums+"\n"+ intMin +"\n" +mid+"\n"+max);
        }else if(max%1!=0 && min%1!=0 && mid%1==0){
            intMid=(int)mid;
            System.out.println(sortNums+"\n"+ min +"\n" +intMid+"\n"+max);
        }
        else if(max%1==0 && min%1!=0 && mid%1!=0){
            intMax=(int) max;
            
            System.out.println(sortNums+"\n"+ min +"\n" +mid+"\n"+intMax);
        }else{
            System.out.println(sortNums+"\n"+ min +"\n" +mid+"\n"+max); 
        }
       
    }
    
}

