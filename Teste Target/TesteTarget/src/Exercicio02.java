import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite um n�mero: ");
        int num = sc.nextInt();

        int[] fibonacci = new int[num + 1];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        // Calcula sequencia Fibonacci
        for (int i = 2; i <= num; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        // Confere se o numero pertence ou nao pertence a sequencia
        boolean pertence = false;
        for (int i = 0; i <= num; i++) {
            if (num == fibonacci[i]) {
                pertence = true;
                break;
            }
        }

        // Retorna se o n�mero informado pertence a sequ�ncia de Fibonacci ou n�o
        if (pertence) {
            System.out.println("O n�mero " + num + " pertence � sequ�ncia de Fibonacci");
        } else {
            System.out.println("O n�mero " + num + " n�o pertence � sequ�ncia de Fibonacci");
        }

        sc.close();
	}

}
