package MiniProjeto;

import java.util.Scanner;
public class Teste {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		Campeonato br = new Campeonato(20);
	
		for (int i = 1; i <= 20; i++) {	
			System.out.println("Escreva o nome do " + i + "º time:");
			String nomeTime = leitor.nextLine();
			br.inscreverTime(nomeTime);
		}	
		
		leitor.close();
		
		br.jogarCampeonato();
		
		System.out.println("O time campeão é: " + br.getCampeao().getNome() + "\n");
		
		br.getClassificacao();
	}
}
