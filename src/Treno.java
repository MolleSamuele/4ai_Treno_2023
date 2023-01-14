/**
 * 
 * <b> classe treno </b>
 * <p> array di oggetti </p>
 * <p> dati in ingresso: </p>
 * <UL>
 *   <LI> nome
 *   <LI> destinazione
 *   <LI> vagoni massimi 
 * </UL>
 *  
 * @author Molle Samuele
 * 
 * versione 2
 *
 */
public class Treno {
	
	/**
	 * nome = nome del treno
	 */
	
	private String nome, destinazione;
	private int numMV;
	private Vagone[] vagoni;
	
	/**
	 * 
	 * @param nome
	 * @param destinazione
	 * @param numMV
	 */
	
	
	public Treno(String nome, String destinazione, int numMV) {
		this.nome = nome;
		this.destinazione = destinazione;
		this.numMV = numMV;
		vagoni=new Vagone[numMV];
	}
	public boolean addVag(int pos, Vagone vag) {
		vagoni[pos]=vag;
		return true;
	}
	
	/**
	 * 
	 * @return metodo che elimina vagone del treno
	 */
	
	public boolean elimVag(int pos) {
		if(vagoni[pos]!=null) {
			vagoni[pos]=new Vagone(null,0);
			return true;
			}
		return false;
	}
	//public int postiL(int pos) {
	//}
	public String toString() {
		String s="	TRENO";
		s+="\nNome del treno = "+nome;
		s+="\nDestinazione = "+destinazione;
		s+="\nNumero massimo di vagoni = "+numMV+"\n";
		
		for(int i=0;i<vagoni.length;i++) {
			if(vagoni[i]!=null)
				s+=vagoni[i]+"\n";
		}
		
		return s;
	}
	public static void main(String[] args) {
		Treno t1=new Treno("Freccia Rossa", "Milano", 10);
		Vagone v1=new Vagone("Prima classe",150);
		Vagone v2=new Vagone("Seconda classe",100);
		System.out.println(t1.addVag(0, v1));
		System.out.println(t1.addVag(1, v2));
		System.out.println(t1);
	}
	
	
}
