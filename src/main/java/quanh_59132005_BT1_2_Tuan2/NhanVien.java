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
public class NhanVien {
    String Ten;
    int Tuoi;
    String DiaChi;
    double TienLuong;
    int TongSoGioLam;

    public NhanVien() {
    }

    public NhanVien(String Ten, int Tuoi, String DiaChi, double TienLuong, int TongSoGioLam) {
        this.Ten = Ten;
        this.Tuoi = Tuoi;
        this.DiaChi = DiaChi;
        this.TienLuong = TienLuong;
        this.TongSoGioLam = TongSoGioLam;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public double getTienLuong() {
        return TienLuong;
    }

    public void setTienLuong(double TienLuong) {
        this.TienLuong = TienLuong;
    }

    public int getTongSoGioLam() {
        return TongSoGioLam;
    }

    public void setTongSoGioLam(int TongSoGioLam) {
        this.TongSoGioLam = TongSoGioLam;
    }
    
    public double TinhThuong(){
        if(TongSoGioLam >=200) return TienLuong*0.2;
        else{
            if(100<= TongSoGioLam && TongSoGioLam< 200)
                return TienLuong*0.1;
            return 0;
        }
    }
    
    public void getThongTin(){
        System.out.println("Ten nhan vien: "+ Ten);
        System.out.println("Tuoi: " + Tuoi);
        System.out.println("Dia chi: " + DiaChi);
        System.out.println("Luong " + TienLuong);
        System.out.println("Tong so gio lam: " + TongSoGioLam);
        System.out.println("Tien thuong: " +TinhThuong());
    }
}
