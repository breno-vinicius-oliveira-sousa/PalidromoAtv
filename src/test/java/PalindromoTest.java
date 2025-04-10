import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromoTest {

    @Test
    public void deveRetornarTrueParaPalindromoSimples() {
        assertTrue(ValidadorPalindromo.ehPalindromo("ana"));
    }

    @Test
    public void deveRetornarFalseParaNaoPalindromos() {
        assertFalse(ValidadorPalindromo.ehPalindromo("teste"));
    }
}