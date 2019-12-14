package task51;
import java.util.Scanner;
import static java.lang.Math.*;
public class Task51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String sText = input.nextLine();
        
        System.out.print("Введите символ: ");
        String symbol = input.nextLine();
        
        char[] cArray = sText.toCharArray();
        int arrayLength = cArray.length;
        
        int newLen;
        char[] newArray;
        
        if (arrayLength %2 == 0) {
            newLen = (arrayLength / 2);
            newArray = new char[newLen];

            for (int i = 2, j = 0; i < arrayLength; i+=2, j++) { 
                newArray[j] = cArray[i];
            }
        }
        
        else {
            double floor = arrayLength / 2;
            newLen = (int) Math.floor(floor);
            
            newArray = new char[newLen];
            for (int i = 1, j = 0; i < arrayLength; i+=2, j++) { 
                newArray[j] = cArray[i];
            }
        }
        
        String newWord = "";
        for (int i = 0; i < newLen; i++) { 
            newWord += newArray[i];
        }
        newWord += symbol;
        
        System.out.println(newWord);
    }
}
