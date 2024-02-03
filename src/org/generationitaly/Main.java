package org.generationitaly;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		 * Scrivere una classe MobileApp contenente i seguenti attributi:
		 * 
		 * nome: stringa sistemaOperativo: stringa prezzo: float totaleValutazioni:
		 * intero numeroValutazioni: intero ricavoTotale: float e i seguenti metodi:
		 * 
		 * MobileApp(String nome, String sistemaOperativo, float prezzo) (costruttore
		 * della classe: inizializza gli attributi nome, sistemaOperativo, prezzo in
		 * base ai parametri passati; inizializza totaleValutazioni, numeroValutazioni,
		 * ricavoTotale a 0) download(): incrementa il ricavoTotale del valore del
		 * prezzo download(int numeroDownload): incrementa il ricavoTotale del valore
		 * del prezzo*numeroDownload riceviValutazione(int numeroStelle): l'app riceve
		 * una valutazione da 1 a 5 stelle, e si aggiornano gli attributi
		 * totaleValutazioni e numeroValutazioni float valutazioneMedia(): restituisce
		 * la valutazione media ricevuta finora Nella classe Main:
		 * 
		 * chiedere all'utente di inserire nome, sistemaOperativo, prezzo dell'app
		 * creare un oggetto della classe MobileApp passando al costruttore i parametri
		 * inseriti dall'utente creare un menu con le seguenti voci: - download singolo
		 * - download multiplo (in questo caso chiedere all'utente il numero di download
		 * da effettuare) - ricevi valutazione (in questo caso chiedere all'utente il
		 * numero di stelle da assegnare - da 1 a 5) - esci dopo ogni chiamata ad una
		 * voce di menu visualizzare i dati della mobile app (valutazione media, ricavo
		 * totale)
		 */
		
		Scanner sc = new Scanner(System.in);
		String risposta,scelta;
		String nome,sistemaOperativo,download;
		float prezzo,media;
		int quantit,stelle;
		do 
		{
			System.out.println("DAJE ROMA DAJE ");
			System.out.print("Che nome vuoi dare all'applicazione?");
			nome=sc.nextLine();
			System.out.print("In quale sistema operativo deve funzionare?");
			sistemaOperativo=sc.nextLine();
			System.out.print("Quanto costa?");
			prezzo= Float.parseFloat(sc.nextLine());
			MobileApp app =new MobileApp(nome,sistemaOperativo,prezzo);
			  System.out.println("Ecco a te l' app:" );
			  System.out.println("-".repeat (30));
			  System.out.println("Nome: " +app.getNome() + "\nSistema Operativo:" + app.getSistemaOperativo() + "\nPrezzo: " + app.getPrezzo()+  "�");
				System.out.println("Ecco a te le operazioni : \n" + "-".repeat (30));
				do 
				{	
				System.out.println("1.Download singolo");
				System.out.println("2.Download multiplo");
				System.out.println("3.Ricevi valutazione");
				System.out.println("4.Esci");
				System.out.println("\n Quale operazione vuoi fare? ");
				scelta=sc.nextLine();
				switch(scelta)
				{
				case("1"):
					
					app.download();
					 break;
				case("2"):
					System.out.println("Quanti download vuoi fare?");
				    quantit�=Integer.parseInt(sc.nextLine());
					app.downnloadMultiplo(quantit�);
					break;
				case ("3"):
					 System.out.println("Quante stelle desideri dare ?");
				     stelle=Integer.parseInt(sc.nextLine());
				     if (stelle>0 && stelle<=5)
				     {
				     app.riceviValutazione(stelle);
				     app.ValutazioneMedia();
				     }
				     else System.out.println("Valutazione non idonea");
					break;
				}
			//	
				System.out.println(" Il ricavo � :" +  String.format("%.2f�",app.getRicavoTotale()) + "�" + " \nmedia valutazione: "+ app.getValutazioneMedia());
				System.out.println(("-".repeat(30)));
			/*System.out.println("Vuoi tornare al men� ?(si/no)");
				risposta=sc.nextLine(); */
				}while ((!scelta.equals("4")));
				System.out.println("Vuoi tornare alla creazione di un app ?(si/no)");
				risposta=sc.nextLine();
		}while (risposta.equals("si"));
		/*
		 {
		    }
		    */ 
		}
		/*for (int i =0; i< applicazioni.size();i++)
		{
			System.out.println("Nome: "  +  applicazioni.get(i).getNome());
            System.out.println("Sistema operativo:"+ applicazioni.get(i).getSistemaOperativo());
			System.out.println( "Prezzo:"  +  applicazioni.get(i).getPrezzo() + "\n");
			
			___
			public void getvalutazioneMedia() {
        if (numeroValutazioni>0) {

            mediaValutazioni=totaleValutazioni/numeroValutazioni;

            System.out.println("Valutazione media");

            for (int i=0; i<mediaValutazioni;i++)
            System.out.print("* ");


        }else { System.out.println("Non ci sono valutazioni");}
		}*/
		
		}
	


