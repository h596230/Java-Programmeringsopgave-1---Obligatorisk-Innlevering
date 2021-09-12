package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
 
public class Fakultet {
	
	public static void main(String[]args) {
		
		int tall = Integer.parseInt(showInputDialog("fakultet"));
		int fakultet = 1; 
		String melding = tall +"! = ";
		if(tall > 0) {
			for(int i = 1; i < tall + 1; i++) {
				fakultet = fakultet*i;
				if(i == 1) {
					melding += 1;
				}else {
					melding += "*"+i;
				}
			}
		}	
		melding += " = "+fakultet; 
		showMessageDialog(null, melding);	
	}

}