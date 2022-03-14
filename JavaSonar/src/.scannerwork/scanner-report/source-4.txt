package main;

public class Conversion {
	public double Convert(int tool, int sens, double val) { 
		double resultat, tauxMK=1.6;
		//Outil 1 : Convertisseur de température
		if (tool == 1) {
			//Sens 1 : Celsius vers Fahrenheit
			if ((sens == 1) && (val<=500) && (val>=-100)) {
				resultat = (1.8 * val) + 32;
			} 
			//Sens 2 : Fahrenheit vers Celsius
			else if ((sens == 2) && (val<=500) && (val>=-100)) { 
				resultat = (val - 32) / 1.8;
			}
			//Autres valeurs invalides pour sens
			else {
				resultat = 0;
			}
		} 
		//Outil 2 : Convertisseur de distance
		else if (tool == 2) { 
			//Valeurs valides pour val
			if (val>0) {
				//Sens 1 : Miles vers Km
				if (sens == 1) { 
					resultat = val * tauxMK;
				} 
				//Sens 2 : Km vers Miles
				else if (sens == 2) { 
					resultat = val / tauxMK;
				}
				//Autres valeurs invalides pour sens
				else {
					resultat = 0;
				}
			}
			//Autres valeurs invalides pour val
			else {
				resultat = 0;
			}
		}
		//Autres valeurs invalides pour tool
		else {
			resultat = 0;
		}
		return resultat;
	}
	
	public int OutilTailleTemperature(String outil,String sens,int val) throws Exception {
		int result = 0;
		if(outil.equals("Temperature")) {
			if(val>=-100 & val<=500) {
			if(sens.equals("GaucheDroite")) {
				result =  (val * 9/5) + 32 ;
			}
			else {
				result = (int)((val - 32) * 5/9 );
			}
			}else {
				throw new Exception("Tempature invalide");
			}
			
		}else {
			if(val>=1) {
			if(sens.equals("GaucheDroite")) {
				result =(int) Math.round(val*1.609344);
			}
			else {
				result=(int)Math.round(val * 0.62137);
			}
			}else {
				throw new Exception("Longeur invalide");
			}
		}
		return result;
	}
}
