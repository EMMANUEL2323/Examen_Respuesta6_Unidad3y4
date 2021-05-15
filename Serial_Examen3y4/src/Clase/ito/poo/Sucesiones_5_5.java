package Clase.ito.poo;

import javax.swing.JOptionPane;

public class Sucesiones_5_5 {
	public static void main(String[] args) {
	
		int op;
		int ro = 0;
		do {
			
			 op =Integer.parseInt(JOptionPane.showInputDialog("¿Desea comenzar?" + "\n1.-Si."));
		Susecion_5_5 inter = new Susecion_5_5();
		for (int i=0; i<5;i++) {
		JOptionPane.showMessageDialog(null, "El numero siguiente es "+inter.siguiente());
		
		JOptionPane.showMessageDialog(null, "\nReintentando");
		inter.reiniciar();
		
		for (int x=0; x<5;x++) {
		JOptionPane.showMessageDialog(null, "El número siguiente es "+inter.siguiente());
				
		 ro =Integer.parseInt(JOptionPane.showInputDialog("¿Que numero quiere iniciar?" ));
		inter.iniciar(ro);
		
		for (int j=0; j<19;j++) {
		JOptionPane.showMessageDialog(null, "El numero siguiente es"+inter.siguiente());
		
		}
		JOptionPane.showMessageDialog(null, "Fin del programa");
		ro =Integer.parseInt(JOptionPane.showInputDialog("¿Que numero quiere iniciar?" ));
		inter.iniciar(ro);
		}
		}
		} while(ro==1);
	
	}

	}