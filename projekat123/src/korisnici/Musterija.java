package korisnici;

public class Musterija extends Korisnik {


	private int broj_sakupljenih_nagradnih_bodova; 
	
	public Musterija() {
		super();
		this.broj_sakupljenih_nagradnih_bodova = 0; 
	}

	public Musterija(String ime, String prezime, String jMBG, String pol, String adresa, String broj_telefona,
			String korisnicko_ime, int broj_sakupljenih_nagradnih_bodova) {
		super(ime, prezime, jMBG, pol, adresa, broj_telefona, korisnicko_ime);
		this.broj_sakupljenih_nagradnih_bodova = broj_sakupljenih_nagradnih_bodova;
	}

	public int getBroj_sakupljenih_nagradnih_bodova() {
		return broj_sakupljenih_nagradnih_bodova;
	}

	public void setBroj_sakupljenih_nagradnih_bodova(int broj_sakupljenih_nagradnih_bodova) {
		this.broj_sakupljenih_nagradnih_bodova = broj_sakupljenih_nagradnih_bodova;
	}

	@Override
	public String toString() {
		return "Musterija [broj_sakupljenih_nagradnih_bodova=" + broj_sakupljenih_nagradnih_bodova + ", ime=" + ime
				+ ", prezime=" + prezime + ", JMBG=" + JMBG + ", pol=" + pol + ", adresa=" + adresa + ", broj_telefona="
				+ broj_telefona + ", korisnicko_ime=" + korisnicko_ime + "]";
	}

	
	
	
	
	
	
	
}