/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controller.TP_Bank_Management;

/**
 *
 * @author huynh
 */
public class Main {
      public static void main(String[] args) {        
        String title= "Login Program TB Bank";
        String[] s= new String[] {"Vietnamese","English","Exit"};
        new TP_Bank_Management(title, s).run();
    }
}
