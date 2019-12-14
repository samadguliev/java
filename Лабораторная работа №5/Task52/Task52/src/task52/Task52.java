package task52;
import java.util.Scanner;
public class Task52 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String str = input.nextLine();
        String[] words = str.split("\\s"); 
        
        String temp;
        for(int i = 0; i < words.length-1; i += 2){
            temp = words[i];
            words[i] = words[i+1];
            words[i+1]=temp;
        }
        
        String newWord = "";
        
        for(String subStr:words) {
           newWord += subStr + " ";
        }  
        System.out.println(newWord);  
    }
}
