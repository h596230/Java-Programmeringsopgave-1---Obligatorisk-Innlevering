package no.hvl.dat100;

import java.text.DecimalFormat;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;



public class Skatt {
    private static DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        //
        //varibler
        int tallTxt = parseInt(showInputDialog("Inntekt:"));
        double skatt = 1;
        String skattText = "Ingen trinnskatt";
        //if
        if (tallTxt >= 184000 && tallTxt <= 260100){
            skatt = 1.017;
            skattText = "1,7 % trinnskatt";
        }
        else if (tallTxt >= 260101 && tallTxt <= 651250) {
            skatt = 1.04;
            skattText = "4 % trinnskatt";
        }
        else if (tallTxt >= 651251 && tallTxt <= 1021550){
            skatt = 1.132;
            skattText = "13,2 % trinnskatt";
        }
        else if (tallTxt >= 1021551){
            skatt = 1.162;
            skattText = "16,2 % trinnskatt";
        }
        //
        double etterSkatt = tallTxt * skatt;
        showMessageDialog(null,"Inntekt: " + tallTxt + "\n" + skattText + "\n" + "Etterskatt: " + df.format(etterSkatt));
    }
}