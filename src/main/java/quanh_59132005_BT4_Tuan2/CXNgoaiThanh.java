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
public class CXNgoaiThanh extends ChuyenXe{
    String NoiDen;
    int SoNgay;

    public CXNgoaiThanh() {
    }

    public CXNgoaiThanh(String NoiDen, int SoNgay, String MaSoChuyen, String HoTenTaiXe, String SoXe, double DoanhThu) {
        super(MaSoChuyen, HoTenTaiXe, SoXe, DoanhThu);
        this.NoiDen = NoiDen;
        this.SoNgay = SoNgay;
    }

    public String getNoiDen() {
        return NoiDen;
    }

    public void setNoiDen(String NoiDen) {
        this.NoiDen = NoiDen;
    }

    public int getSoNgay() {
        return SoNgay;
    }

    public void setSoNgay(int SoNgay) {
        this.SoNgay = SoNgay;
    }

    @Override
    public void ThongTin() {
        super.ThongTin(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Noi den: " + NoiDen);
        System.out.println("So ngay: " + SoNgay);
    }
    
    
}
