package fr.esiea.glpoo.Eurodroo.domaine;

public enum FormeDessin {
	
	CARRE("car", "Carre", false), 
	RECTANGLE("rec", "Rectangle", false), 
	TRIANGLE("tri","Triangle", true), 
	LOSANGE("los", "Losange", false);
	
	private final String code;
	private final String label;
	private final boolean plein;

	private FormeDessin(String code, String label, boolean plein) {
		this.code = code;
		this.label = label;
		this.plein = plein;
	}
	
	public static FormeDessin valueOfByCode(final String code){
		for(final FormeDessin forme : values()) {
			if(forme.code.equals(code)) {
				return forme;
			}
		}
		throw new IllegalArgumentException("forme inexistante");
	}

	public String getCode() {
		return code;
	}

	public String getLabel() {
		return label;
	}

	public boolean isPlein() {
		return plein;
	}	
	
}
