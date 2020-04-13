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
public class SinhVienBiz extends SinhVienPoly{
    double Makerting;
    double Sales;

    public SinhVienBiz() {
    }

    public SinhVienBiz(double Makerting, double Sales, String HoTen, String Nganh) {
        super(HoTen, Nganh);
        this.Makerting = Makerting;
        this.Sales = Sales;
    }

    public double getMakerting() {
        return Makerting;
    }

    public void setMakerting(double Makerting) {
        this.Makerting = Makerting;
    }

    public double getSales() {
        return Sales;
    }

    public void setSales(double Sales) {
        this.Sales = Sales;
    }

    @Override
    public double getDiem() {
        return (2*Makerting + Sales)/3;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
