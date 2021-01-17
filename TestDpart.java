package ExamenTP;

public class TestDpart {
	public static void main(String [] args) {
		departement dept=new departement(50,20, "RH",18,25);
		employe emp1=new employe(1, "hachem", "nabeul", 150);
		employe emp2=new employe(4, "heni", "sousse", 140);
		
		dept.ajouter(emp1);
        dept.ajouter(emp2);
		dept.supprimer(emp1);
		dept.chercher(emp2);
		dept.affiche();
	}

}
