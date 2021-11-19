import java.time.LocalDate;

public class Despesa {

	private float valor;
	private LocalDate data;
	private String descricao;
	// outros atributos como:
	//     - categoria (enum com saude, lazer, transporte, educacao etc)
	//     - local da despesa
	// depositos, ou seja, controlar fluxo de entrada/saida
	// etc e tal...

	public Despesa(float valor, String descricao) {
		super();
		this.valor = valor;
		this.descricao = descricao;
		this.data = LocalDate.now();
	}
	
	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDataBr() {
		return data.getDayOfMonth() + "."
		       + data.getMonthValue() + "."
		       + data.getYear();
	}
	
	// redefine/sobrescreve o toString default que herdamos da object
	@Override
	public String toString() {
		return this.getDataBr() + ": R$ " + valor + " (" + descricao + ")";
	}
		
}
