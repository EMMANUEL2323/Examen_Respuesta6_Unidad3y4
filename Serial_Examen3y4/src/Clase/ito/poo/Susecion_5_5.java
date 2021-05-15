package Clase.ito.poo;

import java.util.Scanner;

import Interfaces.ito.poo.Serial;

public class Susecion_5_5 implements Serial {

long valor, iniciar;
	
	public Susecion_5_5() {
		iniciar=0;
		valor=0;
	}

	@Override
	public void reiniciar() {
	
		valor=iniciar;
		
	}
	@Override
	public void iniciar(long x) {
		iniciar=x;
		valor=x;
		
	}
	@Override
	public long siguiente() {
		valor+=5;
		return valor;
	}
}
