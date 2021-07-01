public class Mes {
	private String nome;
	private Integer numero;
	private Double temp;
	public Mes(String nome, Integer numero, Double temp) {
		this.nome = nome;
		this.numero = numero;
		this.temp = temp;
	}
	@Override
	public String toString() {
		return "Mes [nome=" + nome + ", numero=" + numero + ", temp=" + temp + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Double getTemp() {
		return temp;
	}
	public void setTemp(Double temp) {
		this.temp = temp;
	}
}
