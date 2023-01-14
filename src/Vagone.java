/**
 * <b> classe vagone </b>
 * <p> dati in ingresso: </p>
 * <UL>
 *   <LI> classe
 *   <LI> postiTot
 *   <LI> postiOc
 *   <LI> postiL
 * </UL>
 * 
 * @author Molle Samuele
 * 
 * versione 1
 *
 */
public class Vagone {
	/**
	 * classe = classe del vagone
	 */
	private String classe;
	private int postiTot, postiOc, postiL;
	
	/**
	 * 
	 * @param cla
	 * @param pt
	 */
	
	public Vagone(String cla, int pt) {
		classe = cla;
		postiTot = pt;
	}
	public boolean setPostiOc(int p) {
		if(p<postiTot) {
			postiOc=p;
			return true;
		}
		return false;
	}
	public int getPostiL() {
		postiL=postiTot-postiOc;
		return postiL;
	}
	/**
	 * 
	 * @return metodo che calcola il peso
	 */
	public int pesoPass() {
		int peso=postiOc*100;
		return peso;
	}
	public String toString() {
		return "VAGONE"+"\nClasse = " + classe + "\nPosti Totali = " + postiTot + "\nPosti Occupati = " + postiOc +"\nPosti Liberi = "+ postiL;
	}
	
	/**
	 * metodo test di classe
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		Vagone v1=new Vagone("Prima classe",150);
		v1.postiOc=40;
		v1.getPostiL();
		System.out.println(v1);
		System.out.println("Peso = "+ v1.pesoPass()+"kg");
		Vagone v2=new Vagone("Seconda classe",100);
		v2.postiOc=70;
		v2.getPostiL();
		System.out.println(v2);
		System.out.println("Peso = "+ v2.pesoPass()+"kg");
	}
}
