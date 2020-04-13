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
public class CXNoiThanh extends ChuyenXe{
    double Sokm;
    int SoTuyen;

    public CXNoiThanh() {
    }

    public CXNoiThanh(double Sokm, int SoTuyen, String MaSoChuyen, String HoTenTaiXe, String SoXe, double DoanhThu) {
        super(MaSoChuyen, HoTenTaiXe, SoXe, DoanhThu);
        this.Sokm = Sokm;
        this.SoTuyen = SoTuyen;
    }

    public double getSokm() {
        return Sokm;
    }

    public void setSokm(double Sokm) {
        this.Sokm = Sokm;
    }

    public int getSoTuyen() {
        return SoTuyen;
    }

    public void setSoTuyen(int SoTuyen) {
        this.SoTuyen = SoTuyen;
    }

    @Override
    public void ThongTin() {
         //To change body of generated methods, choose Tools | Templates.
        System.out.println("So Km: " + Sokm);
        System.out.println("So tuyen: " + SoTuyen);
    }
    
    
    
}
