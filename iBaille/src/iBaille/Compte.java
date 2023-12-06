package iBaille;

import java.util.ArrayList;

public class Compte {
		
		private String psudo;
		private int solde;
		ArrayList<Produit> produitAchetes = new ArrayList<>();
		
		
		public Compte(String psudo, int solde, ArrayList<Produit> produitAchetes) {
			super();
			this.psudo = psudo;
			this.solde = solde;
			this.produitAchetes = produitAchetes;
		}

		public int getSolde() {
			return solde;
		}		
		
		public void crediter(int somme) {
			
			if((solde + somme) < 0) {
				solde = 0;
			}else {
				solde = solde + somme;
			}
			
		}
		
}
