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
public class HocSinh extends CaNhan{
    String Lop;
   String NangKhieu;

    public HocSinh() {
    }

    public HocSinh(String Lop, String NangKhieu, String HoTen, int Tuoi, String DiaChi, String sdt) {
        super(HoTen, Tuoi, DiaChi, sdt);
        this.Lop = Lop;
        this.NangKhieu = NangKhieu;
    }

     
    @Override
    public void HienThiTT() {
        System.out.println("Lop hoc: " + Lop);
        System.out.println("Nang khieu: " + NangKhieu);
        System.out.println("Ho và ten hoc sinh: " +HoTen);
        System.out.println("Tuoi: " + Tuoi);
        System.out.println("Dia chi: " + DiaChi);
        System.out.println("So dien thoai: " + sdt);
        
        

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    public String getNangKhieu() {
        return NangKhieu;
    }

    public void setNangKhieu(String NangKhieu) {
        this.NangKhieu = NangKhieu;
    }
    
    
   
}
