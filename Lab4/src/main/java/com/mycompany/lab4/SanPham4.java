/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

/**
 *
 * @author Nitro
 */
public class SanPham4 {
    private String ten;
    private Double gia;
    private Double giamgia;
    private Double thue() {
        return gia*0.1;
    }
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public Double getGia() {
        return gia;
    }
    public void setGia(Double gia) {
        this.gia = gia;
    }
    public Double getGiamgia() {
        return giamgia;
    }
    public void setGiamgia(Double giamgia) {
        this.giamgia = giamgia;
    }
    public SanPham4(String ten, Double gia, Double giamgia) {
        this.ten = ten;
        this.gia = gia;
        this.giamgia = giamgia;
    }

    public SanPham4(String ten, Double gia) {
        this.ten = ten;
        this.gia = gia;
        this.giamgia = 0.0;
    }
    public SanPham4() {
    }
    public void xuat() {
        System.out.println("Ten san pham: "+this.ten);
        System.out.println("Don gia: "+this.gia);
        System.out.println("Giam gia: "+this.giamgia);
        System.out.println("Thue nhap khau: "+thue());
    }
}
