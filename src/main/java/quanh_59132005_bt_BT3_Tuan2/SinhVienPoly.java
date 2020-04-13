/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanh_59132005_bt_BT3_Tuan2;

/**
 *
 * @author USER
 */
public abstract class SinhVienPoly {
    String HoTen;
    String Nganh;

    public SinhVienPoly() {
    }

    public SinhVienPoly(String HoTen, String Nganh) {
        this.HoTen = HoTen;
        this.Nganh = Nganh;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getNganh() {
        return Nganh;
    }

    public void setNganh(String Nganh) {
        this.Nganh = Nganh;
    }
    
    public abstract double getDiem();
    
    public String getHocLuc(){
        if(getDiem() < 5) return "Yeu";
        else
            if(5<= getDiem() && getDiem()< 6.5) return "Trung binh";
        else
             if(6.5<= getDiem() && getDiem() <7.5) return "Kha";
        else
             if(7.5<= getDiem() && getDiem() < 9) return "Gioi";
        return "Xuat sac";
     }
    
    public void xuat(){
        System.out.println("Ho va Ten:" + HoTen);
        System.out.println("Nganh hoc: " + Nganh);
        System.out.println("Diem trung binh: " + getDiem());
        System.out.println("Hoc luc: " + getHocLuc());
        
    }
}
