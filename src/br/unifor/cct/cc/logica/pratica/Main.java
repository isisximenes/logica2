import java.util.*;

import org.omg.Messaging.SyncScopeHelper;

public class Ativid7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] matriculas = { 1020, 1042, 1112, 1132, 1152, 1201, 1213, 1232, 1256, 1271 };
		String[] nomes = { "Ailton", "Marlos", "Rebeca", "Marco", "Jane", "Pedro", "Raquel", "Paulo", "Victor",
				"Mara" };
		double[] notas1 = { 7.5, 8.2, 10.0, 6.8, 8.8, 8.3, 7.2, 8.3, 7.8, 8.0 };
		double[] notas2 = { 8.9, 7.3, 9.6, 7.5, 7.4, 7.9, 8.7, 7.7, 7.7, 7.0 };
		double[] notas3 = { 6.5, 9.4, 7.1, 8.1, 9.2, 9.0, 9.8, 8.9, 8.5, 9.0 };

		ImprimirTabela(matriculas, nomes, notas1, notas2, notas3);
		MediaAlunos(nomes, notas1, notas2, notas3);
		BuscarMatricula(matriculas);
		BuscarMatriculaImprimirIndice(matriculas, nomes, notas1, notas2, notas3);

	}

	public static void ImprimirTabela(int[] matricula, String[] nome, double[] nota1, double[] nota2, double[] nota3) {
		for (int i = 0; i < nota1.length; i++) {

			System.out.printf("%d \t%s \t%1.1f \t%1.1f \t%1.1f ", matricula[i], nome[i], nota1[i], nota2[i], nota3[i]);
			System.out.println("\t");

		}
	}

	public static double MediaAlunos(String[] nome, double[] notas1, double[] notas2, double[] notas3) {
		double media = 0;

		for (int i = 0; i < notas1.length; i++) {
			for (int k = 0; k < notas1.length; k++) {

				media = (notas1[i] + notas2[i] + notas3[i]) / 3;

			}

			System.out.printf("%s\t %1.1f", nome, media);
			System.out.println("\t");
		}
		return 0;
	}

	public static boolean BuscarMatricula(int[] matricula) {
		Scanner scan = new Scanner(System.in);
		int matri;

		do {
			System.out.println("\nBusque uma matricula: ");
			matri = scan.nextInt();

			for (int i = 0; i < matricula.length; i++) {
				if (matri == matricula[i]) {

					System.out.println("Matricula: VÁLIDA");
					return true;
				}
			}
			System.out.println("Matricula: INVÁLIDA.");

		} while (matri != 0);

		return false;
	}

	public static boolean BuscarMatriculaImprimirIndice(int[] matricula, String[] nome, double[] notas1,
			double[] notas2, double[] notas3) {
		Scanner scan = new Scanner(System.in);
		int matri = 1;
		while (matri != 0) {
			System.err.println("\nInforme uma matricula: ");
			matri = scan.nextInt();
			for (int i = 0; i < matricula.length; i++) {
				if (matri == matricula[i]) {
					System.out.println(i);

				}
			}
		}

		// --

		double media = 0;
		for (int i = 0; i < notas1.length; i++) {
			for (int k = 0; k < notas1.length; k++) {
				media = (notas1[i] + notas2[i] + notas3[i]) / 3;
			}
		}
		// --

		do {
			System.out.println("\nInforme uma matricula: ");
			matri = scan.nextInt();

			for (int i = 0; i < matricula.length; i++) {
				if (matri == matricula[i]) {
					System.out.printf("%s \t %1.1f \t", nome[i], media);
					System.out.println("\t");
					return true;
				}
			}
			System.out.println("Matrícula inválida.");
		} while (matri != 0);
		return false;

	}

}
