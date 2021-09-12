package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Karakter {
    public static void main(String[] args) {
        //
        final int ANTALL_GANGER = 10;
        char karakter= '!';
        String karakterTxt = "Du fikk: ";
        String inputText = "Skriv in poeng sum";
        //
        for(int i = 1; i <= ANTALL_GANGER; i++){
            //
            int poeng = parseInt(showInputDialog(inputText));
            if(poeng >= 101 || poeng < 0){
                inputText = "Skriv in poeng sum, igjen!";
                karakterTxt = "Feil poeng sum";
                karakter = '!';
            System.out.println(i +". " + karakterTxt + karakter);
            i--;

            }else if(poeng >= 0 && poeng <= 100) {
                if (poeng <= 100 && poeng >= 90) {
                    karakter = 'A';
                } else if (poeng <= 89 && poeng >= 80) {
                    karakter = 'B';
                } else if (poeng <= 79 && poeng >= 60) {
                    karakter = 'C';
                } else if (poeng <= 59 && poeng >= 50) {
                    karakter = 'D';
                } else if (poeng <= 49 && poeng >= 40) {
                    karakter = 'E';
                } else if (poeng <= 39 && poeng >= 0) {
                    karakter = 'F';
                }
                inputText = "Skriv in poeng sum";
                System.out.println(i + ". " + karakterTxt + karakter);
            }
            karakterTxt = "Du fikk: ";
        }

    }
}
