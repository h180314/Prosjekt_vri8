package no.hvl.dat100.prosjekt.modell;

import java.util.Random;

import no.hvl.dat100.prosjekt.TODO;

public class KortUtils {

	/**
	 * Sorterer en samling. Rekkefølgen er bestemt av compareTo() i Kort-klassen.
	 * 
	 * @see Kort
	 * 
	 * @param samling
	 * 			samling av kort som skal sorteres. 
	 */
//	public static void main(String[] args) {
//		Kort kort1,kort2,kort3;
//		KortSamling hand;
//		
//		hand = new KortSamling();
//		
//		kort1 = new Kort(Kortfarge.Hjerter,1);
//		kort2 = new Kort(Kortfarge.Hjerter,2);
//		kort3 = new Kort(Kortfarge.Hjerter,3);
//		
//		hand.leggTil(kort1);
//		hand.leggTil(kort3);
//		hand.leggTil(kort2);
//		
//		Kort[] sam = hand.getAllekort();
//		
//		System.out.println(sam[0]);
//		System.out.println(sam[1]);
//		System.out.println(sam[2]);
//		System.out.println();
//		KortUtils.sorter(hand);
//		
//		sam = hand.getAllekort();
//		
//		System.out.println(sam[0]);
//		System.out.println(sam[1]);
//		System.out.println(sam[2]);
//	}
	public static void sorter(KortSamling samling) {
		
//		// TODO - START
//		
//		throw new UnsupportedOperationException(TODO.method());
//		// TODO - END
		
		Kort[] sam1 = samling.getAllekort();
		boolean sorted = false;
		if (samling.erTom() == false) {
			while (sorted == false) {
				for(int i = 0; i < sam1.length - 1; i++) {
					Kort comp1 = sam1[i];
					Kort comp2 = sam1[i+1];
					if (comp1.compareTo(comp2) > 0) {
						sam1[i] = comp2;
						sam1[i+1] = comp1;
					}
				}
				int check = 0;
				for(int i = 0; i < sam1.length -1; i++) {
					if(sam1[i].compareTo(sam1[i+1]) > 0) {
						check++;
					}
				}
				if (check == 0) {
					sorted = true;
				}
			}
		}
		samling.fjernAlle();
		for(int i = 0; i < sam1.length; i++) {
			samling.leggTil(sam1[i]);
		}
	}
	
	/**
	 * Stokkar en kortsamling. 
	 * 
	 * @param samling
	 * 			samling av kort som skal stokkes. 
	 */
	public static void stokk(KortSamling samling) {
		
//		// TODO - START
//		
//		throw new UnsupportedOperationException(TODO.method());
//		// TODO - END
		
		Kort[] sam1 = samling.getAllekort();
		
		Random rand = new Random();
		
		for(int i = 0; i < sam1.length; i++) {
			int random_tall = rand.nextInt(sam1.length);
			Kort temp = sam1[random_tall];
			
			sam1[random_tall] = sam1[i];
			sam1[i] = temp;
		}
		samling.fjernAlle();
		for(int i = 0; i < sam1.length; i++) {
			samling.leggTil(sam1[i]);
		}
		
	}
	
}
