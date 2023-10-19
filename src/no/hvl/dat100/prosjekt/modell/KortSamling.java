package no.hvl.dat100.prosjekt.modell;

import no.hvl.dat100.prosjekt.TODO;
import no.hvl.dat100.prosjekt.kontroll.dommer.Regler;

/**
 * Struktur for å lagre ei samling kort. Kan lagre hele kortstokken. Det finnes
 * en konstant i klassen Regler som angir antall kort i hver av de 4 fargene. Når
 * programmet er ferdig settes denne til 13, men under utvikling / testing kan
 * det være praktisk å ha denne mindre.
 * 
 */
public class KortSamling {

	private final int MAKS_KORT = 4 * Regler.MAKS_KORT_FARGE;

	private Kort[] samling;
	private int antall;

	/**
	 * Oppretter en tom Kortsamling med plass til MAKS_KORT (hele kortstokken).
	 */
//	public static void main(String[] args) {
//		KortSamling a = new KortSamling();
//		
//		System.out.println(a.erTom());
//		System.out.println(a.getAntalKort());
//		
//		//a.leggTilAlle();
//		
//		System.out.println(a.erTom());
//		System.out.println(a.seSiste());
//		
//		Kort kort1,kort2,kort3;
//		
//		kort1 = new Kort(Kortfarge.Hjerter,1);
//		kort2 = new Kort(Kortfarge.Hjerter,2);
//		kort3 = new Kort(Kortfarge.Hjerter,3);
//		
//		a.leggTil(kort1);
//		a.leggTil(kort3);
//		a.leggTil(kort2);
//		
//		System.out.println(a.seSiste());
//		System.out.println();
//		var a_s = a.getSamling();
//		for (int i = 0; i < a.getAntalKort(); i++) {
//			System.out.println(a_s[i]);
//		}
//		//System.out.println(a.seSiste());
//		Kort kort = new Kort(Kortfarge.Hjerter,1);
//		System.out.println(a.har(kort));
//	}
	public KortSamling() {
		
//		// TODO - START
//		
//		throw new UnsupportedOperationException(TODO.constructor("KortSamling"));
//		// TODO - END
		samling = new Kort[MAKS_KORT];
	}

	/**
	 * Returnerer en tabell med kortene i samlinga. Tabellen trenger ikke være
	 * full. Kortene ligger sammenhengende fra starten av tabellen. Kan få
	 * tilgang til antallet ved å bruke metoden getAntallKort(). Metoden er
	 * først og fremst ment å brukes i testklasser. Om man trenger
	 * kortene utenfor, anbefales metoden getAlleKort().
	 * 
	 * @return tabell av kort.
	 */
	public Kort[] getSamling() {
		
		return samling;
		
	}
	
	/**
	 * Antall kort i samlingen.
	 * 
	 * @return antall kort i samlinga.
	 */
	public int getAntalKort() {
		
//		// TODO - START
//		
//		throw new UnsupportedOperationException(TODO.method());
//		
//		// TODO - END
		antall = 0;
		for(int i = 0; i < samling.length; i++)
		    if(samling[i] != null) {
		    	antall++;
		    }
		return antall;
	}
	
	/**
	 * Sjekker om samlinga er tom.
	 * 
	 * @return true om samlinga er tom, false ellers.
	 */
	public boolean erTom() {
		
//		// TODO - START
//				
//		throw new UnsupportedOperationException(TODO.method());
//		
//		// TODO - END
		
		if (this.getAntalKort() == 0) {
			return true;
		}
		else
			return false;
	}

	/**
	 * Legg et kort til samlinga.
	 * 
	 * @param kort
	 *            er kortet som skal leggast til.
	 */
	public void leggTil(Kort kort) {
		
//		// TODO - START
//		
//		throw new UnsupportedOperationException(TODO.method());
//		// TODO - END
				
		for(int i = 0; i < samling.length; i++)
		    if(samling[i] == null) {
		    	samling[i] = kort;
		    	break;
		    }
		
	}
	
