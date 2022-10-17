/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bookmanager;
public class SachThamKhao extends Sach{
    int thue ;
    public SachThamKhao(){
        super();
    }
    public SachThamKhao(int thue){
        super();
        this.thue = thue ;
    }
    public int getthue(){
        return thue ;
    }
    public void setthue(int thue ){
        this.thue = thue ;
    }
    @Override
    public void Nhapthongtinsach(){
        super.Nhapthongtinsach();
        System.out.print("\nNhap tien thue : ");
        thue = scanner.nextInt();
    }
    @Override
    public String toString(){
        return super.toString() + "\nTien thue : " + this.thue;
    }
    
}
