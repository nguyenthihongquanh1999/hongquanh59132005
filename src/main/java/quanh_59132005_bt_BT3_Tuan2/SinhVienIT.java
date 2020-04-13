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
public class SinhVienIT extends SinhVienPoly{
    double java;
    double html;
    double css;

    public SinhVienIT() {
    }

    public SinhVienIT(double java, double html, double css, String HoTen, String Nganh) {
        super(HoTen, Nganh);
        this.java = java;
        this.html = html;
        this.css = css;
    }

    public double getJava() {
        return java;
    }

    public void setJava(double java) {
        this.java = java;
    }

    public double getHtml() {
        return html;
    }

    public void setHtml(double html) {
        this.html = html;
    }

    public double getCss() {
        return css;
    }

    public void setCss(double css) {
        this.css = css;
    }

    @Override
    public double getDiem() {
        return (2*java + html + css)/4;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
