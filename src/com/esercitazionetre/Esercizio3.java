package com.esercitazionetre;

import javax.swing.JOptionPane;

public class Esercizio3 {

	/*
	 * Realizzare un programma che, prese come input due stringhe rappresentanti
	 * nome e cognome, stampi le iniziali facendo uso del metodo concat.
	 */

	public static void main(String[] args) {

		// Input di Nome e Cognome
		String nome = JOptionPane.showInputDialog("Inserire il Nome");

		String cognome = JOptionPane.showInputDialog("Inserire il Nome");

		// Memorizzazione delle Iniziale
		String inizialeNome = nome.substring(0, 1);

		String inizialeCognome = cognome.substring(0, 1);

		// Stampa delle Iniziali con "concat"

		String inizialiConcatenate = inizialeNome.concat(inizialeCognome);

		System.out.println(inizialiConcatenate);

	}

}
