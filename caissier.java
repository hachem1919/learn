package ExamenTP;

public class caissier extends employe{
	private int Numcaisse;

	public caissier(int id, String nom, String adresse, double nbr_heures, int numcaisse) {
		super(id, nom, adresse, nbr_heures);
		Numcaisse = numcaisse;
	}

	public int getNumcaisse() {
		return Numcaisse;
	}

	public void setNumcaisse(int numcaisse) {
		Numcaisse = numcaisse;
	}

	@Override
	public String toString() {
		return "caissier [Numcaisse=" + Numcaisse + ", id=" + id + ", nom=" + nom + ", adresse=" + adresse
				+ ", nbr_heures=" + nbr_heures + "]";
	}

	@Override
	public double calculer_salaire() {
		
			double k=0;
			if(nbr_heures>180) {
				double s=nbr_heures*5;
				 k=s+(nbr_heures-180)*(5+5*(15/100));
			}
			else 
				k=nbr_heures*5;
			return k;
		
	}
	
	
}
