import java.util.Scanner;
public class Main {
    public static int[][] createArray(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = (int) (Math.random() * 201) - 100;
            }
        }
        return array;
    }
    public static void sumPositiveRows(int [][] array) {
        System.out.printf("\n");
        int i, j, k;
	int sum, ok;

	for (j = 0; j < array.length; j++) {
            ok = 1;
            sum = 0;
            for (k = 0; k < array.length; k++) {
                    if (array[k][j] < 0) {
                            ok = 0;
                            break;
                    }
                    sum += array[k][j];
            }
            if (ok > 0) {
                System.out.printf("Колонка с положительными элементами: %d, сумма: %d\n", j+1, sum);
            }
            else {
               int jPlus = j+1; 
               System.out.println("Колонка " + jPlus + " содержит отрицательные элементы"); 
            }
	}
        System.out.println();
    }
    
    public static void minDiagonalsSumElement (int [][] array) {
        int [] sums = new int [2 * array.length - 1];  
        int [] elements = new int [sums.length - 1];  
        int sum_index = 0;
        
        // в верхней треугольной
	for (int i = 0; i < array.length-1; i++) {
		int j = i;
		int k = 0;
		int sum = 0;
		while (j >= 0 && k < array.length) {
			sum += Math.abs(array[j][k]);
			j--;
			k++;
		}
                elements[sum_index] = sum;
		sums[sum_index] = sum;
		sum_index++;
	}
        
        // в нижней треугольной
	for (int i = 1; i < array.length; i++) {
		int j = array.length-1;
		int k = i;
		int sum = 0;
		while (j > 0 && k < array.length) {
			sum += Math.abs(array[j][k]);
			j--;
			k++;
		}
                elements[sum_index] = sum;
		sums[sum_index] = sum;
		sum_index++;
	}
        int elementsMin = elements[0];
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] < elementsMin) {
                elementsMin = elements[i];
            }
        }
        System.out.println("Минимум среди сумм модулей элементов диагоналей, параллельных побочной диагонали: " + elementsMin);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Укажите размер квадратной матрицы: ");
        int size = in.nextInt();
        int[][] array = createArray(size);

        System.out.print("\nМатрица:");
        for(int i = 0; i < size; i++) {
            System.out.println(" ");
            for(int j = 0; j < size; j++) {
                System.out.printf("%5d", array [i][j]);
            }
        }
        
        sumPositiveRows(array);
        minDiagonalsSumElement(array);
    }
}
