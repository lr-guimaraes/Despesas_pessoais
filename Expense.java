import java.time.LocalDate;

public class Expense {

	private float value;
	private LocalDate date;
	private String description;
	// outros atributos como:
	//     - categoria (enum com saude, lazer, transporte, educacao etc)
	//     - local da despesa
	// depositos, ou seja, controlar fluxo de entrada/saida
	// etc e tal...

	public Expense(float value, String descricao) {
		super();
		this.value = value;
		this.description = descricao;
		this.date = LocalDate.now();
	}
	
	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDateBr() {
		return date.getDayOfMonth() + "."
		       + date.getMonthValue() + "."
		       + date.getYear();
	}
	
	// redefine/sobrescreve o toString default que herdamos da object
	@Override
	public String toString() {
		return this.getDateBr() + ": R$ " + value + " (" + description + ")";
	}
		
}
