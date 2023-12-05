package org.generationitaly;

public class MobileApp {
	private String nome, sistemaOperativo;
	private Float prezzo, ricavoTotale;
	private Integer totaleValutazione, numeroValutazione;
	private Float media ;
	public MobileApp(String nome, String sistemaOperativo, Float prezzo) {
		this.nome = nome;
		this.sistemaOperativo = sistemaOperativo;
		this.prezzo = prezzo;
		ricavoTotale = 0f;
		totaleValutazione = 0;
		numeroValutazione = 0;

	}

	public void download() {  // singolo download 
		
		ricavoTotale += prezzo;
	}

	public void downnloadMultiplo(Integer numeroDownload) { // download multiplo più di 1 
		ricavoTotale += prezzo * numeroDownload;
	}

	public void riceviValutazione(Integer numeroStelle) {
		totaleValutazione += numeroStelle;
		numeroValutazione++;  
	}
	public void ValutazioneMedia( ) {
  //	Float totaleValutazione = Integer(totaleValutazione);
		// Float tot = totaleValutazione;
	media =  totaleValutazione.floatValue() / numeroValutazione.floatValue();	// dichiarnado float davanti consideri il risultato con la virgola
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (!nome.isEmpty())
			this.nome = nome;
	}

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		if (!sistemaOperativo.isEmpty())
			this.sistemaOperativo = sistemaOperativo;
	}

	public Float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(Float prezzo) {
		if (prezzo >= 0)
			this.prezzo = prezzo;
	}

	public Float getRicavoTotale() {
		return ricavoTotale;
	}

	public void setRicavoTotale(Float ricavoTotale) {
		if (ricavoTotale > 0)
			this.ricavoTotale = ricavoTotale;
	}

	public Integer getTotaleValutazione() {
		return totaleValutazione;
	}

	public void setTotaleValutazione(Integer totaleValutazione) {
		if (totaleValutazione > 0)
			this.totaleValutazione = totaleValutazione;
	}

	public Integer getNumeroValutazione() {
		return numeroValutazione;
	}

	public void setNumeroValutazione(Integer numeroValutazione) {
		if (numeroValutazione > 0)
			this.numeroValutazione = numeroValutazione;
	}
	public Float getValutazioneMedia() {
		return media;
	}

}
