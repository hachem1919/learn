package ExamenTP;

public class employe {
	public int id;
	public String nom;
	public String adresse;
	public double nbr_heures;
	
	
	
	public employe(int id, String nom, String adresse, double nbr_heures) {
		super();
		this.id = id;
		this.nom = nom;
		this.adresse = adresse;
		this.nbr_heures = nbr_heures;
	}

    public double  calculer_salaire() {
    	return 0;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getAdresse() {
		return adresse;
	}



	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}



	public double getNbr_heures() {
		return nbr_heures;
	}



	public void setNbr_heures(double nbr_heures) {
		this.nbr_heures = nbr_heures;
	}



	@Override
	public String toString() {
		return "employe [id=" + id + ", nom=" + nom + ", adresse=" + adresse + ", nbr_heures=" + nbr_heures + "]";
	}
	
	
	
}
