/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

/**
 *
 * @author ICT
 */
public class MainSP3 {
    public static void main(String[] args) {
        SanPham3 sp1=new SanPham3("Do M.U",300000.0,15000.0);
        SanPham3 sp2=new SanPham3("Do Real",350000.0);
        System.out.println("----------------------");
        System.out.println("   -- San pham 1 --");
        sp1.xuat();
        System.out.println("----------------------");
        System.out.println("   -- San pham 2 --");
        sp2.xuat();
        System.out.println("----------------------");
    }
}
