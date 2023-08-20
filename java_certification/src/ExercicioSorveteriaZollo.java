import java.util.*;

public class ExercicioSorveteriaZollo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de sorvetes vendidos hoje: ");
        int qtdeCasquinhas = sc.nextInt();
        System.out.print("Digite o faturamento de hoje (R$): ");
        double faturamento = sc.nextDouble();
        System.out.println();

        // Definindo as equações do sistema linear
        double[][] coefficients = {
            {1, 1, qtdeCasquinhas},
            {1, 0.5, faturamento},
        };
        
        // Definindo os termos constantes das equações
        double[] constants = {
            qtdeCasquinhas,
            faturamento
        };

        // Resolvendo o sistema linear
        double[] solution = solveLinearSystem(coefficients, constants);

        // Exibindo o resultado
        System.out.print("Hoje você vendeu:");
        for (int i = 0; i < solution.length; i++) {
            if (isNegativeZero(solution[i])) {
                solution[i] = 0.0; // Converte -0 para 0
            }
            if (i > 0) {
                System.out.print(" e ");
            }
            System.out.printf("%.0f sorvetes de R$ %.2f", solution[i], i == 0 ? 1.0 : 0.50);
        }
        System.out.println("!!!");
        sc.close();
    }
	
    // Verifica se um valor é -0
    public static boolean isNegativeZero(double value) {
        return value == 0.0 && Double.doubleToRawLongBits(value) == Double.doubleToRawLongBits(-0.0);
    }

    // Resolve um sistema linear
    public static double[] solveLinearSystem(double[][] coefficients, double[] constants) {
        int n = coefficients.length;  // Número de equações/variáveis
        for (int pivotRow = 0; pivotRow < n; pivotRow++) {
            // Encontra o elemento pivô e troca as linhas, se necessário
            int maxRow = pivotRow;
            for (int i = pivotRow + 1; i < n; i++) {
                if (Math.abs(coefficients[i][pivotRow]) > Math.abs(coefficients[maxRow][pivotRow])) {
                    maxRow = i;
                }
            }
            double[] tempCoeff = coefficients[pivotRow];
            coefficients[pivotRow] = coefficients[maxRow];
            coefficients[maxRow] = tempCoeff;

            double tempConst = constants[pivotRow];
            constants[pivotRow] = constants[maxRow];
            constants[maxRow] = tempConst;

            // Realiza operações de linha para eliminar as variáveis abaixo do pivô
            for (int i = pivotRow + 1; i < n; i++) {
                double factor = coefficients[i][pivotRow] / coefficients[pivotRow][pivotRow];
                for (int j = pivotRow; j < n; j++) {
                    coefficients[i][j] -= factor * coefficients[pivotRow][j];
                }
                constants[i] -= factor * constants[pivotRow];
            }
        }

        // Substituição retroativa para encontrar a solução
        double[] solution = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            double sum = 0.0;
            for (int j = i + 1; j < n; j++) {
                sum += coefficients[i][j] * solution[j];
            }
            solution[i] = (constants[i] - sum) / coefficients[i][i];
        }

        return solution;
    }
}