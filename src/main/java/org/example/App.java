/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 Bryson Paul
 */
package org.example;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        float inp1=0;
        float inp2=0;
        Boolean controller=true;
        Scanner sc = new Scanner(System.in);
        while(controller) {
            try {
                inp1 = Float.parseFloat(strIO("What is the first number? ", sc));
                inp2 = Float.parseFloat(strIO("What is the second number? ", sc));
                if (inp1 < 0 || inp2 < 0) {
                    Exception ex= new Exception();
                    throw ex;
                }
            } catch (Exception ex) {
                System.out.println("error, must be a positive number");
                continue;
            }
            controller = false;
        }
        float sum = add(inp1,inp2), diff = sub(inp1,inp2), prod = mult(inp1,inp2), quot = div(inp1,inp2);
        System.out.println(inp1 + " + " + inp2 + " = " + sum + "\n" + inp1 + " - " + inp2 + " = " + diff + "\n" + inp1 + " * " + inp2 + " = " + prod + "\n" + inp1 + " / " + inp2 + " = " + quot);
    }
    public static String strIO(String input, Scanner sc){
        System.out.print(input);
        String output = sc.nextLine();
        return output;
    }
    public static float add(float x, float y) {
        return (float)(x+y);
    }
    public static float sub(float x, float y) {
        return (float)(x-y);
    }
    public static float mult(float x, float y) {
        return (float)(x*y);
    }
    public static float div(float x, float y) {
        return (float)(x/y);
    }
}