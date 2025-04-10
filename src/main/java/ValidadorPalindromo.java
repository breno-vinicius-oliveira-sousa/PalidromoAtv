import java.text.Normalizer;

public class ValidadorPalindromo {

    public static boolean ehPalindromo(String frase) {
        if (frase == null || frase.isBlank()) return false;

        String normalizada = Normalizer.normalize(frase, Normalizer.Form.NFD)
                .replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");

        String limpa = normalizada.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reverso = new StringBuilder(limpa).reverse().toString();
        return limpa.equals(reverso);
    }
}