package br.edu.ifs.util;

public abstract class CalculosSalariais {
	
	public static double calcularSalarioLiquidoProfessor (double salarioLiquidoProfessor) {
		if (salarioLiquidoProfessor >= 2000) {
			salarioLiquidoProfessor *= 0.73;
			
		}else {
			salarioLiquidoProfessor *= 0.85;
		}
		
		return salarioLiquidoProfessor;
				
	}
	

}
