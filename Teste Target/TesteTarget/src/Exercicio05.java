
public class Exercicio05 {

	public static void main(String[] args) {
        String normal = "meContrata";
        String invertida = "";

        for (int i = normal.length() - 1; i >= 0; i--) {
            invertida += normal.charAt(i);
        }

        System.out.println("String original: " + normal);
        System.out.println("String invertida: " + invertida);

	}

}
