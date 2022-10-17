/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bookmanager;
import java.util.Scanner;
public class SachGiaoKhoa extends Sach {
    String tinhTrang;
    int number;
    public SachGiaoKhoa(){
    super();
}
    public SachGiaoKhoa(String tinhTrang,int number){
        super();
        this.number = number ;
        this.tinhTrang = tinhTrang;
    }
    public String gettinhTrang(){
        return tinhTrang ;
    }
    public void settinhTrang(String tinhTrang){
        this.tinhTrang = tinhTrang ;
    }
    public int getnumber(){
        return number ;
    }
    public void setnumber(int number){
        this.number = number ;
    }
    public String tinhTrang(int x){
    switch(number){
        case 1 : 
            tinhTrang = "Moi";
            break;
        case 2 :
            tinhTrang = "Cu";
            break;
    }
    return tinhTrang ;
}
    @Override
    public void Nhapthongtinsach(){
        super.Nhapthongtinsach();
        System.out.print("\nNhap tinh trang sach (1:Moi /2:Cu) : ");
        number = scanner.nextInt();
    }
    @Override
    public String toString(){
        return super.toString() + "\tTinh trang sach : " + this.tinhTrang(number);
    }
}
