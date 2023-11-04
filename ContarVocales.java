public class ContarVocales {
	public static void main(String[] args) {
		System.out.println(contarVocales("Hola Mundo"));
	}

	public static int contarVocales(String frase) {
		String[] letras = frase.split("");
		int cont = 0;

		for(String letra : letras) {
			if(letra.matches("[AEIOUaeiou]")) {
				cont++;
			}
		}

		return cont;
	}
}
