/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       /* System.out.println(Osoba.getLiczbaLudnosci());
        Osoba krzysiek = new Osoba();
        krzysiek.setSurname("Sokulski");
        krzysiek.setName("Krzysiek");
        
        System.out.println(krzysiek.getName());
        System.out.println(krzysiek.getSurname());
        
        System.out.println(Osoba.getLiczbaLudnosci());
        
        Osoba michal = new Osoba("Michał", "Kwiatos");
        
        System.out.println(michal.getName());
        System.out.println(michal.getSurname());
        
        System.out.println(Osoba.getLiczbaLudnosci());
        
        
        System.out.println(args[0]);
        System.out.println(args[1]);
        
        
        int firstNumber = convertToInt(args[0]);
        int secondNumber = convertToInt(args[2]);
        
        System.out.println(firstNumber);
        zwiekszliczbe(firstNumber);
        System.out.println(firstNumber);
        
        Object a = new Object();
        
        Osoba michal = new Osoba("Michał", "Kwiatos");
        
        System.out.println(michal.getAge());
        postarzOsobe(michal, 10);
        System.out.println(michal.getAge());
        
        
        
        if( "+".equals(args[1])){
            System.out.println(firstNumber + secondNumber);
        }else if("-".equals(args[1])){[1])){
            System.out.println(firstNumb
            System.out.println(firstNumber - secondNumber);
        }*/
        
        
        Car myCar;
            myCar = new Truck();
        
        try {
            myCar.start();
        } catch (CarStartEngineException ex) {
            System.err.println("Pierwsze uruchominie rzuciło wyjątkiem" + ex.getMessage());
        }
        
        
        try {
            myCar.start();
        } catch (CarStartEngineException ex) {
            System.err.println("Drugie uruchominie rzuciło wyjątkiem" + ex.getMessage());
        }
        myCar.stop();
    }
    
    private static void zwiekszliczbe(int liczba){
        liczba++;
    }

    private static int convertToInt(String arg) {
        return Integer.parseInt(arg);
    }

    private static void postarzOsobe(Osoba michal, int i) {
        michal.setAge(michal.getAge() + i);
    }
    
}
