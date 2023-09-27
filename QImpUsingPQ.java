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
public class QImpUsingPQ {
    public static void main(String[] args) {
        Queue<Integer>num = new PriorityQueue<>();
        num.offer(12);
        num.add(25);
        num.offer(10);
        num.add(12);
        num.offer(22);
        num.add(15);
        System.out.println("Implementing Queue Using ");
        System.out.println("Deletion: "+num.poll());
        System.out.println("After Deletion: "+num);
        System.out.println("Display: "+num.peek());
    }
}
