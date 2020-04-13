/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanh_59132005_BT4_Tuan2;

/**
 *
 * @author USER
 */
public class ChuyenXe {
    String MaSoChuyen;
    String HoTenTaiXe;
    String SoXe;
    double DoanhThu;

    public ChuyenXe() {
    }

    public ChuyenXe(String MaSoChuyen, String HoTenTaiXe, String SoXe, double DoanhThu) {
        this.MaSoChuyen = MaSoChuyen;
        this.HoTenTaiXe = HoTenTaiXe;
        this.SoXe = SoXe;
        this.DoanhThu = DoanhThu;
    }

    public String getMaSoChuyen() {
        return MaSoChuyen;
    }

    public void setMaSoChuyen(String MaSoChuyen) {
        this.MaSoChuyen = MaSoChuyen;
    }

    public String getHoTenTaiXe() {
        return HoTenTaiXe;
    }

    public void setHoTenTaiXe(String HoTenTaiXe) {
        this.HoTenTaiXe = HoTenTaiXe;
    }

    public String getSoXe() {
        return SoXe;
    }

    public void setSoXe(String SoXe) {
        this.SoXe = SoXe;
    }

    public double getDoanhThu() {
        return DoanhThu;
    }

    public void setDoanhThu(double DoanhThu) {
        this.DoanhThu = DoanhThu;
    }

   public void ThongTin(){
       System.out.println("Ma so chuyen: " + MaSoChuyen);
       System.out.println("Ho va ten tai xe: " + HoTenTaiXe);
       System.out.println("So xe: " + SoXe);
       System.out.println("Danh thu:" + DoanhThu);
   }
    
}
