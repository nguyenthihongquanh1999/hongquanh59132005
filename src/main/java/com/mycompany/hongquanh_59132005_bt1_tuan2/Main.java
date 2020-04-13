/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hongquanh_59132005_bt1_tuan2;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args){
       LopHoc lophoc = new LopHoc();
       HocSinh hs1 = new HocSinh("59-cntt-1","IT","Nguyen Thi Hong Quanh",21,"Khanh Hoa","0946378453");
       HocSinh hs2 = new HocSinh("59-cntt-1","IT","Bui Thi Thanh Nuong",21,"Quang Nam","0349572845");
       HocSinh hs3 = new HocSinh("59-cntt-1","IT","Le Thi Mong Ngan",21,"Phu Yen","0956432178");
       GiaoVien gv = new GiaoVien("Mau thiet Ke","IT","Huynh Tuan Anh",40,"Khanh Hoa","09948573627");
       
       lophoc.themHocSinh(hs1);
       lophoc.themHocSinh(hs2);
       lophoc.themHocSinh(hs3);
       lophoc.themGVGD(gv);
       
       lophoc.qldsHS.xoa("Le Thi Mong Ngan");
       lophoc.inDSGVGD();
       lophoc.inDSHocSinh();
    }
}
