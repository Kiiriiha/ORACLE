package br.com.oracle.itens.equipamentos;

public abstract class Equipamento {
	
	private String nmEquipamento;
	private int forca;
	private int magia;
	private int velocidade;
	private int defesa;
	
	
	
	
	public String getNmEquipamento() {
		return nmEquipamento;
	}
	public void setNmEquipamento(String nmEquipamento) {
		this.nmEquipamento = nmEquipamento;
	}
	
	public int getForca() {
		return forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}
	public int getMagia() {
		return magia;
	}
	public void setMagia(int magia) {
		this.magia = magia;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public int getDefesa() {
		return defesa;
	}
	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}

}
