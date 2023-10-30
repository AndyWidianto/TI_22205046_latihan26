/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package saldo;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author HP
 */
public class TI_22205046_latihan26 {

    public static void main(String[] args) {
        Date hariSekarang = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("EEEE dd MMMM yyyy hh:mm:ss");
        
        System.out.println("Hari in adalah hari :"+ ft.format(hariSekarang));
    }
}
