/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanh_59132005_BT4_Tuan2;
import java.util.ArrayList;
/**
 *
 * @author USER
 */
public class QLChuyenXe {
    ArrayList<ChuyenXe> DSChuyenXe = new ArrayList<>();

    public QLChuyenXe() {
    }
    
    public void themChuyenXe(ChuyenXe cx){
        DSChuyenXe.add(cx);
    }
    
    public void inDS(){
        for(int i=0; i<DSChuyenXe.size(); i++){
            DSChuyenXe.get(i).ThongTin();
                
        }
    }
    
    public double tinhDoanhThuNoiThanh(){
        double TongTien = 0;
        for(int i=0;i<DSChuyenXe.size(); i++){
            if(DSChuyenXe.get(i) instanceof CXNoiThanh){
                TongTien += DSChuyenXe.get(i).getDoanhThu();
            }
        }
        return TongTien;
    }
    
    public double tinhDoanhThuNgoaiThanh(){
        double TongTien = 0;
        for(int i=0; i<DSChuyenXe.size(); i++){
            if(DSChuyenXe.get(i) instanceof CXNgoaiThanh){
                TongTien += DSChuyenXe.get(i).getDoanhThu();
            }
        }
        return TongTien;
     
    }
    
    public double tongDoanhThu(){
        double TongTien = 0;
        for(int i = 0; i<DSChuyenXe.size(); i++){
            TongTien = DSChuyenXe.get(i).getDoanhThu();
        }
        return TongTien;
    }
}
