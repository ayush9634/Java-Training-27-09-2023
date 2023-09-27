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
public class StackUsingCol {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(12);
        st.push(45);
        st.push(39);
        st.push(18);
        st.push(22);
        System.out.println("Stack Operations......");
        System.out.println("Insertion: "+st);
        System.out.println("Deletion: "+st.pop());
        System.out.println(st);
        System.out.println("Top Most Element: "+st.peek());
        System.out.println("Element : "+st.search(18));
        System.out.println("Element: "+st.search(15));
        System.out.println("Empty or not: "+st.empty());
        st.clear();
        System.out.println("Empty or not: "+st.empty());
    }
}
