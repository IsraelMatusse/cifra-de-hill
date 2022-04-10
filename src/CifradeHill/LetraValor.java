package CifradeHill;

public class LetraValor {
	
	// Converte uma letra a seu valor correspondente
	// e um valor a sua letra correspondente:
	// a b c ... z
	// 0 1 2 ... 25
	
	public static char asLetra(int valor) {
		return (char) ((char) (valor%25) + 97);
	}
	
	public static int asValor(char letra) {
		return letra-97;
	}

}
