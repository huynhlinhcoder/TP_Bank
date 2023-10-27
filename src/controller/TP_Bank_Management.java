/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Locale;
import model.Login;
import view.Menu;

/**
 *
 * @author huynh
 */
public class TP_Bank_Management extends Menu<String>{
    
    private Login login= new Login();
    private Locale vietnamese = new Locale("vi");
    private Locale english = Locale.ENGLISH;
    public TP_Bank_Management(String title, String[] s){
        super(title, s);
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                login.login(vietnamese);
                break;
            case 2:
                login.login(english);
                break;
            case 3:
                System.exit(0);
                break;
        }
    }
    
}