	/**
	 * Legger alle korta (hele kortstokken) til samlinga. Korta vil være sortert
	 * slik at de normalt må stokkes før bruk.
	 */
	public void leggTilAlle() {
		
//		// TODO - START
//		// Husk: bruk Regler.MAKS_KORT_FARGE for å få antall kort per farge
//		
//		throw new UnsupportedOperationException(TODO.method());
//		// TODO - END
			for(int i = 0; i < Regler.MAKS_KORT_FARGE; i++) {
				this.leggTil(new Kort(Kortfarge.Hjerter,i+1));
				this.leggTil(new Kort(Kortfarge.Ruter,i+1));
				this.leggTil(new Kort(Kortfarge.Klover,i+1));
				this.leggTil(new Kort(Kortfarge.Spar,i+1));
			}

	}

	/**
	 * Fjerner alle korta fra samlinga slik at den blir tom.
	 */
	public void fjernAlle() {
		
//		// TODO - START
//		
//		throw new UnsupportedOperationException(TODO.method());
//		// TODO - END
		samling = new Kort[MAKS_KORT];
	}
	
	/**
	 * Ser på siste kortet i samlinga.
	 * 
	 * @return siste kortet i samlinga, men det blir ikke fjernet. Dersom samalinga er tom, returneres
	 *         null.
	 */
	public Kort seSiste() {
		
//		// TODO - START
//		
//		throw new UnsupportedOperationException(TODO.method());
//
//		// TODO - END
		Kort siste = null;
			for(int i = samling.length - 1; i >= 0; i--) {
			    if(samling[i] != null) {
			    	siste = samling[i];
			    	break;
			    }
			}
    	return siste;
	}

	/**
	 * Tek ut siste kort fra samlinga.
	 * 
	 * @return siste kortet i samlinga. Dersom samalinga er tom, returneres
	 *         null.
	 */
	public Kort taSiste() {
		
//		// TODO - START
//		
//		throw new UnsupportedOperationException(TODO.method());
//		
//		// TODO - END
		Kort ta_siste = null;
		for(int i = samling.length - 1; i >= 0; i--) {
		    if(samling[i] != null) {
		    	ta_siste = samling[i];
		    	samling[i] = null;
		    	break;
		    }
		}
	return ta_siste;
		
	}
	
	/**
	 * Undersøker om et kort finst i samlinga.
	 * 
	 * @param kort.
	 * 
	 * @return true om kortet finst i samlinga, false ellers.
	 */
	public boolean har(Kort kort) {
		
//		// TODO - START
//		
//		throw new UnsupportedOperationException(TODO.method());
//		// return false;
//		// TODO - END
		boolean har_kort = false;
		if(kort != null) {
			for(int i = samling.length - 1; i >= 0; i--) {
				if(samling[i] != null) {
				    if(samling[i].compareTo(kort) == 0) {
				    	har_kort = true;
				    	break;
				    }
			    }
			}
		}
		
		return har_kort;
	}

	/**
	 * Fjernar et kort frå samlinga. Dersom kortet ikke finnest i samlinga,
	 * skjer ingenting med samilingen
	 * 
	 * @param kort
	 *            kortet som skal fjernast. Dersom kortet ikke finnes, skjer
	 *            ingenting.
	 * @return true om kortet blev fjernet fra samlinga, false ellers.
	 */
			 
	public boolean fjern(Kort kort) {
		
//		// TODO - START
//		
//		throw new UnsupportedOperationException(TODO.method());
//
//		// TODO - END
		boolean fjernet = false;
		if(kort != null) {
			for(int i = samling.length - 1; i >= 0; i--) {
				if(samling[i] != null) {
				    if(samling[i].compareTo(kort) == 0) {
				    	fjernet = true;
				    	samling[i] = null;
				    	break;
				    }
			    }
			}
		}
		return fjernet;
		
	}

	/**
	 * Gir kortene som en tabell av samme lengde som antall kort i samlingen
	 * 
	 * @return tabell av kort som er i samlingen, der kort skal ha samme rekkefølge
	 *         som i kortsamlinga.
	 */
	public Kort[] getAllekort() {
		
//		// TODO - START
//		
//		throw new UnsupportedOperationException(TODO.method());
//
//		// TODO - END
		Kort[] allekort;
		allekort = new Kort[this.getAntalKort()];
		int num = 0;
		for(int i = 0; i < samling.length; i++) {
			if(samling[i] != null) {
				allekort[num] = samling[i];
				num++;
			}
			
		}
		return allekort;
	
	}
	
}
