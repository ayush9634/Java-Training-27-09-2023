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
public class TreeSeImpse {
    public static void main(String[] args) {
        TreeSet<Integer> ti = new TreeSet<>();
        ti.add(25);
        ti.add(12);
        ti.add(39);
        ti.add(24);
        ti.add(10);
        System.out.println("TreeaSet Values: "+ti);
        System.out.println("TreeSet using For each");
        for(Integer i : ti)
            System.out.print(i+" ");
        System.out.println("First Element: "+ti.first());//Prints the first element.
        System.out.println("Last Element: "+ti.last( ));//Prints the last element of treeSet
        System.out.println("Higher: "+ti.higher(25));//Prints the element just higher than 25
        System.out.println("Lower: "+ti.lower(39));
        System.out.println("Ceiling: "+ti.ceiling(25));
        System.out.println("Floor: "+ti.floor(25));
        ti.pollFirst();//Deletes the first value from TreeSet.
        System.out.println("After deletion of first value: "+ti);
        ti.pollLast();//Deletes the last value from TreeSet..... 
        System.out.println("After Deletion of Last value: "+ti);
    }
}
