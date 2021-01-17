package bankacc;

public class testCompte {
	public static void main(String [] args){
        client Cl1=new client(1,"chtourou","mouna");
        client Cl2=new client(2,"chtourou","ons");
        compte C1=new compte(400,Cl1);
        compte C2=new compte(700,Cl2);
        C1.services(C2);



    }

}
