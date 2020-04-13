/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hongquanh_59132005_bt1_tuan2;

/**
 *
 * @author USER
 */
public abstract class CaNhan {
 String HoTen;
 int Tuoi;
 String DiaChi;
 String sdt;

    public CaNhan() {
    }

    public CaNhan(String HoTen, int Tuoi, String DiaChi, String sdt) {
        this.HoTen = HoTen;
        this.Tuoi = Tuoi;
        this.DiaChi = DiaChi;
        this.sdt = sdt;
    }
 
 public abstract void HienThiTT();

    public String getHoTen() {
        return HoTen;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
 
    
}
