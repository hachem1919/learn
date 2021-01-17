package bankacc;
import java.util.Scanner;
public class compte {
	 private int numeroCompte;
	    private double solde;
	    private client titulaire;
	    private int count=1;

	    public compte(double solde,client titulaire){
	        this.solde=solde;
	        this.titulaire=titulaire;
	        this.numeroCompte=count;
	        count++;
	    }
	    public compte(){
	        this.solde=0;
	        this.titulaire=null;
	    }
	    public int getNumeroCompte(){
	        return numeroCompte;
	    }
	    public client getTitulaire(){
	        return titulaire;
	    }
	    public double getSolde(){
	        return solde;
	    }
	    public void setTitulaire(client titulaire){
	        this.titulaire=titulaire;
	    }
	    public void setSolde(double solde){
	        this.solde=solde;
	    }
	    public String toString(){
	        return numeroCompte+"\t"+titulaire+"\t"+solde;
	    }
	    public void retrait(){
	        System.out.println("donner le montant:");
	        Scanner M=new Scanner(System.in);
	        double montant=M.nextDouble();
	        if(montant< getSolde()){
	            System.out.println("retrait de vos billets");
	            setSolde(solde-montant);
	            System.out.println(getSolde());}
	        else if(montant==getSolde()){
	            System.out.println("retrait de vos billets");
	            setSolde(0);
	            System.out.println(getSolde());
	        }
	        else if(montant>getSolde()){
	            System.out.println("solde insuffisant");
	        }
	    }
	    public void versement(){
	        System.out.println("donner le montant ");
	        Scanner M=new Scanner(System.in);
	        double montant=M.nextDouble();
	        setSolde(solde+montant);
	        System.out.println("versement avec succes");
	        System.out.println(getSolde());
	    }
	    public void transfert(compte C){
	        System.out.println("donner le montant ");
	        Scanner M=new Scanner(System.in);
	        double montant=M.nextDouble();
	        if(montant<=getSolde()){
	            setSolde(solde-montant);
	            C.setSolde(C.getSolde()+montant);
	            System.out.println("succés du transfert !");
	            System.out.println(getTitulaire()+"  "+ getSolde()+"\n"+C.getTitulaire()+"  "+C.getSolde());
	        }
	        else{
	            System.out.println("transfert impossible");
	        }
	    }
	    public void consultation(){
	        System.out.println("votre solde est : "+getSolde());
	    }
	    public void services(compte C){
	        System.out.println("les operations sur ce compte sont : \n versement \n retrait \n transfert \n consulation");
	        Scanner element=new Scanner(System.in);
	        System.out.println("donner votre choix:");
	        String choix=element.nextLine();
	        switch(choix){
	            case "versement":
	                versement();
	                break;
	            case "retrait":
	                retrait();
	                break;
	            case "transfert":
	                transfert(C);
	                break;
	            case "consultation":
	                consultation();
	                break;
	        }
	    }

}
