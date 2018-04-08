package fr.esiea.glpoo.Eurodroo.domaine;

import java.util.ArrayList;
import java.util.List;

public class SimpleDessinTirage implements dessinTirage{
	
	private int nbTirage;
	private int boule1;
	private int boule2;
	private int boule3;
	private int boule4;
	private int boule5;
	private int boule6;
	private int etoile1;
	private int etoile2;
	

	public SimpleDessinTirage() {
		super();
	}

	public SimpleDessinTirage(int boule1, int boule2, int boule3, int boule4, int boule5,int boule6, int etoile1,int etoile2, int nbTirage) {
		this();
		
		this.nbTirage = nbTirage;
		this.boule1 = boule1;
		this.boule2 = boule2;
		this.boule3 = boule3;
		this.boule4 = boule4;
		this.boule5 = boule5;
		this.boule6 = boule6;
		this.etoile1 = etoile1;
		this.etoile2 = etoile2;
		

	}
	

	public int getNbTirage() {
		return nbTirage;
	}


	public void setNbTirage(int nbTirage) {
		this.nbTirage = nbTirage;
		
	}

	
	public int getBoule1() {
		
		return boule1;
	}
	
	public void setBoule1(int boule1) {
		this.boule1 = boule1;
	}

	
	public int getBoule2() {
		
		return boule2;
	}

	public void setBoule2(int boule2) {
		this.boule2 = boule2;
	}

	
	public int getBoule3() {
		return boule3;
	}

	public void setBoule3(int boule3) {
		this.boule3 = boule3;
	}

	
	public int getBoule4() {
		return boule4;
	}
	
	public void setBoule4(int boule4) {
		this.boule4 = boule4;
	}

	
	public int getBoule5() {
		return boule5;
	}
	
	public void setBoule5(int boule5) {
		this.boule5 = boule5;
	}


	
	public int getBoule6() {
		return boule6;
	}
	
	public void setBoule6(int boule6) {
		this.boule6 = boule6;
	}

	
	public int getEtoile1() {
		return etoile1;
	}
	
	public void setEtoile1(int etoile1) {
		this.etoile1 = etoile1;
	}

	public int getEtoile2() {
		return etoile2;
	}
	
	public void setEtoile2(int etoile2) {
		this.etoile2 = etoile2;
	}




}
