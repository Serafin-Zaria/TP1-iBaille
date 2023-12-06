package iBaille;

public class OffreEnchere {
		
	private int prixEnCours,prixMax;
	private boolean etatGagnant;
	public Produit produit;
	
	
	public OffreEnchere(int prixEnCours, int prixMax, Produit produit) {
		super();
		this.prixEnCours = prixEnCours;
		this.prixMax = prixMax;
		this.etatGagnant = false;
		this.produit = produit;
	}

	public int getPrixEnCours() {
		return prixEnCours;
	}

	public int getPrixMax() {
		return prixMax;
	}

	public void setEtatGagnant(boolean etatGagnant) {
		this.etatGagnant = etatGagnant;
	}

	public void setPrixEnCours(int prixEnCours) {
		this.prixEnCours = prixEnCours;
	}

	public void setPrixMax(int prixMax) {
		this.prixMax = prixMax;
	}
	
	
	
	
	
}
