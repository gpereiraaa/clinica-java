/*
 * Desenvolvido por Gustavo
 * 19/02/2025
 * 
 */

package br.senai.sp.jandira.clinica;

import java.time.LocalDate;

import br.senai.sp.jandira.clinica.model.Paciente;

public class Clinica {

	public static void main(String[] args) {
		
		// Criação dos objetos do tipo paciente
		Paciente p1 = new Paciente();
		p1.nome = "Ana Maria";
		p1.altura = 1.65;
		p1.peso = 68.200;
		p1.telefone = "(11)98888-8888";
		p1.dataNascimento = LocalDate.of(2003, 7, 15);
		p1.estaInternado = true;
		
		
		
		Paciente p2 = new Paciente();
		p2.nome = "Gustavo Pereira";
		p2.altura = 1.77;
		p2.peso = 80.000;
		p2.telefone = "(11)95886-3949";
		p2.dataNascimento = LocalDate.of(2007, 4, 11);
		p2.estaInternado = false;
		
		
		// Mostrar dados do paciente 1
		p1.mostrarFichaPaciente();
		p2.mostrarFichaPaciente();
	}

}
