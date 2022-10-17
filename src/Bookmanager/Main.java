/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bookmanager;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String [] args ){
        Scanner scanner = new Scanner (System.in);
        ArrayList<SachGiaoKhoa> arrsachgiaokhoa = new ArrayList<>();
        ArrayList<SachThamKhao> arrsachthamkhao = new ArrayList<>();
        int sosachGiaokhoa,sosachThamkhao;
        double Trungbinhcongtiensach = 0,TiensachGiaokhoa = 0 ,TiensachThamkhao = 0;
        System.out.print("Nhap so sach giao khoa : ");
        sosachGiaokhoa = scanner.nextInt();
        System.out.print("\nNhap so sach tham khao : ");
        sosachThamkhao = scanner.nextInt();
        System.out.println("\nNhap thong tin sach giao khoa : ");
        for(int i = 0 ;i < sosachGiaokhoa ; i++){
            System.out.print("Nhap thong tin sach giao khoa thu " + (i+1) + ": ");
            SachGiaoKhoa sachGiaokhoa = new SachGiaoKhoa() ;
            sachGiaokhoa.Nhapthongtinsach();
            arrsachgiaokhoa.add(sachGiaokhoa);
        }
        for(int i = 0 ; i < sosachThamkhao ; i++) {
            System.out.print("\nNhap thong tin sach tham khao thu " + (i+1) + ":");
            SachThamKhao sachThamkhao = new SachThamKhao();
            sachThamkhao.Nhapthongtinsach();
            arrsachthamkhao.add(sachThamkhao);
        }
        for(int i = 0 ; i<sosachGiaokhoa ; i++){
            if(arrsachgiaokhoa.get(i).getnumber()==1){
               TiensachGiaokhoa += arrsachgiaokhoa.get(i).getsoLuong()* arrsachgiaokhoa.get(i).getdonGia();
            }else if (arrsachgiaokhoa.get(i).getnumber()==2){
                TiensachGiaokhoa += arrsachgiaokhoa.get(i).getsoLuong()* arrsachgiaokhoa.get(i).getdonGia()*(50/100);
        }
        }
        System.out.print("\nTong tien sach giao khoa =  " + TiensachGiaokhoa);
        for(int i = 0 ;i < sosachThamkhao ;i++){
            TiensachThamkhao += arrsachthamkhao.get(i).getsoLuong()* arrsachthamkhao.get(i).getdonGia()*arrsachthamkhao.get(i).getthue();
        }
        System.out.print("\nTong tien sach giao khoa = " + TiensachThamkhao);
        System.out.println("\n------ Thong tin sach giao khoa ------ ");
        for(int i = 0; i <arrsachgiaokhoa.size();i++)
            System.out.print(arrsachgiaokhoa.get(i).toString());
        System.out.println("\n------ Thong tin sach tham khao ------");
        for(int i = 0 ; i<arrsachthamkhao.size();i++)
            System.out.print(arrsachthamkhao.get(i).toString());
        System.out.print("Tong tien sach = " + (TiensachThamkhao + TiensachGiaokhoa));
        }
    }
