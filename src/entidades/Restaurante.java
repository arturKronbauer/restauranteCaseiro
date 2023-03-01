package entidades;

public class Restaurante {

	private int mesa;
	private int cerveja;
	private int refrigerante;
	private float kg;
	private int sobremesa;
	private double total;
	private int qtdPessoas;

	public static final float cerv = 12;
	public static final float refri = 6;
	public static final float gramas = 0.06f;
	public static final float sobre = 8;

	public Restaurante() {

	}

	public Restaurante(int mesa, int cerveja, int refrigerante, float kg, int sobremesa, int qtdPessoas) {
		this.mesa = mesa;
		this.cerveja = cerveja;
		this.refrigerante = refrigerante;
		this.kg = kg;
		this.sobremesa = sobremesa;
		this.qtdPessoas = qtdPessoas;
	}

	public int getMesa() {
		return mesa;
	}

	public void setMesa(int mesa) {
		this.mesa = mesa;
	}

	public int getCerveja() {
		return cerveja;
	}

	public void setCerveja(int cerveja) {
		this.cerveja = cerveja;
	}

	public int getRefrigerante() {
		return refrigerante;
	}

	public void setRefrigerante(int refrigerante) {
		this.refrigerante = refrigerante;
	}

	public float getKg() {
		return kg;
	}

	public void setKg(float kg) {
		this.kg = kg;
	}

	public int getSobremesa() {
		return sobremesa;
	}

	public void setSobremesa(int sobremesa) {
		this.sobremesa = sobremesa;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public int getQtdPessoas() {
		return qtdPessoas;
	}

	public void setQtdPessoas(int qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}

	public void addCerveja(int cerveja) {
		this.cerveja += cerveja;
	}

	public void addRefrigerante(int refrigerante) {
		this.refrigerante += refrigerante;
	}

	public void addKg(float kg) {
		this.kg += kg;
	}

	public void addSobremesa(int sobremesa) {
		this.sobremesa += sobremesa;
	}

	public void addQtdPessoas(int qtdPessoas) {
		this.qtdPessoas += qtdPessoas;
	}

	public double calculaConta() {
		total = (cerv * getCerveja()) + (refri * getRefrigerante()) + (gramas * getKg()) + (sobre * getSobremesa());
	    return contaPorPessoa();
	}
	
	private double contaPorPessoa() {
		return total / qtdPessoas;
	}
}
