/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

import java.util.Scanner;

/**
 *
 * @author Nitro
 */
public class SanPham3 {
    private String ten;
    private Double gia;
    private Double giamgia;
    private Double thue() {
        return gia*0.1;
    }
    public SanPham3(String ten, Double gia, Double giamgia) {
        this.ten = ten;
        this.gia = gia;
        this.giamgia = giamgia;
    }

    public SanPham3(String ten, Double gia) {
        this.ten = ten;
        this.gia = gia;
        this.giamgia = 0.0;
    }
    public SanPham3() {
    }
    public void xuat() {
        System.out.println("Ten san pham: "+this.ten);
        System.out.println("Don gia: "+this.gia);
        System.out.println("Giam gia: "+this.giamgia);
        System.out.println("Thue nhap khau: "+thue());
    }
    
}
