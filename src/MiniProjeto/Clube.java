package MiniProjeto;

public class Clube  implements Comparable<Object>{
	private String nome;
	private int pontos;
	private int saldoGols;
	private int vitorias;
	private int empates;
	private int derrotas;
	private int jogos;
	
	public Clube(String nome) {
		this.nome = nome;
		this.pontos = 0;
		this.saldoGols = 0;
		this.derrotas = 0;
		this.empates = 0;
		this.vitorias = 0;
		this.jogos = 0;
	}

	void ganhar(int saldoGols) {
		this.setVitorias(this.getVitorias() + 1);
		this.setJogos(this.getJogos() + 1);
		this.setSaldoGols(this.getSaldoGols() + saldoGols);
		this.setPontos(this.getPontos() + 3);
	}

	void empatar() {
		this.setEmpates(this.getEmpates() + 1);
		this.setJogos(this.getJogos() + 1);
		this.setPontos(this.getPontos() + 1);	
	}
	
	void perder(int saldoGols) {
		this.setDerrotas(this.getDerrotas() + 1);
		this.setJogos(this.getJogos() + 1);
		this.setSaldoGols(this.getSaldoGols() - saldoGols);
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getJogos() {
		return jogos;
	}

	public void setJogos(int jogos) {
		this.jogos = jogos;
	}
	
	public int getSaldoGols() {
		return saldoGols;
	}
	
	public void setSaldoGols(int saldoGols) {
		this.saldoGols = saldoGols;
	}
	
	public int getPontos() {
		return pontos;
	}
	
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	
	@Override
	public int compareTo(Object obj) {
		if (obj instanceof Clube) {
			Clube var = (Clube) obj;
			if (this.getPontos() > var.getPontos()) {
				return -1;
			} else if (this.getPontos() == var.getPontos() ) {
							return -1;
			} else if (this.getPontos() < var.getPontos()) {
							return 1;
			} else {
				return 0;}
	}
		return 0;
	}
 
	public String tostring() {
		return  "|" + this.getNome() +"| Pontos: " + this.getPontos() + 
				"| Jogos: " + this.getJogos() + "| Vitorias: " + this.getVitorias() + "| Empates: " + this.getEmpates() + 
				"| Derrotas: " + this.getDerrotas() + "| Saldo de Gols: " + this.getSaldoGols() + " |";

	}
	
	
	
}
