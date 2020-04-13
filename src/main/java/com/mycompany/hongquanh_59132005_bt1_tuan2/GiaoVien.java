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
public class GiaoVien extends CaNhan{
    String MonHoc;
   String BoMon;

    public GiaoVien() {
    }

    public GiaoVien(String MonHoc, String BoMon, String HoTen, int Tuoi, String DiaChi, String sdt) {
        super(HoTen, Tuoi, DiaChi, sdt);
        this.MonHoc = MonHoc;
        this.BoMon = BoMon;
    }

    @Override
    public void HienThiTT() {
        System.out.println("Mon hoc: " + MonHoc);
        System.out.println("Bo mon: " + BoMon);
        System.out.println("Ho va ten giang vien: " + HoTen);
        System.out.println("Tuoi: " + Tuoi);
        System.out.println("Dia chi: " + DiaChi);
        System.out.println("So dien thoai: " + sdt);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getMonHoc() {
        return MonHoc;
    }

    public void setMonHoc(String MonHoc) {
        this.MonHoc = MonHoc;
    }

    public String getBoMon() {
        return BoMon;
    }

    public void setBoMon(String BoMon) {
        this.BoMon = BoMon;
    }

   
   
   
}
