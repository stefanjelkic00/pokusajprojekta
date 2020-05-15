package korisnici;

public class Serviser extends Korisnik {
	private String plata;
	public Serviser() {
		super();
		this.plata = "";
	}
	public Serviser(String ime, String prezime, String jMBG, String pol, String adresa, String broj_telefona,
			String korisnicko_ime, String plata) {
		super(ime, prezime, jMBG, pol, adresa, broj_telefona, korisnicko_ime);
		this.plata = plata;
	}
	public String getPlata() {
		return plata;
	}
	public void setPlata(String plata) {
		this.plata = plata;
	}
	@Override
	public String toString() {
		return "Administrator [plata=" + plata + ", ime=" + ime + ", prezime=" + prezime + ", JMBG=" + JMBG + ", pol="
				+ pol + ", adresa=" + adresa + ", broj_telefona=" + broj_telefona + ", korisnicko_ime=" + korisnicko_ime
				+ "]";
	}
	
}
