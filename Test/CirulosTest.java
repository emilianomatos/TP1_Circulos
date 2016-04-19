import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.ejemplos.Circulos;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class CirulosTest {

	@Test
	public void queElRadioDelCirculoSeCreeEnDos() {
		Circulos miCirculo = new Circulos();
		Integer valorEsperado = 2;
		Integer CirculoRadioDos = miCirculo.dameCirculoRadioDos();
		Assert.assertEquals(valorEsperado, CirculoRadioDos);
	}
	@Test
	public void queElRadioDelCirculoSeCreeEnTresComaSiete(){
		Circulos miCirculo = new Circulos();
		Double valorEsperado = 3.7;
		Double CirculoRadioTresComaSiete = miCirculo.dameCirculoRadioTresComaSiete();
		Assert.assertEquals(valorEsperado.doubleValue(), CirculoRadioTresComaSiete.doubleValue());
	}
	@Test
	public void queElRadioDelCirculoSeCreeEnCinco(){
		Circulos miCirculo = new Circulos();
		Integer valorEsperado = 5;
		Integer CirculoRadioCinco = miCirculo.dameCirculoRadioCinco();
		Assert.assertEquals(valorEsperado, CirculoRadioCinco);
	}
	@Test
	public void queElRadioDelCirculoSeCreeEnDiezComaNueve(){
		Circulos miCirculo = new Circulos();
		Double valorEsperado = 10.9;
		Double CirculoRadioDiezComaNueve = miCirculo.dameCirculoRadioDiezComaNueve();
		Assert.assertEquals(valorEsperado.doubleValue(), CirculoRadioDiezComaNueve.doubleValue());
	}
	@Test
	public void queElRadioDelCirculoSeCreeEnNueveComaOcho(){
		Circulos miCirculo = new Circulos();
		Double valorEsperado = 61.57;
		miCirculo.damePerimetroDelCiculoDeNueveComaOcho();
		
		Double CirculoRadioNueveComaOcho = miCirculo.dameCirculoRadioNueveComaOcho();
		Assert.assertEquals(valorEsperado.doubleValue(), CirculoRadioNueveComaOcho.doubleValue(),2);
	}
	@Test
	public void queElRadioDelCirculoSeCreeEnDieciseisComaSeis(){
		Circulos miCirculo = new Circulos();
		Double valorEsperado = 104.24;
		miCirculo.damePerimetroDelCirculoDeDieciseisComaSeis();
		
		Double CirculoDeRadioDieciseisComaSeis = miCirculo.dameCirculoRadioDieciseisComaSeis();
		Assert.assertEquals(valorEsperado.doubleValue(), CirculoDeRadioDieciseisComaSeis.doubleValue(),2);
	}
}
