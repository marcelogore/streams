package ar.com.grupoesfera.meli.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class StringTest {

    private final List<String> strings = Arrays.asList("aaa", "aab", "aac", "aba", "abb", "abc", "aca", "acb", "acc",
    		"baa", "bab", "bac", "bba", "bbb", "bbc", "bca", "bcb", "bcc",
    		"caa", "cab", "cac", "cba", "cbb", "cbc", "cca", "ccb", "ccc");
	
	@Test
    public void deberiaHaber27Items() {

		Assert.assertThat(Integer.valueOf((int) strings.stream().count()), Matchers.is(27));
    }

	@Test
    public void deberiaInvertirElOrden() {
        
        Assert.assertThat(strings.stream().sorted((a, b) -> b.compareTo(a)).toArray(), 
        		Matchers.arrayContaining("ccc", "ccb", "cca", "cbc", "cbb", "cba", "cac", "cab", "caa",
        								"bcc", "bcb", "bca", "bbc", "bbb", "bba", "bac", "bab", "baa",
        								"acc", "acb", "aca", "abc", "abb", "aba", "aac", "aab", "aaa"));
    }

	@Test
    public void deberiaSacarLosItemsQueNoTienenA() {
		
		Predicate<String> contieneA = a -> a.contains("a");

		Assert.assertThat(Integer.valueOf((int) strings.stream().filter(contieneA).count()), Matchers.is(19));
		Assert.assertThat(strings.stream().filter(contieneA).collect(Collectors.toList()), Matchers.hasItem("aaa"));
		Assert.assertThat(strings.stream().filter(contieneA).collect(Collectors.toList()), Matchers.not(Matchers.hasItem("ccc")));
    }

	@Test
    public void deberiaMostrarTodosLosItemsEnOrden() {
		
		strings.stream().forEach(a -> System.out.print(a + " - "));
    }

	@Test
    public void deberiaMostrarTodosLosItemsSinGarantizarOrden() {
		System.out.println();
		strings.stream().parallel().forEach(a -> System.out.print(a + " - "));
    }
}
