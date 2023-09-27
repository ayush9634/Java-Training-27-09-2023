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
public class LinkHasMap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer>mp = new LinkedHashMap<>();
         mp.put("Ayush", 45);
        mp.put("Amritansh", 37);
        mp.put("Bhuvi", 12);
        mp.put("Ayushi", 57);
        System.out.println("Values: "+mp.values());
        System.out.println("Using Linked: "+mp);
    }
}
