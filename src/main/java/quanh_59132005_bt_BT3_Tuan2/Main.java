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
public class Main {
    public static void main(String[] args){
       /* SinhVienPoly sv = new SinhVienPoly("Nuyen Thi Hong Quanh","CNTT") {
            @Override
            public double getDiem() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        sv.xuat();*/
        SinhVienPoly sv1 = new SinhVienIT(7,5,7,"Nuyen Xuong","CNTT");
        sv1.xuat();
        SinhVienPoly sv2 = new SinhVienBiz(8,5,"Tran Hao","kt");
        sv2.xuat();
    }
}
