package korisnici;



public abstract class Korisnik {
	protected String ime;
	protected String prezime ;
	protected String JMBG  ;
	protected String pol ;
	protected String adresa;
	protected String broj_telefona ;
	protected String korisnicko_ime ;
	
	public Korisnik() {
		this.ime = "";
		this.prezime = "";
		this.JMBG = "";
		this.pol = "";
		this.adresa = "";
		this.broj_telefona = "";
		this.korisnicko_ime = "";


	}
	
	
	public Korisnik(String ime, String prezime, String jMBG, String pol, String adresa, String broj_telefona,
			String korisnicko_ime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.JMBG = jMBG;
		this.pol = pol;
		this.adresa = adresa;
		this.broj_telefona = broj_telefona;
		this.korisnicko_ime = korisnicko_ime;
	}


	public String getIme() {
		return ime;
	}


	public void setIme(String ime) {
		this.ime = ime;
	}


	public String getPrezime() {
		return prezime;
	}


	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}


	public String getJMBG() {
		return this.JMBG;
	}


	public void setJMBG(String jMBG) {
		this.JMBG = jMBG;
	}


	public String getPol() {
		return pol;
	}


	public void setPol(String pol) {
		this.pol = pol;
	}


	public String getAdresa() {
		return adresa;
	}


	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}


	public String getBroj_telefona() {
		return broj_telefona;
	}


	public void setBroj_telefona(String broj_telefona) {
		this.broj_telefona = broj_telefona;
	}


	public String getKorisnicko_ime() {
		return korisnicko_ime;
	}


	public void setKorisnicko_ime(String korisnicko_ime) {
		this.korisnicko_ime = korisnicko_ime;
	}


	@Override
	public String toString() {
		return "Korisnik [ime=" + ime + ", prezime=" + prezime + ", JMBG=" + JMBG + ", pol=" + pol + ", adresa="
				+ adresa + ", broj_telefona=" + broj_telefona + ", korisnicko_ime=" + korisnicko_ime + "]";
	}

	

}




