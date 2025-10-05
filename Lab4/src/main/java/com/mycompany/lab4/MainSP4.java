/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab4;

/**
 *
 * @author ICT
 */
public class MainSP4 {

    public static void main(String[] args) {
        SanPham4 sp1=new SanPham4();
        sp1.setTen("Do M.U");
        sp1.setGia(300000.0);
        sp1.setGiamgia(15000.0);
        SanPham4 sp2=new SanPham4();
        sp2.setTen("Do Real");
        sp2.setGia(350000.0);
        System.out.println("----------------------");
        System.out.println("   -- San pham 1 --");
        System.out.println("Ten san pham: "+sp1.getTen()+"\nDon gia: "+sp1.getGia()+"\nGiam gia: "+sp1.getGiamgia());
        System.out.println("----------------------");
        System.out.println("   -- San pham 2 --");
        System.out.println("Ten san pham: "+sp2.getTen()+"\nDon gia: "+sp2.getGia()+"\nGiam gia: 0");
        System.out.println("----------------------");
    }
}
