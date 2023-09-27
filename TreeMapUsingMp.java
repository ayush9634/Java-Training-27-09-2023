/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colllection;

/**
 *
 * @author E-LAB-PC28
 */
import java.util.*;
public class TreeMapUsingMp {
     public static void main(String[] args) {
        TreeMap<String,Integer>mp = new TreeMap<>();
         mp.put("Ayush", 45);
        mp.put("Amritansh", 37);
        mp.put("Bhuvi", 12);
        mp.put("Ayushi", 57);
    
        System.out.println("Map Values: "+mp);
         System.out.println("Keys: "+mp.keySet());
         System.out.println("Values: "+mp.values());
         System.out.println("For Each Loop");
         for(String s: mp.keySet())
         {
             System.out.println(s+":"+mp.get(s));
         }
         System.out.println();
        System.out.println("First Key: "+mp.firstKey());
        System.out.println("Last Key: "+mp.lastKey());
        System.out.println("First Entry: "+mp.firstEntry());
        System.out.println("Last Entry: "+mp.lastEntry());
    }
}
