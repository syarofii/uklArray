/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import javax.swing.JOptionPane;

/**
 *
 * @author Syarofi
 */
public class cobaSoal {

    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("masukkan nama,kelas,atau nisn");
        String[] nama = {"jono", "joni", "jino", "jini"};
        String[] kelas = {"xr4", "xr5", "xr6", "xr1"};
        String[] nisn = {"1234", "5678", "8765", "4321"};
        String[][] kelompok = {nama, kelas, nisn};
        int b = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (a.equalsIgnoreCase(kelompok[i][j])) {
                    JOptionPane.showMessageDialog(null,
                            ("Nama: " + kelompok[0][j] + "\nkelas: " + kelompok[1][j] + "\nnisn: " + kelompok[2][j]));
                    b = 1;
                }

            }
        }

        if (b == 0) {
            JOptionPane.showMessageDialog(null, "Mohon masukkan dengan benar");
        }
    }
}
