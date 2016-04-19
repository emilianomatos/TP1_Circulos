package ar.edu.unlam.ejemplos;

public class Circulos {
	private Integer CirculoRadioDos = 2;
	private Double CirculoRadioTresComaSiete = 3.7;
	private Integer CirculoRadioCinco = 5;
	private Double CirculoRadioDiezComaNueve = 10.9;
	private Double CirculoRadioNueveComaOcho = 9.8;
	private Double CirculoRadioDieciseisComaSeis = 16.6;
	
	public Integer dameCirculoRadioDos(){
		return CirculoRadioDos;
	}
	public Double dameCirculoRadioTresComaSiete(){
		return CirculoRadioTresComaSiete;
	}
	public Integer dameCirculoRadioCinco(){
		return CirculoRadioCinco;
	}
	public Double dameCirculoRadioDiezComaNueve(){
		return CirculoRadioDiezComaNueve;
	}
	
	
	public Double dameCirculoRadioNueveComaOcho(){
		return CirculoRadioNueveComaOcho;
	}
	public void damePerimetroDelCiculoDeNueveComaOcho(){
		CirculoRadioNueveComaOcho = CirculoRadioNueveComaOcho * 2 * 3.14;
	}
	
	public Double dameCirculoRadioDieciseisComaSeis(){
		return CirculoRadioDieciseisComaSeis;
	}
	public void damePerimetroDelCirculoDeDieciseisComaSeis(){
		CirculoRadioDieciseisComaSeis = CirculoRadioDieciseisComaSeis * 2 * 3.14;
	}
}
