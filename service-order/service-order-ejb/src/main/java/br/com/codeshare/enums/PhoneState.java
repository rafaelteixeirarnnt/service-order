package br.com.codeshare.enums;

public enum PhoneState {

	NO_CHIP(0,"Sem chip"),
	MEMORY_CARD(1,"Cartão de memória"),
	COVER(2,"Tampa"),
	BATTERY(3,"Bateria");
	
	private PhoneState(Integer cod, String label) {
		this.cod = cod;
		this.label = label;
	}
	
	private Integer cod;
	private String label;
	public Integer getCod() {
		return cod;
	}
	public void setCod(Integer cod) {
		this.cod = cod;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
	
	
}
