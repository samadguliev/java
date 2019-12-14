import java.util.Scanner;

public class Main {
	// Метод бинарного поиска
	public static String search(int num, int [] array) {
		return search(num, array, 0, array.length - 1);
	}
	private static String search(int num, int [] array, int lo, int hi) {
		int middle = lo + (hi - lo) / 2;
                if((middle == 0 || middle == array.length - 1) && num != array[middle]) {
                    return "В массиве нет искомого значения";
                }
                else if(num < array[middle]) {
                    return search(num, array, lo, middle - 1);
		}
		else if(num > array[middle]) {
                    return search(num, array, middle + 1, hi);
		}
		else  {
                    return "Найден элемент с номером " + middle;
		}
	} 
	public static void main(String[] args) {
	    int [] firstArray;
	    int [] secondArray;
	    int size;
	    int number;
            Scanner in = new Scanner(System.in);
	    System.out.print("Укажите размер первого массива: ");
	    size = in.nextInt();

	    // Инициализация первого массива
	    firstArray = new int[size];
	    for(int i = 0; i < size; i++){
	    	System.out.print("Введите " + (i + 1) + " элемент массива: ");
	    	number = in.nextInt();
	    	firstArray[i] = number;
		}

		System.out.print("\nУкажите размер второго массива: ");
		size = in.nextInt();

		// Инициализация второго массива
		secondArray = new int [size];
		for(int i = 0; i < size; i++){
			System.out.print("Введите " + (i + 1) + " элемент массива: ");
			number = in.nextInt();
			secondArray[i] = number;
		}

		System.out.print("\nВведите искомое число в первом массиве: ");
		int num = in.nextInt();

		// Поиск заданного значения в первом массиве методом перебора
		for(int i = 0; i < firstArray.length; i++) {
			if (firstArray[i] == num){
				System.out.println("Найден элемент с номером " + i + "\n");
				break;
			}
			else if (firstArray.length - 1 == i) {
				System.out.println("В массиве нет искомого значения\n");
			}
		}

		// Сортировка второго массива
		for(int i = 1; i < secondArray.length; i++) {
			int buffer = secondArray[i];
			int j = i - 1;
			while(j >= 0 && buffer < secondArray[j]) {
				secondArray[j + 1] = secondArray[j];
				j--;
			}
			secondArray[j + 1] = buffer;
		}

		// Поиск заданного значения во втором массиве
		System.out.print("\nВведите искомое число во втором массиве: ");
		num = in.nextInt();
		System.out.print(search(num,secondArray));

		// Сортировка первого массива методом выбора
		for(int i = 0; i < firstArray.length; i++) {
			int min = firstArray[i];
			int minPos = i;
			for(int j = i + 1; j < firstArray.length; j++) {
				if(firstArray[j] < min) {
					min = firstArray[j];
					minPos = j;
				}
			}
			if(i != minPos) {
				int buffer = firstArray[i];
				firstArray[i] = min;
				firstArray[minPos] = buffer;
			}
		}

		// Слияние массивов
		int [] combinedArray;
		combinedArray = new int [firstArray.length + secondArray.length];
		for(int i = 0; i < firstArray.length; i++) {
			combinedArray[i] = firstArray[i];
		}
		for(int j = 0, i = firstArray.length; i < firstArray.length + secondArray.length; j++, i++) {
			combinedArray[i] = secondArray[j];
		}
		
                // Поиск максимального элемента массива
                int dataLength = combinedArray.length, maxDataElem = combinedArray[0];
                for (int i = 0; i < dataLength; i++) {
                    if (combinedArray[i] > maxDataElem) {
                        maxDataElem = combinedArray[i];
                    }
                }
                System.out.println("\n Максимальный элемент массива: " + maxDataElem);
                
                // сумма элементов массива, расположенных до последнего положительного эле¬мента 
                int positiveElem = combinedArray[0], positiveElemIndex = 0;
                for (int i = 0; i < dataLength; i++) {
                    if (combinedArray[i] > 0) {
                        positiveElem = combinedArray[i];
                        positiveElemIndex = i;
                    }
                }
                //System.out.println(positiveElemIndex);
                int sumOfElements = 0;
                for (int i = 0; i < positiveElemIndex; i++) {
                    sumOfElements += combinedArray[i];
                }
                System.out.println("Сумма элементов до последнего положительного элемента: " + sumOfElements);
    }
}
