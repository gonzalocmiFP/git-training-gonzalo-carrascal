public class EliminarCaracteres {
	public static void main(String[] args) {
		System.out.println("Eliminar caracteres");
		System.out.println(EliminarCaracteres.elimiar("Person"));
                System.out.println(EliminarCaracteres.elimiar("Hello"));
                System.out.println(EliminarCaracteres.elimiar("P"));
                System.out.println(EliminarCaracteres.elimiar("Peter"));
                System.out.println(EliminarCaracteres.elimiar(""));
                System.out.println(EliminarCaracteres.elimiar(null));
	}

	/** Elimina la primera y ultima letra */
	public static String eliminar(String str) {
		if (str == null || str.length() <= 1) {
			return "";
		}else {
			StringBuilder resultado = new StringBuilder(str);
			resultado.deleteCharAt(0);
			resultado.deleteCharAt(resultado.length()-1);
			return resultado.toString();
		}
	}
}
