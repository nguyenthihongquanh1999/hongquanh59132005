/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanh_59132005_BT1_2_Tuan2;
/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args){
        NhanVien nv = new NhanVien("Nguyen An",34,"3 Hung Vuong",6000000,232);
        nv.getThongTin();
        QuanLyNhanVien ds = new QuanLyNhanVien();
        NhanVien nv1 = new NhanVien("Nguyen Thi Nuong",22,"30 Hoang Hoa Tham",4000000,120);
        NhanVien nv2= new NhanVien("Le Hoang Hai",22,"18 Hoang Hoa Tham",4000000,160);
        NhanVien nv3= new NhanVien("Tran Trung Du",30,"33 Le Thai To",4500000,200);
        NhanVien nv4 = new NhanVien("Tran Thi Cam",25,"29 Hung Vuong",4500000,160);
        NhanVien nv5 = new NhanVien("Nguyen Binh",33,"50 Le Hoang",6000000,220);
        
        ds.themNhanVien(nv1);
        ds.themNhanVien(nv2);
        ds.themNhanVien(nv3);
        ds.themNhanVien(nv4);
        ds.themNhanVien(nv5);
        ds.inDS();
    }
}
