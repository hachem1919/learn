package ExamenTP;
import java.util.Vector;
public class departement {
	
	private Vector<employe>emp;
	private int taille;
	private int id;
	private String nom;
	private int Nbre_emp;
	private int Ensemble_emp;
	
    departement( int taille, int id, String nom, int nbre_emp, int ensemble_emp) {
		emp=new Vector<employe>(taille);
		this.taille = taille;
		this.id = id;
		this.nom = nom;
		Nbre_emp = nbre_emp;
		Ensemble_emp = ensemble_emp;
	}
	
	
	public void ajouter(employe em) {
		if((!emp.contains(em))&&(emp.size()<emp.capacity())) {
			emp.add(em);
		}
		else
			System.out.println("l'employe est deja existant");
	}
	
	public void supprimer(employe em) {
		for(int i=0;i<emp.size();i++) {
			if(emp.get(i).getNom()==em.getNom()) {
				emp.remove(em);
			}
			else
				System.out.println("l'employe est deja inexistant");
		}
	}
	
	public  void chercher(employe em) {
		for(int i=0;i<emp.size();i++) {
			if(emp.get(i).getNom()==em.getNom()) {
				System.out.println("employe existant");
			}
			else
				System.out.println("l'employe n'existe pas");
             
		}
	}
	
	public void affiche() {
		double s=0;
		for(int i=0;i<emp.size();i++) {
			System.out.println("departement [taille=" + taille + ", id=" + id + ", nom=" + nom + ", Nbre_emp="
					+ Nbre_emp + ", Ensemble_emp=" + Ensemble_emp + "]");
			s=s+emp.get(i).calculer_salaire();
		}
		System.out.println("la masse salaire="+s);
	}


	@Override
	public String toString() {
		return "departement [emp=" + emp + ", taille=" + taille + ", id=" + id + ", nom=" + nom + ", Nbre_emp="
				+ Nbre_emp + ", Ensemble_emp=" + Ensemble_emp + "]";
	}



	
	

}
