/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bookmanager;
import java.util.Scanner;
public class Sach {
    Scanner scanner = new Scanner (System.in);
    private int soLuong ;
    private double donGia;
    private String maSach,nhaXuatban;
    public Sach(){
        super ();
    }
    public Sach(String maSach,String nhaXuatban,double donGia,int soLuong){
        super();
        this.maSach = maSach;
        this.nhaXuatban = nhaXuatban;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
    public String getmaSach(){
        return maSach;
    }
    public void setmaSach(String maSach){
        this.maSach = maSach;
    }
    public String getnhaXuatban(){
        return nhaXuatban ;
    }
    public void setnhaXuatban (String nhaXuatban){
        this.nhaXuatban = nhaXuatban;
    }
    public double getdonGia(){
        return donGia ;
    }
    public void setdonGia(double donGia){
        this.donGia = donGia;
    }
    public int getsoLuong(){
        return soLuong ;
    }
    public void setsoLuong(int soLuong){
        this.soLuong = soLuong;
    }
    public void Nhapthongtinsach(){
        System.out.println("\nNhap ma sach : ");
        maSach = scanner.nextLine();
        System.out.print("\nNhap nha xuat ban : ");
        nhaXuatban = scanner.nextLine();
        System.out.print("\nNhap so luong : ");
        soLuong = scanner.nextInt();
        System.out.print("\nNhap dong gia : ");
        donGia = scanner.nextDouble();
    }
    public String toString(){
        return "Ma sach : " + this.maSach + "\tNha xuat ban : " + this.nhaXuatban + "\tSo luong : " + this.soLuong + "\tDon gia : " + this.donGia;
    }
    
}
