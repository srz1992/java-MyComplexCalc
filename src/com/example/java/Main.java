package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner sc = new Scanner(System.in);


        try{
            System.out.println("Enter number: ");
            int num1 = Integer.parseInt(sc.nextLine().replaceAll("\\s", ""));
            System.out.println("Enter operator + - * / ");
            String operator = sc.nextLine().replaceAll("\\s", "");
            System.out.println("Enter second number: ");
            int num2 = Integer.parseInt(sc.nextLine().replaceAll("\\s", ""));

            int result = 0;

            try{
                switch(operator){
                    case "+":
                        result =  num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        result = num1 / num2;
                        break;
                    default:
                        throw new Exception("You did not input a valid mathematical operator! Please start again!");
                }
            }catch(NumberFormatException e){
                System.out.println("You did not try to calculate two numbers!");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                return;
            }
            System.out.println("num1: " + num1);
            System.out.println("num2: " + num2);
            System.out.println("operator: " + operator);
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }catch(NumberFormatException e){
            System.out.println("Please input a number and start again!");
        }




    }
    }

