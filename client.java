package bankacc;

public class client {
	private String nom;
    private String prenom;
    private int id;

    public client(int id,String nom,String prenom){
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
    }
    public client(){
        this.id=0;
        this.nom=null;
        this.prenom=null;
    }
    public int getId(){
        return id;
    }
    public String getNom(){
        return nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setNom(String nom){
        this.nom=nom;
    }
    public void srtPrenom(String prenom){
        this.prenom=prenom;
    }
    public String toString(){
        return prenom+" "+nom;
    }

}
