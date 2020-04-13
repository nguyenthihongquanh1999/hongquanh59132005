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
public class Main {
    
    public static void main(String[] args){
        
        QLChuyenXe qlcx = new QLChuyenXe();
        CXNoiThanh cxnoithanh = new CXNoiThanh(10,1,"CX1","Nguyen Minh","123456",100000);
        CXNgoaiThanh cxngoaithanh = new CXNgoaiThanh("Khanh Hoa",10,"Tran Tan","CX2","234567",1000000);
        
        qlcx.themChuyenXe(cxnoithanh);
        qlcx.themChuyenXe(cxngoaithanh);
        
        System.out.println("Tong doanh thu noi thanh: " + qlcx.tinhDoanhThuNoiThanh());
        System.out.println("Tong doanh thi ngoai thanh: " + qlcx.tinhDoanhThuNgoaiThanh());
    }
}
