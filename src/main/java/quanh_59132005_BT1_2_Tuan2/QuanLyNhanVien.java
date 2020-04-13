/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanh_59132005_BT1_2_Tuan2;
import quanh_59132005_BT1_2_Tuan2.NhanVien;
import java.util.ArrayList;
/**
 *
 * @author USER
 */
public class QuanLyNhanVien implements IQuanLy{
    ArrayList<NhanVien> dsNV = new ArrayList<>();

    @Override
    public void themNhanVien(NhanVien nv) {
        dsNV.add(nv);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inDS() {
        for(int i = 0; i<dsNV.size(); i++){
            System.out.println("Nhan vien thu: " +i);
            dsNV.get(i).getThongTin();
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
