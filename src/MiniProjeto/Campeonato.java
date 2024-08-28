package MiniProjeto;
import java.util.Arrays;
import java.util.Random;

public class Campeonato {
	private Clube [] clubes;
	private int  vagas;
	
	public Campeonato(int vagas) {
		this.clubes = new Clube[vagas];
		this.vagas = vagas;
	}
	
	public void inscreverTime(String nomeTime) {
		int i = 0;
		while(this.getClubes()[i] != null && i < this.getVagas()) {
			i++;
		}
		if (i < this.getVagas()) {
			Clube novo = new Clube(nomeTime);
			setClubes(i, novo);
		}
		}	
	
	
	public void jogarCampeonato() {
		
		for (int casa = 0; casa < this.getVagas(); casa++) {
			for(int fora = 0; fora < this.getVagas(); fora++) {
				if (casa != fora) {
					this.jogarPartida(this.getClubes()[casa] , this.getClubes()[fora]);
				}
			}
		}
	}
	
	private void jogarPartida(Clube casa,  Clube fora) {
		int saldo = 0;
		Random sg = new Random();
		int golsCasa = sg.nextInt(6);
		int golsFora = sg.nextInt(6);
		
		if(golsCasa > golsFora) {
			saldo = golsCasa - golsFora;
		}else if(golsCasa < golsFora){
			saldo = golsFora - golsCasa;
		}
		
		if (golsCasa > golsFora) {
			casa.ganhar(saldo);
			fora.perder(saldo);
		} else if (golsCasa < golsFora) {
			casa.perder(saldo);
			fora.ganhar(saldo);
		} else {
			casa.empatar();
			fora.empatar();
		}
		
	}
	public void getClassificacao() {
		Arrays.sort(this.getClubes());
		for (int i = 0; i < this.getVagas(); i++) {
			System.out.println(this.getClubes()[i].tostring());
		}
	}
	public Clube  getCampeao() {
		Clube campeao = this.getClubes() [0];
		for (int i = 1; i < this.getVagas(); i++) {
			if (this.getClubes()[i].getPontos() > campeao.getPontos()) {
				campeao = this.getClubes()[i];
			} else if (this.getClubes()[i].getPontos() == campeao.getPontos() ) {
							if (this.getClubes()[i].getSaldoGols() > campeao.getSaldoGols()) {
								campeao = this.getClubes()[i];
							}
			}
		}
		return campeao;
	}

	public Clube [] getClubes() {
		return this.clubes;
	}

	public void setClubes(int i , Clube novo) {
		this.clubes[i] = novo;
	}
	
	public int getVagas() {
		return vagas;
	}
}
