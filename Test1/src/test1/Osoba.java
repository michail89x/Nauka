/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author User
 */
public class Osoba {
    
    private String name;
    private String surname;
    private int age = 0;
    
    private static int liczbaLudnosci = 6000;
    
    public Osoba(String name, String  surname){
    
        this.name = name;
        this.surname = surname;
        liczbaLudnosci++;
    }
    public Osoba(){
        liczbaLudnosci++;
    }
    
    public String getName(){
       return name; 
    }
    public String getSurname(){
       return surname; 
    }
    
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public static int getLiczbaLudnosci(){
        return liczbaLudnosci;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
