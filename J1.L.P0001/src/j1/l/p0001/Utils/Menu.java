/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.l.p0001.Utils;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Menu extends ArrayList<String> {
    Scanner sc = new Scanner(System.in);
    //Add item to the menu List
    public void addItems(String item){
        add(item);
    }
    
    //Print the menu
    public void printMenu(){
        if(isEmpty()){
            System.out.println("Menu is Empty!");
        } else{
            int i = 0;
            for(String item : this){
                System.out.println(String.format("[%d] %s",++i,item));
            }
        }
    }
    
    //Get User Choice
    public Integer getChoice(){
        Integer choice = 0;
        
        
        try{
            System.out.print("Input your choice here:  ");
            choice = sc.nextInt();
            
            
        }catch(InputMismatchException e){
            System.out.println("Input must be an Integer!");
        }
        
        
        return choice;
    }
}