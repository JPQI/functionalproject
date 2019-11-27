package pe.demo.functional.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

public class BasicExamples {

	@Test
    public void ex01_acumulaPrimerasLetras() {
        List<String> input = Arrays.asList("alfa", "bravo", "charlie", "delta", "echo", "foxtrot");
        
        StringBuilder sb = new StringBuilder();
        input.forEach(s -> sb.append(s.charAt(0)));
        String result = sb.toString();
        
        assertEquals("abcdef", result);
    }
	@Test
    public void ex02_removePalabrasTamanioMenor4() {
        List<String> list = new ArrayList<>(Arrays.asList(
            "alfa", "bravo", "charlie", "delta", "echo", "foxtrot"));
        
        list.removeIf(s -> (s.length() > 4) );
        
        assertEquals("[alfa, echo]", list.toString());
    }
	@Test
    public void ex03_uppertTodasLasPalabras() {
        List<String> list = new ArrayList<>(Arrays.asList(
            "alfa", "bravo", "charlie", "delta", "echo", "foxtrot"));
        
        list.replaceAll(s -> s.toUpperCase());
        
        assertEquals("[ALFA, BRAVO, CHARLIE, DELTA, ECHO, FOXTROT]", list.toString());
    }
	@Test
    public void ex04_generarMapaLongitudesPalabras() {
		List<String> list = Arrays.asList(
	            "alemania", "belgica", "colombia"/*,
	            "argentina", "brasil", "chile",
	            "andorra", "bolivia", "canada"*/);
		
		Map<String, Integer> result = new TreeMap<>();
		
		list.forEach(s -> result.merge(s.substring(0, 1), s.length(), Integer::sum));
		
		assertEquals("{a=8, b=7, c=8}", result.toString());
		
	}
}
