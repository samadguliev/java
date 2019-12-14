package wordsort;
import java.util.Scanner;
public class WordSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите слово ");
        String Str = input.nextLine();
        char[] cArray = Str.toCharArray();
        char middle;
        System.out.println("Вы ввели: " +Str);
        for (int i=0; i<cArray.length;i++) {
            for (int j=0; j<cArray.length-i-1;j++) {
                if (cArray[j] > cArray[j+1]) {
                    middle = cArray[j];
                    cArray[j] = cArray[j+1];
                    cArray[j+1] = middle;
                }
            }
        }
        System.out.print("Выходной массив: ");
        for (int i=0; i<cArray.length;i++) System.out.print(cArray[i]+" ");
        System.out.println();
    }
    
}
