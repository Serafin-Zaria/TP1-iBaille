package iBaille;

public class Produit {

	private int numero,prixInitial,pasEnchere = 10,coutParticipation;
	private String description;
	private boolean disponible;
	
	
	public Produit(int numero, int prixInitial, int coutParticipation, String description, boolean disponible) {
		super();
		this.numero = numero;
		this.prixInitial = prixInitial;
		this.coutParticipation = coutParticipation;
		this.description = description;
		this.disponible = disponible;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getPrixInitial() {
		return prixInitial;
	}
	public void setPrixInitial(int prixInitial) {
		this.prixInitial = prixInitial;
	}
	public int getPasEnchere() {
		return pasEnchere;
	}
	public void setPasEnchere(int pasEnchere) {
		this.pasEnchere = pasEnchere;
	}
	public int getCoutParticipation() {
		return coutParticipation;
	}
	public void setCoutParticipation(int coutParticipation) {
		this.coutParticipation = coutParticipation;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	
	public void demarrerEnchere() {
		
		if(!isDisponible())
			setDisponible(true);
	}
	
	
	
	
}
